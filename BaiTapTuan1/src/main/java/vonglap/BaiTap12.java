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
public class BaiTap12 {

    public static void main(String[] args) {
        int n,chuSoLonNhat,chuSoNhoNhat;
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên dương n từ bàn phím
        System.out.print("nhap so nguyen duong n: ");
        n = sc.nextInt();

        // Kiểm tra nếu n <= 0 thì yêu cầu nhập lại
        if (n <= 0) {
            System.out.println("so nhap vao phai la so nguyen duong lon hon 0.");
            return;
        }

        // Khởi tạo giá trị cho chữ số lớn nhất và nhỏ nhất
        chuSoLonNhat = 0;
        chuSoNhoNhat = 9;

        // Tìm chữ số lớn nhất và nhỏ nhất
        while (n > 0) {
            int chuSo = n % 10;  // Lấy chữ số cuối cùng
            if (chuSo > chuSoLonNhat) {
                chuSoLonNhat = chuSo;
            }
            if (chuSo < chuSoNhoNhat) {
                chuSoNhoNhat = chuSo;
            }
            n = n / 10;  // Loại bỏ chữ số cuối cùng
        }

        // In ra kết quả
        System.out.println("Chu so lon nhat la: " + chuSoLonNhat);
        System.out.println("Chu so nho nhat la: " + chuSoNhoNhat);
    }
}
