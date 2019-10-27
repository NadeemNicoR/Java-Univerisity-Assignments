/**
 * Tests used to check a submission.
 * 
 * All tests in the "test_submission" folder are used for 
 * checking a submission and are executed when the 
 * "Submission" action is invoked.
 * 
 */

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class MainTest {
    @Test
    public final void testIsPrime() {
        assertEquals(Main.isPrime(13), true);
        assertEquals(Main.isPrime(17), true);
        assertEquals(Main.isPrime(19), true);
        assertEquals(Main.isPrime(101), true);
        assertEquals(Main.isPrime(23), true);
        assertEquals(Main.isPrime(37), true);
        assertEquals(Main.isPrime(169), false);
    }
    
    @Test
    public final void testNextPrime() {
        assertEquals(Main.nextPrime(13), 13);
        assertEquals(Main.nextPrime(18), 19);
    }
    
    @Test
    public final void testMedian() {
        assertEquals(Main.median(20, 40, 70), 40);
        assertEquals(Main.median(20, 70, 40), 40);
        assertEquals(Main.median(40, 20, 70), 40);
        assertEquals(Main.median(40, 70, 20), 40);
        assertEquals(Main.median(70, 20, 40), 40);
        assertEquals(Main.median(70, 40, 20), 40);
    }
    
    @Test
    public final void testMedian2() {
        assertEquals(Main.median2(20, 40, 70), 40);
        assertEquals(Main.median2(20, 70, 40), 40);
        assertEquals(Main.median2(40, 20, 70), 40);
        assertEquals(Main.median2(40, 70, 20), 40);
        assertEquals(Main.median2(70, 20, 40), 40);
        assertEquals(Main.median2(70, 40, 20), 40);
    }
    
    @Test
    public final void testCreateRandom () {
        assertTrue(Main.createRandom(100).length == 100);
        assertTrue(Main.createRandom(20).length == 20);
        assertTrue(Main.createRandom(30).length == 30);
        
        int[] array = Main.createRandom(100);
        
        for (int i = 0; i < array.length; i++) {
            assertTrue(array[i] >= 5 && array[i] <= 99);
        }
    }
    
    @Test
    public final void testPosMin() {
        assertEquals(Main.posMin(new int[]{100, 90, 80, 70, 60, 40, 10}), 6);
        assertEquals(Main.posMin(new int[]{100, 80, 90, 2, 60, 40, 10}), 3);
    }
    
    @Test
    public final void testToString() {
    	int[] numArray = {3,6,11,101}; 
    	String numText = Arrays.toString(numArray);
    
    	assertTrue(Main.toString(numArray).equalsIgnoreCase(numText));
    }
    
    @Test
    public final void testSwap() {
        int[] array = {10, 20, 30, 40};
        
        Main.swap(array);
        
        assertTrue(array[0] == 40 && array[array.length - 1] == 10);
    }
}

