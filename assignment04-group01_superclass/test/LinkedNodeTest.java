import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LinkedNodeTest {
    @Test
    public final void insertionTest() {
        LinkedNode<String> test = new LinkedNode<String>("Monday");
    
        test.setNextNode(new LinkedNode<String>("Thursday"));
        test.getNextNode().setNextNode(new LinkedNode<String>("Friday"));
        
        LinkedNode<String> save = test.getNextNode();
        
        test.setNextNode(new LinkedNode<String>("Tuesday"));
        test.getNextNode().setNextNode(new LinkedNode<String>("Wednesday"));
        test.getNextNode().getNextNode().setNextNode(save);
        
        LinkedNode<String> iter = test;
        
        int i = 0;
        
        while (iter != null) {
            i++;
            iter = iter.getNextNode();
        }
        
        assertTrue(i == 5);
    }
}
