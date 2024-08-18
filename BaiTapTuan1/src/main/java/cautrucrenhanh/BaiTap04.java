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
public class BaiTap04 {
    public static void main(String[] args) {
        int so;
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên từ bàn phím
        System.out.print("nhap mot so nguyen: ");
        so = sc.nextInt();

        // Kiểm tra số chẵn hay lẻ
        if (so % 2 == 0) {
            System.out.println("so vua nhap la so chan.");
        } else {
            System.out.println("So vua nhap la so le.");
        }
    }
}
