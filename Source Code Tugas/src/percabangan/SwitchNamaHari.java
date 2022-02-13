/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;
import  java.util.Scanner;
/**
 *
 * @author Rezky Yustisio
 */
public class SwitchNamaHari {
    public  static  void  main(String[]  args)  { 
        byte  hariAngka;
        String  namaHari  =  "";
        Scanner  input  =  new  Scanner(System.in); 
        System.out.print("Input  hari  dalam  angka:  "); 
        hariAngka  =  input.nextByte();
        switch  (hariAngka)  {
            case  1:  namaHari  =  "Senin"; 
                break;
            case  2:  namaHari  =  "Selasa"; 
                break;
            case  3:  namaHari  =  "Rabu";
                break;
            case  4:  namaHari  =  "Kamis"; 
                break;
            case  5:  namaHari  =  "Jum'at"; 
                break;
            case  6:  namaHari  =  "Sabtu"; 
                break;
            case  7:  namaHari  =  "Minggu";
                break;
        }
        System.out.println("Nama bulan: " + namaHari);
    }
}