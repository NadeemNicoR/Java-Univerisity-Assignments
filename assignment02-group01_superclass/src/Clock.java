public class Clock 
{
	  private int hour;
	  private int minute;
	public Clock(int hour, int minute) 
	{
       this.hour=hour;
       this.minute=minute;
       //System.out.println("hour "+hour);
       //System.out.println("minute "+minute);
	}
	public Clock(int minute) 
	{
		this.hour = minute/60;
		System.out.println(this.hour);
		this.minute= minute%60;
		System.out.println(this.minute);
       //System.out.println("minute only "+minute);
	}

	public Clock(String hourmin) 
	{
		String [] hourmin1= hourmin.split(":");
		this.hour= Integer.valueOf(hourmin1[0]);
		this.minute= Integer.valueOf(hourmin1[1]);
		//System.out.println("hour:min= "+hourmin);
	}
	public int getMin() 
	{
       return minute;
	}
	
	public int getH() 
	{
       return hour;
	}
	
	public Clock add(int min) 
	{	
		int update_min = this.minute + min%60;
		int update_hour = this.hour + min/60;
		if(update_min>=60)
		{
			update_hour++;
			update_min=update_min%60;
				
		}
		if (update_hour>=24)
		{
			update_hour=update_hour%24;
		}
		Clock N = new Clock(update_hour, update_min);
		System.out.println("updated hour and time is ");
		System.out.printf("%02d",update_hour);
		System.out.print(":");
		System.out.printf("%02d",update_min);
		System.out.println("\n");
		return N;
	}
	public Clock add(Clock c) 
	{
		int update_min = this.minute + c.minute;
		int update_hour = this.hour + c.hour;
		if(update_min>=60)
		{
			update_hour++;
			update_min=update_min%60;
				
		}
		if (update_hour>=24)
		{
			update_hour=update_hour%24;
		}
		Clock N = new Clock(update_hour, update_min);
		System.out.println("updated hour and time is ");
		System.out.printf("%02d",update_hour);
		System.out.print(":");
		System.out.printf("%02d",update_min);
		System.out.println("\n");
		return N;
	}
	public String toString() 
	{
		
        String hs=String.format("%02d",getH());
		String ms=String.format("%02d",getMin());
		String hs_ms=hs+":"+ms;
		System.out.println("clock in HH:MM format: ");
		return hs_ms;
	}
}

