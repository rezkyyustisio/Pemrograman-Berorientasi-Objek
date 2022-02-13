/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;
import java.util.Scanner;
/**
 *
 * @author Rezky Yustisio
 */
public class Soal2 {
    public static void main(String args[]){
        char huruf;
        String komentar;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Huruf: ");
        huruf = input.next().toUpperCase().charAt(0); ;
        if (huruf == 'A'){
            komentar = "Istimewa";
        } else if (huruf == 'B'){
            komentar = "Baik";
        } else if (huruf == 'C'){
            komentar = "Cukup";
        } else if (huruf == 'D'){
            komentar = "Kurang";
        } else if (huruf == 'E'){
            komentar = "Tidak Lulus";
        } else {
            komentar = "Nilai Huruf yang anda masukkan tidak tersedia";
        }
        System.out.println(komentar);
    }     
}
