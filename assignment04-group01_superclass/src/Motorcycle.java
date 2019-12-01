public class Motorcycle extends Vehicle
{
	public void unlockAllDoors()
	{
		for(int i=0;i<doors.length;i++)
		{
			doors[i]=false;
		}
	}
	
	public  void lockAllDoors()
	{
		for(int i=0;i<doors.length;i++)
		{
			doors[i]=true;
		}
		
	}
	public Motorcycle(boolean wiperState, boolean trunkState) 
	{
		super(wiperState, trunkState);
		doors=new boolean[0];// calling the constructor of a parent class Vehicle	
	}

}
