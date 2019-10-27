import java.util.*;

public class Food implements Comparable<Food> 
{

	private String name;
	private int calories;
	
	public Food(int calories, String name) 
	{
			this.name = name;
			this.calories = calories;
	}

	public int compareTo(Food o)
	{
		int strleno = o.name.length(); //string length of passed object
		int strlencurrent = this.name.length(); //string length of current object
		if(strlencurrent*getCalories() > strleno*o.getCalories())
		{
			return 1;
		}
		else if(strlencurrent*getCalories() < strleno*o.getCalories())
		{
			return -1;
		}
		else return 0;
	}

	public int getCalories()
	{
		return calories;	
	}

	public static Food[] createSortedRandomList() 
	{
		String namesList[]={"Apple","Orange","Cookie","Banana","Almond","Egg","Musli","Bread","Carrot","Potato"};
		int caloriesList[]={10,20,300,40,50,60,15,159,4,250};

		int arraySize=(int)(Math.random()*100+1);
        Food Foodlist[] = new Food[arraySize];
        for (int i=0; i<arraySize; i++)
        {
//        	int j = (int)(Math.random()*caloriesList.length);
        	Food F = new Food(caloriesList[(int)(Math.random()*caloriesList.length)], namesList[(int)(Math.random()*namesList.length)]);
//        	Food F = new Food(caloriesList[j], namesList[j]);
        	Foodlist[i]=F;
        }
        
        Arrays.sort(Foodlist);
        return Foodlist;
	}

	public String toString() 
	{
		 //your implementation goes here
		return name + ":" + getCalories();
	}
}
