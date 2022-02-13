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
public class latihan3 {
    public static void main(String args[]) {
        int bilangan, pangkat, hasil = 1;
        char ulang;
        System.out.println("Program Perpangkatan");
        while(true){
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
        System.out.print("Ingin Coba Lagi (Y/T)? ");
        Scanner inputUlang = new Scanner(System.in);
        ulang = inputUlang.next().toUpperCase().charAt(0);
            if(ulang == 'T'){
                break;
            } else if(ulang != 'Y'){
                System.out.println("Perintah tidak tersedia!");
                break;
            } else {
                hasil = 1;
            }
        }
    }
}
