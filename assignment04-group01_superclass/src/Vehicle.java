public abstract class Vehicle
{
	
	private boolean wiper_active; 
	protected boolean[] doors; 
	protected boolean trunk_open;
	
	public void toggle_wiper()  //m
	{// wiper_active = Q!
			if (wiper_active)
				System.out.println(wiper_active=false);
			else
				System.out.println(wiper_active=true);
	} 

	public boolean getWiperState()  //getter //constructor is present in this class to initialize the wiper_active
	{
		return wiper_active;
	}

	public int getNumberOfDoors()  //getter 
	{
		return doors.length;
	}

	public boolean getDoorState(int door) //getter
	{
			return doors[door];
	}

	public boolean getTrunkState()  //constructor is present in this class to initialize the trunk_open 
	{
		return trunk_open;
	}

	public abstract void unlockAllDoors(); 
	public abstract void lockAllDoors(); 

	public Vehicle(boolean wiperState, boolean trunkState) // constructor
	{
		this.wiper_active=wiperState;
		this.trunk_open=trunkState;
	}

}
