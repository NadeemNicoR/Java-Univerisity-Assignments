/**
 * Main class of the Java program. 
 * 
 */
import java.util.Arrays;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

import java.lang.Math;


public class Main {
    
    public static boolean isPrime(int n) 
    {
    	if (n==1 || n==0)
    	{
    	//1System.out.println("0 and 1 are neither prime nor composite!");
    	return false;
    	}
    	else
    	{
    		for (int i =2;i<n; i++)
        		{
    				if (n%i==0)
    				{
    				    return false;
    				}
        		}	 
    		return true;	
        }	
    }
   

    public static int nextPrime(int n) 
    {
    	boolean b= Main.isPrime(n);
    	if (b==true)
    	{
    		System.out.println("since the inputed number is a prime already thus the smallest prime is the same number");	
    		return n;
    	}
    	else
    	{
    		int temp=n+1;
    		while (true)					//while runs the below code untill isPrime(temp) reaches true
    		{
    			if(isPrime(temp)==true) break;
  
    			temp++;
    		}
    		System.out.println("the next nearest prime is ");
    		return temp;
    	}
    }
    
    public static int median(int a, int b, int c) 
    {
        if( ((a>=b) && (a<=c)) || ((a>=c && a<=b)) )
        {
        	
        	return a;
        }
        
        else if( ((b>=a) && (b<=c)) || ((b>=c) && (b<=a)) )
        {
        	
        	return b;       
        }
        else
        {
        
        	return c;
        }
    }
  
    public static int median2(int a, int b, int c) 
    {
        if(a>b)
        {
        	int temp =b;
        	b=a;
        	a=temp;
        }
         if (b>c)
        	{
        		int temp=c;
        		c=b;
        		b=temp;        	
        	}
         if(a>b)
        	{
        		int temp =b;
        		b=a;
        		a=temp;
        	}
       
        return b;
    }
   
    public static int[] createRandom (int n)  
    {
    	Scanner s=new Scanner(System.in);
        int[] a =new int [n];
        int i=0;
        System.out.println("enter the value of randMin");
        int randMin=s.nextInt();
        System.out.println("enter the value of randMax");
        int randMax=s.nextInt();
        int range= randMax-randMin+1;
        for ( i=0;i<n;i++)
        {
        	for(int j=randMin;j<=randMax;j++)
        	{
        		a[i]= (int) (Math.random()*range)+randMin; //TYPE CASTING
        	}
        }
        return a;
     }
    
    public static String toString(int[] a)
    {
    	int i=0;
    	String b[]=new String[a.length];
		for(i=0;i<a.length;i++)
		{
			b[i]= String.valueOf(a[i]);
		}
		//c=String.join(", ", b)
		String c2=String.format("[%s]",String.join(", ", b));
		return c2;
		
    }
    public static int posMin (int[] a) 
    {
    	int min=a[0]; //1st element is 
    	int i=0;
    	int temp=0;
    	for(i=1;i<a.length;i++) 
    	{
    		if(min>a[i])
    		{
    			min=a[i];		// min updated with the smallest value and then compared back from if statement
    			temp= i;
    		}
    	}
        return temp ;
    	
    }
   
    public static void swap (int[] a) 
    {
    	int temp=0;
    	temp=a[0];
        a[0]=a[a.length-1];
        a[a.length-1]=temp;
        System.out.println("swapped array is");
        System.out.println(Arrays.toString(a));
    }
  
    public static void main(String[] args) 
    {
       Scanner s=new Scanner(System.in);
       System.out.println("enter the input value to check if its a prime or not");
       int k= s.nextInt();
       System.out.println("is the input value a prime number?");
       System.out.println(isPrime(k));
       System.out.println(nextPrime(k));
       System.out.println("*******************************************************");
       System.out.println("enter 3 input values for which the mediam needs to be determined");
       int l= s.nextInt();
       int m= s.nextInt();
       int n= s.nextInt();
       System.out.println("the median of all the 3 input value by method one is ");
       System.out.println(median(l,m,n));
       System.out.println("the median of all the 3 input values by method 2 is");
       System.out.println(median2(l,m,n));
       System.out.println("to test if the median value determined is corret enter the expected median value");
       /*void test()
       {
    	   Main testObj=new Main();
           int actual_output= testObj.median(1,2,3);
           assertEquals(2, actual_output));
       }
       */
       System.out.println("*******************************************************");
       System.out.println("enter the size of array for which the random integer array elements need to be printed");
       int o= s.nextInt();
       int a[]= createRandom(o);
       		for(int i=0;i<a.length;i++)
       		{
       			System.out.println(a[i]);
       		}
       
       System.out.println("*******************************************************");
       
  
       System.out.println("O/P of selfCoded toString()");
       System.out.println(toString(a));
       System.out.println("output using toString() of class Arrays");  
       String test =Arrays.toString(a);
       System.out.println(test);
       System.out.println("are the elements of self coded toString() similar to the inbult toString()");
       String test1=toString(a); 
       boolean result= test.equals(test1);;
       System.out.println(result);
       System.out.println();
       System.out.println("*******************************************************");
       System.out.println("the index of array carrying smallest value is ");
       System.out.println(posMin(a));
       System.out.println("*******************************************************");
       swap(a);
       s.close();
    }
}

