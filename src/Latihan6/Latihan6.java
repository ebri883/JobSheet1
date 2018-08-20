/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Latihan6 {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        System.out.println("Masukkan Nilai Web");
        int nilai = masukkan.nextInt();
        if(nilai > 100)
            System.out.println("Masukkan Nilai di Bawah 100");
        else if (nilai>=90) 
            System.out.println("Nilai A");
        else if (nilai>=75) 
            System.out.println("Nilai B");
        else if (nilai>=50) 
            System.out.println("Nilai C");
        else if (nilai>=35) 
            System.out.println("Nilai D");
        
        else 
            System.out.println("Nilai E");
        
    }
}
