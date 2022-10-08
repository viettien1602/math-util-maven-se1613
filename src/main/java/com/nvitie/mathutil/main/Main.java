package com.nvitie.mathutil.main;

import com.nvitie.mathutil.core.MathUtil;

public class Main {
    public static void main(String[] args) {
        System.out.println("This message comes from the main() method");
//        testFactorialGivenWrongArgumentThrowException();
        tryTDDFirst();
    }
    // ham nay de viet ra dung ki thuat viet code kieu TDD
    // goi thu/dung thu chinh ben core/ben MathUtil xem no sai dung ra sao o ngay muc khoi dau moi viet
    public static void tryTDDFirst() {
        // test case #1 (tinh huong so 1/xai thu ham)
        // input n = 1;
        // goi ham getFactorial(1)
        // hi vong ham tra ve 1, vi 1! = 1
        long expected = 1;
        long actual = MathUtil.getFactorial(1);
        // so sanh expected vs actual
        System.out.println("Test 1! | status: " + "Expected " + expected + "|" + " Actual: " + actual);
        // =====
        // test case #1 (tinh huong so 1/xai thu ham)
        // input n = 2;
        // goi ham getFactorial(2)
        // hi vong ham tra ve 1, vi 1! = 1
        expected = 2;
        actual = MathUtil.getFactorial(2);
        // so sanh expected vs actual
        System.out.println("Test 2! | status: " + "Expected " + expected + "|" + " Actual: " + actual);
    }

//    public static void testFactorialGivenWrongArgumentThrowException() {
//        //Test case #3: dua data ngoai scope (n am, n qua lon), ham tra ngoai le
//        //Tra ngoai le -> test ra mau xanh
//        System.out.println("Hope to see the exception.");
//        long actual = MathUtil.getFactorial(-5);
//    }
}