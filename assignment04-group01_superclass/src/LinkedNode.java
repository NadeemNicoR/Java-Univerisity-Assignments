public class LinkedNode<E> {
    E data_;
    LinkedNode<E> next_;

    public LinkedNode() {
    	this.data_ = null; 	
    }
    
    public LinkedNode(E data) {
        //your implementation goes here
    	this.data_ = data;
    }
    
    public LinkedNode<E> add(E data) {
		LinkedNode<E> node = new LinkedNode<E>(data);
		if(next_ == null)
		{
			next_ = node;
		}
		else 
		{
			LinkedNode<E> n = next_;
			while(n.getNextNode() != null)
			{
				n = n.getNextNode();
			}
			n.setNextNode(node);
		}
		return node;
	}
    
	public LinkedNode<E> find(E data) {
		LinkedNode<E> thisNode = next_;
		while(thisNode.getNextNode() != null) 
		{
			if(thisNode.data_ == data)
			{
				return thisNode;
			}
			thisNode = thisNode.getNextNode();
		}
		return null;			
	}
	
	public void insert(LinkedNode<E> node, E data) {
		LinkedNode<E> temp = node.getNextNode();
		LinkedNode<E> n = new LinkedNode<E>(data);
		node.setNextNode(n);
		n.setNextNode(temp);
	}
    public void setNextNode(LinkedNode<E> n_node) {
         //your implementation goes here
    	this.next_ = n_node;
    }
    
    public LinkedNode<E> getNextNode() {
         //your implementation goes here
    	return (this.next_);
    }
    
    public String toText() {
        //your implementation goes here
    	LinkedNode<E> n = next_;
    	String str ="";
    	str +=(String)n.data_;
    	while(n.getNextNode() != null) {
    		n = n.getNextNode();
    		str = str + ", " + (String)n.data_;
    	}
    	return str;
    }
}
