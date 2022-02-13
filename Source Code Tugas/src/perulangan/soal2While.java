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
public class soal2While {
    public static void main(String args[]) {
        int i = 10, jumlahLoop;
        System.out.print("Masukkan angka (N): ");
        Scanner inputLoop = new Scanner(System.in);
        jumlahLoop = inputLoop.nextInt();
        while(i <= jumlahLoop){
            System.out.print(i+"  ");
            i++;
        }
    }
}
