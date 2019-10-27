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
import org.junit.rules.ExpectedException;
import java.math.BigInteger;

public class MainTest {
    @Test
    public final void testFacRec() {
        for (int i = 0; i < 10; i++)
            assertEquals(Main.facRec(i), facRec(i));
    }
    
    @Test
    public final void testFacIter() {
        for (int i = 0; i < 10; i++)
            assertEquals(Main.facIter(i), facIter(i));        
    }
    
    public static BigInteger facRec(int n) {
		if (n <= 1)
			return BigInteger.ONE;
		return BigInteger.valueOf(n).multiply(facRec(n - 1));
	}

	public static BigInteger facIter(int n) {
		BigInteger fac = BigInteger.ONE;

		for (int i = n; i > 0; i--)
			fac = fac.multiply(BigInteger.valueOf(i));

		return fac;
	}
}

