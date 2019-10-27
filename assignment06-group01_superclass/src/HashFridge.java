import java.util.Arrays;

public class HashFridge
{
	private Food[] food;
	private int capacity;
	private int[] table;  
	private int amount =0;
	
	public HashFridge() 
	{

	}
	public HashFridge(int cap) 
	{
		this.capacity=cap;
		food =new Food[cap];
		table= new int[cap];
	}

	public void insert(Food obj, int value) 
	{
		int hIndex=obj.hashCode()%this.capacity;
		int tempIndex = hIndex;
		while(true) {
			if(hIndex<capacity && food[hIndex]==null) { // the array element is empty (default for object type==null)
				food[hIndex]=obj;
				table[hIndex] = value;
				break;
			}
			else if(hIndex<capacity && food[hIndex].equals(obj)) {
				table[hIndex]+=value;
				break;
			}
			else 
			{
				++hIndex;
				if(hIndex > capacity -1) {
					// if hindex reaches end make it zero
					hIndex%=capacity;
				}
				else if(hIndex==tempIndex) {
					System.out.println("Array full!");
					break;
				}	
			}
		}

	}

	public int search(Food obj) 
	{
		for(int i=0;i<food.length;i++)
		{
			if(food[i]!=null && food[i].equals(obj)) 
				return table[i];
		} 
		return -1;
	}
	
	public void printAll(){
		System.out.println("Food Object: "+Arrays.toString(food));
		System.out.println("values: "+Arrays.toString(table));
	}

	public int remove(Food obj, int value) 
	{
		for(int i=0;i<food.length;i++)
		{
			if(food[i]!=null && food[i].equals(obj)) 
			{
				if(value<table[i])
				{
					table[i]-=value;
					return table[i];
				}
				else if(value == table[i])
				{
					food[i] = null;
					table[i] = -1;
					return table[i];
				}
			}
		}

		return -1;
	}
}
