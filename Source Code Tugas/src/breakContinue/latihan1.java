/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakContinue;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Rezky Yustisio
 */
public class latihan1 {
    public static void main(String args[]){
        int angkaTebakan;
        System.out.println("PROGRAM TEBAK ANGKA (1 S.D. 10");
        
        Random rand = new Random();
        int acak = rand.nextInt(10) + 1;
        
        while(true){
            System.out.print("Tebakan anda: ");
            Scanner input = new Scanner(System.in);
            angkaTebakan = input.nextInt();
            if (angkaTebakan == acak){
               System.out.println("Tebakan Anda Benar");
               break;
            } else {
                System.out.println("Maaf Tebakan Anda Salah. Silahkan Coba lagi!");
            }
        }
    }
}
