/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vonglap;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap11 {
    public static void main(String[] args) {
        int n;
        int sodao;
        
        Scanner sc = new Scanner(System.in);
        //b1. doc n tu ban phim
        System.out.print("cho biet n:");
        n= sc.nextInt();
        //b2. tim so dao cua n
        sodao = TimSoDao(n);
        //b3.ket luan : doi xung hay khong doi xung
        if(sodao==n)
        {
            System.out.println(n + " la doi xung");
        }else
        {
            System.out.println(n + " la so khong doi xung");
        }
        
    }
    private static int TimSoDao(int n) {
        int sodao=0;
        while (n>0) {
            sodao = sodao *10 + n%10;
            n = n/10;
        }
        return sodao;
    }
}
