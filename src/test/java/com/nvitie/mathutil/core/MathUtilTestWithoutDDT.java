package com.nvitie.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilTestWithoutDDT {
    @Test
    public void testFactorialGivenRightArgumentReturnWell() {
        //Test case #1: n = 0, hy vong tra ve 1
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        Assert.assertEquals(expected, actual);

        //Test case #2: n = 1, hy vong tra ve 1
        Assert.assertEquals(expected, MathUtil.getFactorial(1));

        //Test case #3: n = 2, hy vong tra ve 2
        expected = 3;
        Assert.assertEquals(expected, MathUtil.getFactorial(2));
    }

//    @Test(expected = IllegalArgumentException.class)
//    public void testFactorialGivenWrongArgumentThrowException() {
//        //Test case #3: dua data ngoai scope (n am, n qua lon), ham tra ngoai le
//        //Tra ngoai le -> test ra mau xanh
//        System.out.println("Hope to see the exception.");
//        long actual = MathUtil.getFactorial(-5);
//    }
}