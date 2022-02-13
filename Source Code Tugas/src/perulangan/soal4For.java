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
public class soal4For {
    public static void main(String args[]) {
        int m, n, hasil;
        System.out.print("Masukkan nilai awal (M): ");
        Scanner inputM = new Scanner(System.in);
        m = inputM.nextInt();
        System.out.print("Masukkan nilai akhir (N): ");
        Scanner inputN = new Scanner(System.in);
        n = inputN.nextInt();
        for (int i = m; i <= n; i++) {
             if ((i % 2 == 1) && (i % 5 != 0)){
                System.out.print(i+"  ");
            }
        }
    }
}
