
/**
 * Main class of the Java program. 
 * 
 */
import java.math.BigInteger;
import java.util.Scanner;


public class Main  {
	static int counter = 0;
	public static BigInteger facRec(int n)
	{
		BigInteger m = BigInteger.valueOf(n);
		BigInteger result;
		if (n == 0)
			return BigInteger.valueOf(1); // converting int to BigInt as the return type is BigInt!
		else {
				result = m.multiply(facRec(n - 1));	
			 }
		return result;
	}

	public static BigInteger facIter(int n) {

		int counter = 0;
		BigInteger m = BigInteger.valueOf(n);
		BigInteger fact = BigInteger.valueOf(1); // BigInteger.valueOf(1)
		BigInteger i;
		if (n == 0)
			return BigInteger.ONE;
		else {
			for (i = BigInteger.ONE; i.compareTo(m) <= 0; i = i.add(BigInteger.ONE)) {
				fact = fact.multiply(i);
				counter++; 
				System.out.println("iteration number "+counter);
				System.out.println("value of fact "+fact);
			}
			System.out.println("the number of iterations performed to calculate the factorial of " + m
					+ " by iterative function are " + counter);
			return fact;
		}
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value for which the factorial needs to be determined");
		int k = s.nextInt();
		System.out
				.println("------------------------------------------------------------------------------------------");
		System.out.println("factorial of " + k + " by recursive function is" + facRec(k));
		System.out
				.println("------------------------------------------------------------------------------------------");
		System.out.println("factorial of numbers 1 to 15 are as below :");
		for (int i = 1; i <= 15; i++) {
			System.out.println("!" + i + "=" + facRec(i));
		}
		System.out.println("facRec(5) is" + facRec(5));
		/*
		 * in facRec(5); at first, return value will be (5*facRec(5-1)) 
		 * 5*factRec(4) [same method is being called with a modified parameter]
		 * in facRec(4) return = (5*(4*fact(3))) 
		 * in facRec(3) return = 5*(4*(3*fact(2)))
		 * in facRec(2) return = 5*(4*(3*(2*fact(1))))
		 * in facRec(1) return = 5*(4*(3*(2*(1*fact(0)))))
		 * when facRec(0) is reached the method reaches the base/guard case and thus returns the value 1
		 * now result has value = 5! which is returned to the method
		 */

		System.out.println("------------------------------------------------------------------------------------------");
		System.out.print("Factorial of " + k + " using iterative function is " + facIter(k) + "\n");
		System.out
				.println("------------------------------------------------------------------------------------------");
		System.out.print("Factorial of 23 using recursive function is " + facRec(23) + "\n");
		System.out
				.println("------------------------------------------------------------------------------------------");
		System.out.print("Factorial of 23 using iterative function is " + facIter(23) + "\n");
		System.out
				.println("------------------------------------------------------------------------------------------");
		System.out.println("enter the hour value");
		int h=s.nextInt(); // scanning hour
		System.out.println("enter the minute value");
		int m=s.nextInt(); // scanning minute
		Clock c1=new Clock(h,m);
		System.out.println(c1.toString());
		System.out.println("enter the minute value");
		int min2=s.nextInt();
		Clock c2=new Clock(min2);
		System.out.println(c2.toString());
		Clock c3= new Clock("03:50");
		System.out.println(c3.toString());
		System.out.println("enter the value of the minutes that needs to be added to the currect clock");
		int min=s.nextInt();
		Clock c4 = c1.add(min);
		Clock c5 = c1.add(c2);
		System.out.println("--------------------------------------------------------------------------------------");
		Food[] Foods = {new Food(15, "Banana"), new Food(8,"Carrot"), new Food(15, "orange")};
    	System.out.println("Food object: calories");
    	for (Food F:Foods)
    		System.out.println(F.toString());
    	System.out.println("checking compareTo()");
    	int comp = Foods[0].compareTo(Foods[1]);
    	int comp1 = Foods[1].compareTo(Foods[2]);
    	int comp2 = Foods[0].compareTo(Foods[2]);
    	System.out.println("Comparing object 1 with 2 :"+comp);
    	System.out.println("Comparing object 2 with 3 :"+comp1);
    	System.out.println("Comparing object 1 with 3 :"+comp2);
    	System.out.println("--------------------------------------------------------------------------------------");
    	Food[] SortArray = Food.createSortedRandomList();
    	System.out.println("Sorted array ");
    	for(Food S:SortArray)
    	{
    		System.out.println(S.toString());
    	}
		s.close();
	}
}
