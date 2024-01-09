package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTests extends BaseTest {

    @Test
    public void testOne() {
        System.out.println("Executing Testcase One");
        Assert.assertTrue(true);
    }

    @Test
    public void testTwo() {
        System.out.println("Executing Testcase Two");
        Assert.assertTrue(true);
    }

    @Test
    public void testThree() {
        System.out.println("Executing Testcase Three");
        Assert.assertTrue(true);
    }

    @Test
    public void testFour() {
        System.out.println("Executing Testcase Four");
        Assert.assertTrue(true);
    }

    @Test
    public void testFive() {
        System.out.println("Executing Testcase Five");
        Assert.assertTrue(true);
    }

}

