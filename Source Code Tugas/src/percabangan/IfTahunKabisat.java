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
public class IfTahunKabisat {
    public  static  void  main(String[]  args)  { 
        int tahun;
        Scanner  input  =  new  Scanner(System.in); 
        System.out.print("Input  tahun:  "); 
        tahun  =  input.nextInt();
        if ((tahun % 400 == 0) || ((tahun % 4 == 0) && (tahun % 100 != 0))) 
            System.out.println("Tahun  Kabisat");
        else
            System.out.println("Bukan  Tahun  Kabisat"); input.close();
    }
}
