/**
 * Tests used to check a submission.
 * 
 * All tests in the "test_submission" folder are used for 
 * checking a submission and are executed when the 
 * "Submission" action is invoked.
 * 
 */

import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.rules.ExpectedException;

public class ClockTest {
    static Clock clock1 = new Clock(12, 20);
    static Clock clock2 = new Clock(740);
    static Clock clock3 = new Clock("12:20");
    
    @Test
    public final void testClockToString() {
		assertEquals(clock1.toString(), "12:20");
		assertEquals(clock2.toString(), "12:20");
		assertEquals(clock3.toString(), "12:20"); 
    }
    
    @Test
    public final void testClockAddInt() {
		assertEquals(clock1.add(80).toString(), "13:40");
		assertEquals(clock2.add(40).toString(), "13:00");
		assertEquals(clock3.add(60).toString(), "13:20");
    }
    
    @Test
    public final void testClockAddClock() {
		assertEquals(clock1.add(clock2).toString(), "00:40");
    }
    
    @Test
    public final void testGetH() {
        assertEquals(clock1.getH(), 12);
    }
    
    @Test
    public final void testGetMin() {
        assertEquals(clock1.getMin(), 20);
    }
    
    @AfterClass
    public static void message() {
        System.out.println("Please remember that some tests rely on the correctness of the toString()-method!");
    }
}

