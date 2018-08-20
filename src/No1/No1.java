/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class No1 {
    public static void main(String[] args) {
        Scanner bil = new Scanner(System.in);
        System.out.println("Masukkan r : ");
        Float r = bil.nextFloat();
        System.out.println("Luas permukaan bola adalah : "+4*22*r/7*r);         
    }
}
