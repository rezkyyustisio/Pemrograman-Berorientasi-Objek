/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;
import java.util.Scanner;
/**
 *
 * @author Rezky Yustisio
 */
public class Percobaan2 {
    public static void main(String args[]){
        int i = 1, jumlahLoop;
        System.out.println("Masukkan jumlah looping: ");
        Scanner inputLoop = new Scanner(System.in);
        jumlahLoop = inputLoop.nextInt();
        while (i <= jumlahLoop){
            System.out.println("Pemrograman Java");
            i++;
        }
    }
}
