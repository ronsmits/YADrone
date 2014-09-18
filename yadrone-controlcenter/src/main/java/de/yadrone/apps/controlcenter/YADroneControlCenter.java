package de.yadrone.apps.controlcenter;

import de.yadrone.base.ARDrone;


public class YADroneControlCenter
{	
	private ARDrone ardrone=null;
	
        public YADroneControlCenter(String ipaddress) {
            initialize(ipaddress);
        }
	public YADroneControlCenter(){
		initialize("");
	}
	
	private void initialize(String ipaddress){
		try
		{
			if (ipaddress=="")
                            ardrone = new ARDrone();
                        else 
                            ardrone = new ARDrone(ipaddress);
                        
			System.out.println("Connect drone controller");
			ardrone.start();
			
			new CCFrame(ardrone);
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
			
			if (ardrone != null)
				ardrone.stop();
			System.exit(-1);
		}
	}
		
	public static void main(String args[]){
            if (args.length==1)
                new YADroneControlCenter(args[0]);
            else
)		new YADroneControlCenter();
	}
}