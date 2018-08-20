/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan8;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Latihan8 {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        System.out.println("Masukkan nilai TPA : ");
        int TPA = masukkan.nextInt();
        System.out.println("Masukkan nilai Bahasa Inggris : ");
        int BahasaInggris = masukkan.nextInt();
        if((TPA>85)&&(BahasaInggris>80))
            System.out.println("Anda dapat beasiswa");
        else 
            System.out.println("Anda tidak dapat beasiswa");
    }
}
