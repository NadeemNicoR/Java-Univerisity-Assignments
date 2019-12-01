/**
 * Main class of the Java program. 
 * 
 */
import java.util.*;
public class Main extends Bus
{
	
	public Main(boolean wiperState, boolean trunkState) {
		super(wiperState, trunkState);
		// TODO Auto-generated constructor stub
	}

	public static boolean isPalindrome (String str) 
	{
		String allLowerCase =str.toLowerCase();
		Stack<Character> originalStack=new Stack<>();
		Stack<Character> copyStack=new Stack<>();
		Stack<Character> reversedStack=new Stack<>();//what does this mean
		for(int i=0;i<str.length();i++)
		{
			if((allLowerCase.charAt(i) >= 'a' && allLowerCase.charAt(i) <= 'z') ||
					(allLowerCase.charAt(i) >= 'A' && allLowerCase.charAt(i) <= 'Z'))
			{
				originalStack.push(allLowerCase.charAt(i));
				copyStack.push(allLowerCase.charAt(i));
			}
		}
		while(copyStack.isEmpty()==false)
		{
			reversedStack.push(copyStack.pop());
		}
		System.out.println(originalStack);
		System.out.println(reversedStack);
		System.out.print("is the input a palindrome --");
		return (originalStack.equals(reversedStack));

	}

	public static void main(String[] args) 
	{
		Bus benz=new Bus(true,false);
		System.out.println("Initial WiperState of benz is "+benz.getWiperState());
		System.out.println("Initial trunk state of benz is "+benz.getTrunkState());
		System.out.print("Toggled state of wiper is ");
		benz.toggle_wiper();
		System.out.println("Number of doors are "+benz.getNumberOfDoors());
		System.out.println("initial Status of door 0: "+benz.getDoorState(0)+", initial Status of door1: "+benz.getDoorState(1));
		benz.lockAllDoors();
		System.out.println("------------------------------------------------------------------------------------------------");
		LinkedNode<String> LN = new LinkedNode<String>();
		LN.add("sleeping late");
		LN.add("attending a party");
		LN.add("going to bed");
		System.out.println("First Linkedlist:");
		System.out.println(LN.toText());
		LN.add("visit the canteen");
		LN.add("attend a lecture");
		LN.add("eat lunch");
		LN.add("do the assignment");
		LN.add("drink beer and watch movie");
		System.out.println("First Linkedlist after apeending new Nodes:");
		System.out.println(LN.toText());
		System.out.println("------------------------------------------------------------------------------------------------");
		LinkedNode<String> Week = new LinkedNode<String>();
		Week.add("Monday");
		Week.add("Wednesday");
		Week.add("Friday");
		System.out.println("Second Linkedlist:");
		System.out.println(Week.toText());
		Week.insert(Week.find("Monday"), "Tuesday");
		Week.insert(Week.find("Wednesday"), "Thursday");
		System.out.println("Second Linkedlist after apeending new Nodes in calendrical order:");
		System.out.println(Week.toText());
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("Was it a car or a cat I saw?"));
		System.out.println(isPalindrome("Dammit, I’m mad!"));
		System.out.println(isPalindrome("I am Not the greatest"));
	}
}