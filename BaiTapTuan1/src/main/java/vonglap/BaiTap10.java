/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vonglap;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BaiTap10 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên dương n từ bàn phím
        System.out.print("Nhap so nguyen duong n: ");
        n = sc.nextInt();

        // Kiểm tra n có phải là số nguyên tố không
        if (n <= 1) {
            System.out.println(n + " khong phai la so nguyen to.");
        } else if (kiemTraNguyenTo(n)) {
            System.out.println(n + " la so nguyen to.");
        } else {
            System.out.println(n + " khong phai la so nguyen to.");
        }
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean kiemTraNguyenTo(int n) {
        // Số nguyên tố là số lớn hơn 1 và chỉ chia hết cho 1 và chính nó
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
