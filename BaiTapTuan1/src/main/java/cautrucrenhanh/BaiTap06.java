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
public class BaiTap06 {
    public static void main(String[] args) {
        int so1,so2;
        Scanner sc = new Scanner(System.in);

        // Nhập 2 số nguyên từ bàn phím
        System.out.print("nhap so nguyen thu 1: ");
        so1 = sc.nextInt();

        System.out.print("Nhap so nguyen thu 2: ");
        so2 = sc.nextInt();

        // Nhập phép toán từ bàn phím
        System.out.print("nhap phep toan (+, -, *, /): ");
        char phepToan = sc.next().charAt(0);

        // Thực hiện phép toán
        switch (phepToan) {
            case '+':
                System.out.println("ket qua: " + (so1 + so2));
                break;
            case '-':
                System.out.println("ket qua: " + (so1 - so2));
                break;
            case '*':
                System.out.println("ket qua: " + (so1 * so2));
                break;
            case '/':
                if (so2 != 0) {
                    System.out.println("Kết quả: " + ((double) so1 / so2));
                } else {
                    System.out.println("Không thể chia cho 0!!");
                }
                break;
            default:
                System.out.println("Phép toán không hợp lệ!");
        }
    }
}
