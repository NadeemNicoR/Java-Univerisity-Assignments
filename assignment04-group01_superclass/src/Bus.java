public class Bus extends Vehicle implements Trunk
{
	/*
	 * Inheritance is a process of defining a new class based on an existing class by extending its common data members
	 *  and methods. Inheritance allows us to reuse of code, it improves reusability in your java application.
	 * */
	public void unlockAllDoors()
	{
		for(int i=0;i<doors.length;i++)
		{
			doors[i]=false;
			System.out.println("current status of door "+i+" is "+doors[i]);
		}
	}
	public  void lockAllDoors()
	{
		for(int i=0;i<doors.length;i++)
		{
			doors[i]=true;
			System.out.println("current status of door" +i+" is "+doors[i]);
		}
	}
	public Bus(boolean wiperState, boolean trunkState) 
	{
		super(wiperState, trunkState);
		doors= new boolean[2];
	}
	@Override
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
