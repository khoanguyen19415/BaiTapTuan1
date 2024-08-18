/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cautrucrenhanh;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BaiTap03 {
    public static void main(String[] args) {
        int so1,so2,so3;
         Scanner sc = new Scanner(System.in);
         
        // Nhập 3 số nguyên từ bàn phím
        System.out.print("nhap so nguyen thu 1: ");
        so1 = sc.nextInt();

        System.out.print("nhap so nguyen thu 2: ");
        so2 = sc.nextInt();

        System.out.print("nhap so nguyen thu 3: ");
        so3 = sc.nextInt();

        // Tìm số nhỏ nhất
        int soNhoNhat = so1;

        if (so2 < soNhoNhat) {
            soNhoNhat = so2;
        }
        
        if (so3 < soNhoNhat) {
            soNhoNhat = so3;
        }

        // In ra số nhỏ nhất
        System.out.println("so nho nhat trong 3 so nguyen la: " + soNhoNhat);
    }
}
