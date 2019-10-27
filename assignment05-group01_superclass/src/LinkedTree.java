
import java.util.*;
public class LinkedTree<E> 
{
	Node<E> root;  //this is just a reference to type (this is basically a pointer / reference only )
	private class Node<E> 
	{
		private int key; //the key field
		private LinkedList<E> data; //list of data associated with a key
		private Node<E> left; //reference to the left child
		private Node<E> right; //reference to the right child

		private Node(int key, E element, Node<E> leftChild, Node<E> rightChild) 
		{
			this.key = key;
			this.data = new LinkedList<E>();
			this.left = leftChild;
			this.right = rightChild;
			this.data.add(element);
		}

	}
	public LinkedTree() 
	{
		this.root=null;
	}

	public LinkedTree(int key, E element) 
	{
		this.root= new Node<E>(key, element,null,null);  //every root is a node
	}

	public void insert(int key, E element) 
	{
		if (this.root==null)
		{
			this.root= new Node<E>( key, element,null,null);
			return;
		}

		Node<E> temp = this.root;
		// while temp.key < key and temp.left is not null: change temp-> temp.left 
		// if left is null insert 

		while(true) {
			if(key <= temp.key) {
				if(temp.key==key)
					temp.data.add(element);

				else if(temp.left==null) // if the left child is a null value insert then create a new left node with the key and element
				{	
					temp.left= new Node<E>(key, element,null,null);
					return;
				}
				else					// if the left child is not null then insert
					temp= temp.left;

			}
			else if (key>temp.key) {
				if(temp.right==null) // if the left child is a null value insert then create a new left node with the key and element
				{
					temp.right= new Node<E>(key, element,null,null);
					return;
				}
				else					// if the left child is not null then insert
					temp= temp.right;
			}
		}

	}
	public LinkedList<E> search(int key) 
	{
		Node<E> temp = this.root;

		while(true) {
			if(temp.key==key)
				return temp.data;
			if(key >= temp.key) {
				if(temp.right==null) {
					return null;
				}
				else
					temp= temp.right;
			}
			else if(key < temp.key) {
				if(temp.left==null)
					return null;
				else
					temp=temp.left;
			}
		}
	}

	@SuppressWarnings("unchecked")
	public LinkedList<E> preorder(int ind) {
		LinkedList <E> tempNodesElement=new LinkedList<E>();
		LinkedList <E> elementAtInd = null;
		Stack <Node<E>> s =new Stack <Node<E>>();
		Node <E> tempNode=root;
		if (tempNode == null)
		{ 
			return tempNodesElement; 
		} 
		s.push(tempNode);
		while(s.empty()==false)
		{
			tempNode= s.peek();
			System.out.print(tempNode.data + " ");
			tempNodesElement.add((E) tempNode.data);
			s.pop();
			if (tempNode.right != null) { 
				s.push(tempNode.right); 
			} 
			if (tempNode.left != null) { 
				s.push(tempNode.left); 
			} 
		}
		if(tempNodesElement.size()>ind)
		{
			elementAtInd=(LinkedList<E>) tempNodesElement.get(ind);
			System.out.println("\n"+tempNodesElement.get(ind)+"is the element at index [ind] of data ");
		}
		return elementAtInd;
	}

	@SuppressWarnings("unchecked")
	public LinkedList<E> postorder (int ind) 
	{
		LinkedList <E> tempNodesElement=new LinkedList<E>();
		LinkedList <E> elementAtInd = null;
		Stack <Node<E>> s =new Stack <Node<E>>();
		Node <E> tempNode=root;
		if (tempNode == null)
		{ 
			return tempNodesElement; 
		} 
		s.push(tempNode); 
		Node<E> prev = null; 
		while (!s.isEmpty()) 
		{
			tempNode= s.peek();
			if (prev == null || prev.left == tempNode || prev.right == tempNode)
			{ 
				if (tempNode.left != null) 
					s.push(tempNode.left); 
				else if (tempNode.right != null) 
					s.push(tempNode.right); 
				else
				{ 
					s.pop(); 
					tempNodesElement.add((E) tempNode.data); 
					System.out.println(tempNode.key+"");
				} 
			}  
			else if (tempNode.left == prev)  
			{ 
				if (tempNode.right != null) 
					s.push(tempNode.right); 
				else 
				{ 
					s.pop(); 
					tempNodesElement.add((E) tempNode.data); 
					System.out.println(tempNode.key+"");
				}
			}  
			else if (tempNode.right == prev)  
			{ 
				s.pop(); 
				tempNodesElement.add((E) tempNode.data); 
				System.out.println(tempNode.key+"");
			}
			prev = tempNode; 
		} 

		if(tempNodesElement.size()>ind)
		{
			elementAtInd=(LinkedList<E>) tempNodesElement.get(ind);
			System.out.println("\n"+tempNodesElement.get(ind)+"is the element at index [ind] of data ");
		}
		return elementAtInd;
	}

