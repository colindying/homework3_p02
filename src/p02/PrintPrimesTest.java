package p02;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrintPrimesTest {
	PrintPrimes p = new PrintPrimes();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testPrintPrimes() {
        p.printPrimes(5);
    }

}
