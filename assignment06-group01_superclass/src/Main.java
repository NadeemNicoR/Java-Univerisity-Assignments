import static org.junit.Assert.assertTrue;

/**
 * Main class of the Java program.
 * 
 */

public class Main {

	public static void main(String[] args) {
		// test your implementation here
		int[] InputArray = new int[1000]; 
		for (int i = 0; i < 1000; i++) {
			InputArray[i] = (int) (Math.random() * 1000) + 1;
		} 
		HashLinQuad linHashTable = new HashLinQuad(1249);  // hash table with capacity =1249
		HashLinQuad quadHashTable = new HashLinQuad(1249);
		int totalLinearCollisions = 0;
		int totalQuadraticCollisions = 0;
		System.out.println("Linear Probing-----------------------------------------------------------------");
		for (int f1 : InputArray) {
			int count = linHashTable.addLin(f1);
			totalLinearCollisions += count;
			System.out.println("Collisions occured for adding " + f1 + " is " + count);
		}
		System.out.println("\n");
		System.out.println("Quadratic Probing-----------------------------------------------------------------");
		for (int f1 : InputArray) {
			int count = quadHashTable.addQuad(f1);
			totalQuadraticCollisions += count;
			System.out.println("Collisions occured for adding " + f1 + " is " + count);
		}
		System.out.println("\n");
		System.out.println(
				"Comparing total no of collisions occured in Linear probing and Quadratic probing respectively");
		System.out.println("Total number of collisions for Linear probing " + totalLinearCollisions);
		System.out.println("Total number of collisions for quadratic probing " + totalQuadraticCollisions);
		System.out.println("Above number of counts shows that Quadratic probing is quite effective than Linear probing");
		
		System.out.println("testing the food class-----------------------------------------------------------------------------------");
		Food f1=new Food("Banana","Fruit","Yello",100,12);
		Food f2=new Food("Carrot","Vegitable","red",200,24);
		Food f3=new Food("Apple","Fruit","Red",300,36);
		Food f4=new Food("Oranges","Fruit","Orange",400,48);
		Food f5=new Food("Beans","Vegitable","Green",500,60);
		Food f6=new Food("Mushroom","Vegitable","White",600,72);
		Food f7=new Food("Tomato","Vegitable","Red",700,84);
		Food f8=new Food("Potato","Vegitable","Brown",800,96);
		Food f9=new Food("Fish","Meat","Yello",900,108);
		Food f10=new Food("Chicken","Meat","Yello",1000,120);
		HashFridge hf=new HashFridge(10);
		hf.insert(f1, 10);
		hf.insert(f2, 200);
		hf.insert(f3, 300);
		hf.insert(f4, 400);
		hf.insert(f5, 500);
		hf.insert(f6, 600);
		hf.insert(f7, 700);
		hf.insert(f8, 800);
		hf.insert(f10, 900);
		hf.insert(f10, 1000);
		hf.insert(f9, 1100);
		hf.printAll();
		System.out.println("Seach result for Potatoes (f8): "+ hf.search(f8));
		System.out.println("Seach result for Fish (f9): "+hf.search(f9));
		System.out.println("Seach result for Mangoes: "+hf.search(new Food("Mangoes", "Fruit", "Yellow", 100, 233)));
		System.out.println("Using 300gms Chicken: "+hf.remove(f10, 300)+"gms remaining");
		System.out.println("Using 200gms Carrot: "+hf.remove(f2, 200)+"gms remaining");
		hf.printAll();
	}
}
