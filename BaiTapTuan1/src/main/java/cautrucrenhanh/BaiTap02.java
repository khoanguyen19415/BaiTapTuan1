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
public class BaiTap02 {

    public static void main(String[] args) {
        // TODO code application logic here
        double toan, van, anh;
        double dtb;
//buoc 1. nhap diem toan, van ,anh
        Scanner sc = new Scanner(System.in);
        System.out.println("=====Xet hoc luc====");
        System.out.print("Cho biet diem toan:");
        toan = sc.nextDouble();
        System.out.print("Cho biet diem van:");
        van = sc.nextDouble();
        System.out.print("Cho biet diem anh:");
        anh = sc.nextDouble();
//b2.tinh trung binh
        dtb = (toan + van + anh) / 3;
//b3. xet hoc luc
        String kq = "";
        if (dtb <= 4) {
            kq = "Yeu";
        } else if (dtb <= 6.5) {
            kq = "Trung binh";
        } else if (dtb <= 8) {
            kq = "Kha";
        } else {
            kq = "Gioi";
        }
//b4.xuat ket qua
        System.out.println("DTB:" + dtb + " - Hoc luc:" + kq);
    }
}
