package com.nvitie.mathutil.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static com.nvitie.mathutil.core.MathUtil.getFactorial;
import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class MathUtilDDT {

    @Test
    public void test() {
        assertEquals(1, 1);
    }

    //1. chuẩn bị bộ data, là mảng 2 chiều, 2 cột ứng với expected và n
    //dòng tương ứng với các test case
    //mảng object, số thì dùng wrapper class
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Integer[][] {{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}, {720, 6}};
    }

    //Ta se map cac cot cua mot dong, vi du dong dau tien
    //co 2 cot 1 0 -> ta se anh xa 1 vao bien expected, 0 vao bien n
    //tuong tu cac dong con lai
    @Parameterized.Parameter(value = 0)
    public long expected;   //map cot 0
    @Parameterized.Parameter(value = 1)
    public int n;           //map cot 1

    @Test //kiem thu cac test case voi data dc trich ra tu mang map vao 2 bien tuong ung
    public void testFactorialGivenRightArgumentReturnWell() {
        assertEquals(expected, getFactorial(n));
    }



}

//Phân tích cách ta viết code test hàm
//Assert.assertEquals(1, 0), lệnh dùng để test này bị lặp lại các data ta đưa vào
//để ta kiểm tra các tình huống xài hàm
//Cần tha data 1 0 thành các data tương ứng khác
//Ví dụ
//Expected            n!
//1                   0 -> có ổn ko
//1                   2

//Nếu ta có cách nào đó mà tách data ra riêng sau đó từ từ feed data này vào câu lệnh test
//hàm ở trên coi như chỉ cần 1 lệnh gọi test hàm
//Kĩ thuật tách data ra khỏi các câu lệnh test, sau đó nhồi nó vô các câu lệnh test, giúp rút gọn
//số câu lệnh test, giúp dễ dàng kiểm tra tính thiếu đủ
//Kĩ thuật này gọi là DDT - Data driven testing
//Viết code kiểm thử theo hướng tách data còn gọi: kiểm thử theo kiểu tham số hóa - Parameterize
// -> Convert data thành biến

//Chơi với DDT ta cần
//bộ data test - tách riêng
//Các tham số ứng với bộ data
//Gọi là hàm kiểm thử xài các tham số

//Tong ket
//Toan bo code trong class nay duoc viet ra dung de test code chinh o ben ham chinh
//code viet ra dung de test code khac: test script
//1 test script se chua nhieu code de test ham chinh
//1 test script se chua nhieu test case
//1 test script co the xai DDT