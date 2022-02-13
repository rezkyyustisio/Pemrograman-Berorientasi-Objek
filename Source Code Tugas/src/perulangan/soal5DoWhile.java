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
public class soal5DoWhile {
    public static void main(String args[]) {
        int m, n, hasil, jumlahNilai, jumlahData;
        float reRata;
        System.out.print("Masukkan nilai awal (M): ");
        Scanner inputM = new Scanner(System.in);
        m = inputM.nextInt();
        int i = m;
        System.out.print("Masukkan nilai akhir (N): ");
        Scanner inputN = new Scanner(System.in);
        n = inputN.nextInt();
        jumlahNilai = jumlahData = 0;
        do {
            if ((i >= 1) && (i % 3 != 0)){
                System.out.println(i);
                jumlahNilai += i;
                jumlahData++;
            }
            i++;
        } while(i <= n);
        reRata = jumlahNilai / jumlahData;
        System.out.println();
        System.out.println("Jumlah Nilai: " + jumlahNilai);
        System.out.println("Jumlah Data: " + jumlahData);
        System.out.println("Rerata: " + reRata);
    }
}
