/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.tv1;
import java.util.Scanner;
/**
 *
 * @author Rezky Yustisio
 */
public class MainTvTabung {

    public static void main(String[] args) {
        String tontonTv, lihatAcaraTv;
        int nomorAcaraTv;
        
        TvTabung tvku = new TvTabung();
        
        if(tvku.keadaanTv() == true){
            Scanner inputTonton = new Scanner(System.in);
            System.out.println("Ingin Menonton Tv? (ya, tidak) ");
            tontonTv = inputTonton.next();
            if(tontonTv.equals("ya")){
                Scanner inputDaftarAcaraTv = new Scanner(System.in);
                System.out.println("Ingin melihat daftar acara Televisi? (ya, tidak) ");
                lihatAcaraTv = inputDaftarAcaraTv.next();

                Scanner inputNontonTv = new Scanner(System.in);
                if(lihatAcaraTv.equals("ya")){
                    tvku.daftarAcaraTv();
                    Scanner inputAcaraTv = new Scanner(System.in);
                    System.out.println("Pilih acara tv (1, 2, 3, 4): ");
                    nomorAcaraTv = inputAcaraTv.nextInt();
                    tvku.tontonAcaraTv(nomorAcaraTv);
                }
            }
        } else {
            System.out.println("Keadaan televisi belum hidup");
        }
    }
}
