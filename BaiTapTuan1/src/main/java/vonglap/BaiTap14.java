/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vonglap;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BaiTap14 {
     public static void main(String[] args) {
        int count;
        double sum;
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        sum = 0.0;
        count = 0;

        System.out.println("nhap cac so (nhap 0 de ket thuc)");
        while (true) {
            System.out.print("Nhap so: ");
            double number = sc.nextDouble();
            if (number == 0) {
                break;
            }
            numbers.add(number);
            sum += number;
            count++;
        }

        if (count > 0) {
            double average = sum / count;
            System.out.printf("Trung binh: %.3f\n", average);
        } else {
            System.out.println("Khong co so nao duoc nhap.");
        }
    }
}
