import java.util.LinkedList;

/**
 * Main class of the Java program. 
 * @param <E>
 * 
 */

public class Main<E> extends LinkedTree<E>
{
	
    public static  void main(String[] args) 
    {
    	
    	LinkedTree<String> tree=new LinkedTree<String>();
    	@SuppressWarnings("unchecked")
		LinkedList<String>[] elements = new LinkedList[7];
    	tree.insert(100, "Root");
    	tree.insert(150, "Right");
    	tree.insert(50, "Left");
    	tree.insert(200, "RightRight");
    	tree.insert(140, "RightLeft");
    	tree.insert(20, "LeftLeft");
    	tree.insert(70, "LeftRight");
    	elements[0] = tree.search(100);
        elements[1] = tree.search(150);
        elements[2] = tree.search(50);
        elements[3] = tree.search(200);
        elements[4] = tree.search(140);
        elements[5] = tree.search(20);
        elements[6] = tree.search(70);
        System.out.println("Elements of corresponding keys in the order the keys were passed through method are as follows");
        for (int i = 0; i < elements.length-1; i++) 
        {
        	System.out.println("---------->"+String.valueOf(elements[i])); 
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("elements traveresed as per inorder");
        tree.inorder(0);
        System.out.println("\n-----------------------------------------------------------------");
        System.out.println("\nelements traveresed as per postorder");
        tree.postorder(1);
        System.out.println("\n-----------------------------------------------------------------");
        System.out.println("elements traveresed as per preorder");
        tree.preorder(2);
        System.out.println("\n-----------------------------------------------------------------");
        
        System.out.println("deleted node with key 16 had the following data "+ tree.delete(50));
        System.out.println("deleted node with key 16 had the following data "+ tree.delete(140));
    }
}

