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
public class IfNamaHari {
    public  static  void  main(String[]  args)  { 
        byte  hariAngka;
        String  namaHari  =  "";
        Scanner  input  =  new  Scanner(System.in); 
        System.out.print("Input  hari  dalam  angka:  "); 
        hariAngka  =  input.nextByte();
        if  (hariAngka  ==  1) 
            namaHari  =  "Senin";
        else  if  (hariAngka  ==  2) 
            namaHari  =  "Selasa"; 
        else  if  (hariAngka  ==  3)
            namaHari  =  "Rabu"; 
        else  if  (hariAngka  ==  4)
            namaHari  =  "Kamis"; 
        else  if  (hariAngka  ==  5)
            namaHari  =  "Jum'at"; 
        else  if  (hariAngka  ==  6)
            namaHari  =  "Sabtu"; 
        else  if  (hariAngka  ==  7)
            namaHari  =  "Minggu"; 
        System.out.println("Nama  hari:  "  +  namaHari); 
        input.close();
    }
}
