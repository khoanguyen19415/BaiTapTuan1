/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vonglap;

/**
 *
 * @author Administrator
 */
public class BaiTap13 {
    public static void main(String[] args) {
        int hangChuc, hangDonVi, tich, tong;
        System.out.println("Các số nguyên từ 10 đến 99 mà tích của 2 chữ số bằng 2 lần tổng của 2 chữ số là:");

        // Duyệt qua tất cả các số từ 10 đến 99
        for (int i = 10; i <= 99; i++) {
            hangChuc = i / 10; // Lấy chữ số hàng chục
            hangDonVi = i % 10; // Lấy chữ số hàng đơn vị

            tich = hangChuc * hangDonVi;
            tong = hangChuc + hangDonVi;

            // Kiểm tra điều kiện tích bằng 2 lần tổng
            if (tich == 2 * tong) {
                System.out.println(i);
            }
        }
    }
}
