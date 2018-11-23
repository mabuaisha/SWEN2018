package edu.birzeit.math;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

public class SimpleMathTest extends TestCase {

    static SimpleMath simpleMath;

    @BeforeClass
    public static void initCalculator() {
        simpleMath = new SimpleMath();
    }

    @Test
    public void testSum() {

        int result = simpleMath.add(10, 10);
        assertEquals(20, result);

    }

    @Test
    public void testSumIntegerDouble() {

        @SuppressWarnings("static-access")
        Double result = simpleMath.add(10.5, 10.5);
        assertEquals(21, result);

    }

    @Test
    public void testSubMohammedAbuAisha_1() {
        Integer result = simpleMath.subInteger_mohammed_abuaisha(10, 5);
        assertEquals(5, result.intValue());
    }

    @Test
    public void testSubMohammedAbuAisha_negative() {
        Integer result = simpleMath.subInteger_mohammed_abuaisha(5, 10);
        assertEquals(-5, result.intValue());
    }


}
