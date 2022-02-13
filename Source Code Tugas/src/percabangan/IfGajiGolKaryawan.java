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
public class IfGajiGolKaryawan {
    public  static  void  main(String[]  args)  { int  gajiKaryawan;
        char  golongan;
        Scanner  input  =  new  Scanner(System.in); 
        System.out.print("Input  Golongan  Anda:  "); 
        golongan  =  input.next().toUpperCase().charAt(0); 
        gajiKaryawan  =  0;
        if  (golongan  ==  'A') 
            gajiKaryawan  =  50000000;
        else  if  (golongan  ==  'B') 
            gajiKaryawan  =  30000000;
        else  if  (golongan  ==  'C') 
            gajiKaryawan  =  10000000;
        else 
            
        System.out.println("Gaji  Anda:  "  +  gajiKaryawan); 
        input.close();
    }
}
