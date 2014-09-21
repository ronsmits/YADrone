package de.yadrone.base.command;

/**
 * While in multiconfiguration, this command must be send before every configure command. The configuration will only be
 * applied if the ids match the current ids on the Drone.
 */
public class ConfigureIdsCommand extends ATCommand {
    protected String sessionId;
    protected String userId;
    protected String applicationId;

    public ConfigureIdsCommand(final String sessionId, final String userId, final String applicationId) {
        super();
        this.sessionId = sessionId;
        this.userId = userId;
        this.applicationId = applicationId;
    }

    @Override
    protected String getID() {
        return "CONFIG_IDS";
    }

    @Override
    protected Object[] getParameters() {
        return new Object[] {sessionId, userId, applicationId};
    }
}