	@SuppressWarnings("unchecked")
	public LinkedList<E> inorder (int ind) 
	{

		LinkedList <E> tempNodesElement=new LinkedList<E>();
		LinkedList <E> elementAtInd = null;
		Stack <Node<E>> s=new Stack <Node<E>>();
		Node <E> tempNode=root;
		if (tempNode == null)
		{ 
			return null; 
		} 
		while(tempNode!= null||s.size()>0)   // traversing the tree
		{
			while(tempNode!=null) 	//reach the leftmost node
			{
				s.push(tempNode); //keep the node inside the stack for reference (Pointer to the current node before moving to the leftmost node with null)
				tempNode=tempNode.left;
			}
			tempNode=s.pop();
			System.out.print(tempNode.data+" ");
			tempNodesElement.add((E) tempNode.data);
			tempNode=tempNode.right;
		}
		if(tempNodesElement.size()>ind)
		{
			elementAtInd=(LinkedList<E>) tempNodesElement.get(ind);
			System.out.println("\n"+tempNodesElement.get(ind)+"is the element at index [ind] of data ");
		}
		return elementAtInd;

	}
	public LinkedList<E> delete(int key) 
	{

		Node<E> previousNode = null;
		Node<E> currentNode = this.root;
		Node<E> maxLeftNode = null;
		Node<E> nodeAboveMaxLeftNode=null;

		while(true) {
			if(currentNode.key==key) 
			{
				// delete logic
				System.out.println("Key to delete: "+key);
				maxLeftNode = currentNode.left;

				if(currentNode.left == null && currentNode.right == null && key == currentNode.key) 
				{ 																						//only for the leaf nodes
					System.out.println("PreviousNode was:"+previousNode.key);
					if(previousNode.left !=null && previousNode.left.key == key)
						previousNode.left = null;
					else if(previousNode.right !=null && previousNode.right.key == key)
						previousNode.right = null;
					return currentNode.data; 
				}

				while(maxLeftNode.right != null) {
					nodeAboveMaxLeftNode = maxLeftNode;//50
					maxLeftNode = maxLeftNode.right;  //70
				}

				// remove the extra reference from the tree
				if(nodeAboveMaxLeftNode != null)
					nodeAboveMaxLeftNode.right=null;  //700==null

				if(previousNode == null) { 
					this.root = maxLeftNode;
					System.out.println("replacing root with: "+maxLeftNode.key);
				}
				
				// delete by altering the references
				else if(key == previousNode.left.key)
					previousNode.left = maxLeftNode;
				else if(key == previousNode.right.key)
					previousNode.right=maxLeftNode;

				if(maxLeftNode != currentNode.left)
					maxLeftNode.left = currentNode.left;
				if(maxLeftNode != currentNode.right)
					maxLeftNode.right = currentNode.right;

				System.out.println("replacing with : "+maxLeftNode.key);
				System.out.println("root is : "+this.root.key);

				return currentNode.data;
			}
			else if(key > currentNode.key) { // because 
				if(currentNode.right==null) {
					return null;
				}
				else {
					previousNode = currentNode;
					currentNode= currentNode.right;
				}
			}
			else if(key < currentNode.key) {
				if(currentNode.left==null)
					return null;
				else {
					previousNode = currentNode;
					currentNode=currentNode.left;
				}
			}
		}


	}
}