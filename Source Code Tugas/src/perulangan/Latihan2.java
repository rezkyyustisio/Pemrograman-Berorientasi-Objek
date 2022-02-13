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
public class Latihan2 {
    public static void main(String args[]){
        int jumlahNilai, jumlahData, i, m, n;
        System.out.println("Input nilai awal (M): ");
        Scanner inputM = new Scanner(System.in);
        m = inputM.nextInt();
        System.out.println("Input nilai akhir (N): ");
        Scanner inputN = new Scanner(System.in);
        n = inputN.nextInt();
        i = m;
        jumlahNilai = jumlahData = 0;
        if ((i >= 1) && (i % 3 != 0)){
            System.out.println(i + "  ");
            jumlahNilai += i;
            jumlahData++;
        }
        System.out.println();
        System.out.println("Jumlah Nilai: " + jumlahNilai);
        System.out.println("Jumlah Data: " + jumlahData);
        System.out.println("Rerata: " + jumlahNilai / jumlahData);
    }
}
