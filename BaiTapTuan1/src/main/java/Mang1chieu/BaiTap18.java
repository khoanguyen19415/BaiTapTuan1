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
public class BaiTap18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        int n;
        do {
            System.out.print("nhap so luong phan tu cua mang (1 <= n <= 50): ");
            n = sc.nextInt();
        } while (n < 1 || n > 50);

        // Khởi tạo mảng và nhập dữ liệu
        int[] array = new int[n];
        System.out.println("=====Nhap cac phan tu cua mang=====");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        // Xuất mảng ra màn hình
        System.out.println("=====Mang da nhap=====");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Liệt kê các phần tử không phải số nguyên tố
        System.out.println("cac phan tu khong phai so nguyen to");
        for (int value : array) {
            if (!isPrime(value)) {
                System.out.print(value + " ");
            }
        }
        System.out.println();

        // Tính giá trị trung bình của phần tử là số nguyên tố
        double sum = 0;
        int primeCount = 0;
        for (int value : array) {
            if (isPrime(value)) {
                sum += value;
                primeCount++;
            }
        }

        if (primeCount > 0) {
            double average = sum / primeCount;
            System.out.printf("Trung binh gia tri cua cac so nguyen to: %.2f\n", average);
        } else {
            System.out.println("khong co so nguyen to trong mang.");
        }
    }

    // Hàm kiểm tra số nguyên tố
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
