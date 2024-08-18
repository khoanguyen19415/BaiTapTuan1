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
public class BaiTap09 {
    public static void main(String[] args) {
        int n;
        int dem = 0;
        
        Scanner sc = new Scanner(System.in);
        //b1. nhap so nguyen
        System.out.println("=====DEM SO UOC CUA SO NGUYEN=====");
        System.out.print("cho biet n:");
        n=sc.nextInt();
        for(int i =1;i<=n;i++){
            if(n%i==0){
                dem++; // dem = dem+1
            }
        }
        System.out.println("so uoc so cua " + n + " la " + dem);
    }
}
