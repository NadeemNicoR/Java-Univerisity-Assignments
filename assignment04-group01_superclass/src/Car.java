public class Car extends Vehicle implements Trunk
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
	
	public Car(boolean wiperState, boolean trunkState) 
	{
		super(wiperState, trunkState);
		doors= new boolean[4];
	}

	public void openTrunk()
	{// open trunk is only supposed to open trunk... it should NOT close it
		if (trunk_open==false)
			trunk_open=true;
		
	}
	@Override
	public void closeTrunk()
	{
		if(trunk_open==true)
			trunk_open=false;
	}
}
