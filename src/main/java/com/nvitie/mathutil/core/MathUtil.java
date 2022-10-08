package com.nvitie.mathutil.core;
// day la Class mo phong lai cac ham tien ich dung chung cho mn, cho moi Class khac, mo phong lai tien ich java.Math
// cua JDK, cai j dung chung dc thiet ke la static

public class MathUtil {
    public static final double PI = 3.14;
    // ham tinh n!
    // khong tinh giai thua cua so am
    // 0! = 1! = 1
    // vi giai thua tang cuc nhanh nen 21 giai thua vuot 18 so 0 -> vuot kieu long
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalStateException("Invalid input, input must be between 0 to 20");
        }
        if (n == 0 || n == 1) return 1;
        // song sot den day sure n = 2 .. 20
        // cam ko xai else khi ham da co return
        long product = 1; // bien cong don, nhan don // accumulation
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;

    }
}
// ta se hoc so ve khai niem tdd - test driven development
// lam ki thuat lap trinh.ap dung cho dan dev de gia tang chat luong code giam thieu cong suc tim bug
// TDD yeu cau dev khi viet code/ viet ham/ class phai viet luon cac doan kiem thu dung thu ham/class de kiem tra tinh
// dung dan cua ham/class do


// viet code kem voi viet test cases
// viet code co y thuc viet luon phan kiem thu ham
// sau khi co dc ten ham(chi ten ham ma thoi)
// ta viet luon cac tinh huong xai ham
// chap nhan chay ham sai - do code chua xong
// sau do ta toi uu/chinh sua code de dam bao code chay dung
// qua trinh sai - dung 0 sai dung dien ra lien tuc
