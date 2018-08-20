/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan7;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Latihan7 {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        System.out.println("Silahkan pilih angka 1-3 :");
        int bil = masukkan.nextInt();
        switch (bil){
            case 1 : System.out.println("Satu");
        }
        switch (bil){
            case 2 : System.out.println("Dua");
        }
        switch (bil){
            case 3 : System.out.println("Tiga");
        }
    }
}
