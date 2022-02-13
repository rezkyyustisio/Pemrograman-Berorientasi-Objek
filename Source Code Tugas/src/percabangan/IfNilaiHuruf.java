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
public class IfNilaiHuruf {
    public  static  void  main(String[]  args)  { 
        float  nilaiUjian;
        char  nilaiHuruf = ' ';
        Scanner  input  =  new  Scanner(System.in); 
        System.out.print("Input  Nilai  Ujian:  "); 
        nilaiUjian  =  input.nextFloat();
        if  ((nilaiUjian < 0) || (nilaiUjian > 100)){
            System.out.println("Nilai tidak dikenal");
        }
        else {
            if  (nilaiUjian  >=  80) 
                nilaiHuruf  =  'A';
            else  if  ((nilaiUjian  >=  70)  &&  (nilaiUjian  <  80)) 
                nilaiHuruf  =  'B';
            else  if  ((nilaiUjian  >=  55)  &&  (nilaiUjian  <  70)) 
                nilaiHuruf  =  'C';
            else  if  ((nilaiUjian  >=  40)  &&  (nilaiUjian  <  55)) 
                nilaiHuruf  =  'D';
            else  if  ((nilaiUjian  <  40)) 
                nilaiHuruf  =  'E';
            System.out.println("Nilai  Huruf:  "  +  nilaiHuruf); 
            input.close();
        }
    }
}
