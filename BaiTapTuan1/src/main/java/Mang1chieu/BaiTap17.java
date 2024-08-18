/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mang1chieu;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BaiTap17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        int n;
        do {
            System.out.print("Nhap so luong phan tu cua mng(1 <= n <= 20): ");
            n = sc.nextInt();
        } while (n < 1 || n > 20);

        // Khởi tạo mảng và nhập dữ liệu
        double[] array = new double[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu " + (i + 1) + ": ");
            array[i] = sc.nextDouble();
        }

        // Xuất mảng ra màn hình
        System.out.println("Mang da nhap:");
        for (double value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Tính trung bình giá trị của mảng
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        double average = sum / n;
        System.out.printf("Trung binh gia tri cua mang: %.2f\n", average);

        // Tìm phần tử có giá trị nhỏ nhất
        double minValue = array[0];
        for (double value : array) {
            if (value < minValue) {
                minValue = value;
            }
        }
        System.out.printf("Phan tu co gia tri nho nhat trong mang: %.2f\n", minValue);
    }
}
