/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vonglap;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BaiTap15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int totalGuesses = 0;
        int correctGuesses = 0;
        String input;

        System.out.println("======chao mung den voi tro hoi toan so======!");
        System.out.println("Nhap cac so tu 0 den 10. Nhap 'quit' de ket thuc tro choi.");

        while (true) {
            // Tạo số ngẫu nhiên từ 0 đến 10
            int randomNumber = random.nextInt(11);

            System.out.print("Nhap so cua ban: ");
            input = sc.nextLine();

            // Kiểm tra nếu người dùng muốn kết thúc trò chơi
            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            try {
                int userGuess = Integer.parseInt(input);

                // Kiểm tra phạm vi của số đoán
                if (userGuess < 0 || userGuess > 10) {
                    System.out.println("So nhap vao khong hop le. Hay nhap so tu 0 den 10.");
                    continue;
                }

                totalGuesses++;

                if (userGuess == randomNumber) {
                    System.out.println("ban doan dung! Co diem. nhap 'quit' de ket thuc ");
                    correctGuesses++;
                } else {
                    System.out.println("ban doan sai. So dung la: " + randomNumber);
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap mot so hop le hoac nhap 'quit' de ket thuc.");
            }
        }

        // Hiển thị kết quả thống kê
        if (totalGuesses > 0) {
            double average = (double) correctGuesses / totalGuesses * 100;
            System.out.println("Tro choi ket thuc.");
            System.out.println("Tong so lan doan: " + totalGuesses);
            System.out.println("So lan doan trung: " + correctGuesses);
            System.out.printf("Ti le doan dung trung binh: %.2f%%\n", average);
        } else {
            System.out.println("Khong co luot doan nao duoc thuc hien.");
        }
    }
}
