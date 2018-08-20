/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Latihan5 {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        int nilai;
        System.out.println("Masukkan nilai akhir PBO :");
        nilai = masukkan.nextInt();
        if(nilai<70)
            System.out.println("Siswa tidak lulus");
        if(nilai>70)
            System.out.println("Siswa lulus");
    }
}
