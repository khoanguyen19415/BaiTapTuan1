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
public class BaiTap05 {
    public static void main(String[] args) {
        int soKm;
        double tongTien;
        Scanner sc = new Scanner(System.in);

        // Nhập số km từ bàn phím
        System.out.print("nhap so km da di: ");
        soKm = sc.nextInt();

        // Khai báo biến để tính tổng tiền
        tongTien = 0;

        // Tính tiền dựa trên số km
        if (soKm <= 0) {
            System.out.println("so km khong hop le!");
        } else if (soKm == 1) {
            tongTien = 15000;
        } else if (soKm <= 5) {
            tongTien = 15000 + (soKm - 1) * 13500;
        } else {
            tongTien = 15000 + 4 * 13500 + (soKm - 5) * 11000;
        }

        // Giảm giá 10% nếu đi trên 120 km
        if (soKm > 120) {
            tongTien = tongTien * 0.9;
        }

        // In ra tổng tiền
        System.out.println("tong so tien phai tra la: " + tongTien + " VND");
    }
}
