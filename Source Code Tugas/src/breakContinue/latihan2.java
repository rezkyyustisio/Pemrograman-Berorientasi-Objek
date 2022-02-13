/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakContinue;
import java.util.Scanner;
/**
 *
 * @author Rezky Yustisio
 */
public class latihan2 {
    public static void main(String args[]) {
        int bilangan, pangkat, hasil = 1;
        System.out.println("Program Perpangkatan");
        System.out.print("Input bilangan yang akan dipangkatkan: ");
        Scanner inputBilangan = new Scanner(System.in);
        bilangan = inputBilangan.nextInt();
        System.out.print("Input pangkat: ");
        Scanner inputPangkat = new Scanner(System.in);
        pangkat = inputPangkat.nextInt();
        for (int i = 1; i <= pangkat; i++) {
            hasil *= bilangan;
        }
        System.out.println("Hasil dari "+bilangan+" pangkat "+pangkat+" adalah "+hasil);
    }
}
