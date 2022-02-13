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
public class TvTabung {
    // Deklarasi State TV
    private String merkTv = "Stars";
    private String warnaTv = "Hitam";
    private String ukuranTv = "12 Inch";
    private String[] acaraTv = new String[4];
    private int nomorAcaraTv;
    
    public boolean keadaanTv(){
        return true;
    }
    
    public void daftarAcaraTv(){
        acaraTv[0] = "My Trip My Adventure";
        acaraTv[1] = "Jalan Pagi";
        acaraTv[2] = "Menyicip Rasa Makanan Khas Daerah";
        acaraTv[3] = "Surga Indonesia";
        for (int i = 0; i < acaraTv.length; i++) {
            System.out.println(nomorAcaraTv + " " + acaraTv[i]);
        }
    }
    
    public void tontonAcaraTv(int nomorAcaraTv){
        for (int i = 0; i < acaraTv.length; i++) {
            if (i == nomorAcaraTv - 1){
                System.out.println("Anda sedang menonton acara " + acaraTv[i]);
            }
        }
    }
    
    public void lihatInfoTv(){
        System.out.println("Merk Televisi: " + merkTv);
        System.out.println("Warna Televisi: " + warnaTv);
        System.out.println("Ukuran Televisi: " + ukuranTv);
    }
}
