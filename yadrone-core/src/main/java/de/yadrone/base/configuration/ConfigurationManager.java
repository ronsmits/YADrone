/*
 *
  Copyright (c) <2011>, <Shigeo Yoshida>
All rights reserved.

Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:

Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
The names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package de.yadrone.base.configuration;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.SocketTimeoutException;

import org.apache.log4j.Logger;

import de.yadrone.base.command.CommandManager;
import de.yadrone.base.command.ControlCommand;
import de.yadrone.base.command.ControlMode;
import de.yadrone.base.exception.ConfigurationException;
import de.yadrone.base.exception.IExceptionListener;
import de.yadrone.base.manager.AbstractTCPManager;
import de.yadrone.base.utils.ARDroneUtils;

// TODO consider to connect to the control port permanently
public class ConfigurationManager extends AbstractTCPManager {
    private static final Logger LOG = Logger.getLogger(ConfigurationManager.class);

    private final IExceptionListener excListener;

    private CommandManager manager = null;

    public ConfigurationManager(final InetAddress inetaddr, final CommandManager manager,
            final IExceptionListener excListener) {
        super(inetaddr);
        this.manager = manager;
        this.excListener = excListener;
    }

    @Override
    public void run() {
        try {
            connect(ARDroneUtils.CONTROL_PORT);
        } catch (final Exception exc) {
            LOG.trace("Exception: " + exc);
            excListener.exeptionOccurred(new ConfigurationException(exc));
        }
    }

    /**
     * Note: not thread-safe!
     */
    private String getControlCommandResult(final ControlMode p1, final int p2, final ConfigurationListener listener) {
        manager.setCommand(new ControlCommand(p1, p2));

        final Thread t = new Thread() {

            @Override
            public void run() {
                try {

                    final InputStream inputStream = getInputStream();
                    // TODO better getInputStream throw IOException to fail
                    if (inputStream != null) {
                        final byte[] buf = new byte[1024];
                        int n = 0;
                        final StringBuilder builder = new StringBuilder();
                        try {
                            while ((n = inputStream.read(buf)) != -1) {
                                // output: multiple rows of "Parameter = value"
                                builder.append(new String(buf, 0, n, "ASCII"));
                            }
                        } catch (final SocketTimeoutException e) {
                            // happens if the last byte happens to coincide with the end of the buffer
                            LOG.trace("SocketTimeoutException: " + e);
                        }
                        final String s = builder.toString();
                        if (listener != null) {
                            listener.result(s);
                        }
                    }
                } catch (final IOException e) {
                    LOG.trace("IOException: " + e);
                }
            }
        };
        t.start();
        return "";

    }

    public String getCustomCofigurationIds(final ConfigurationListener listener) {
        final String s = getControlCommandResult(ControlMode.CUSTOM_CFG_GET, 0, listener);
        return s;
    }

    public String getPreviousRunLogs(final ConfigurationListener listener) {
        final String s = getControlCommandResult(ControlMode.LOGS_GET, 0, listener);
        return s;
    }

    public String getConfiguration(final ConfigurationListener listener) {
        final String s = getControlCommandResult(ControlMode.CFG_GET, 0, listener);
        return s;
    }

}
