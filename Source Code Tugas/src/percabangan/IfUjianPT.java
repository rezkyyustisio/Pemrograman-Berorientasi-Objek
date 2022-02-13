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
public class IfUjianPT {
    public  static  void  main(String[]  args)  {
        float  nilaiTeori,  nilaiPraktek,  nilaiGabungan; 
        Scanner  input  =  new  Scanner(System.in); 
        System.out.print("Input  Nilai  Teori:  "); 
        nilaiTeori  =  input.nextFloat(); 
        System.out.print("Input  Nilai  Praktek:  "); 
        nilaiPraktek  =  input.nextFloat(); 
        nilaiGabungan  =  nilaiTeori  +  nilaiPraktek;
        if  (nilaiGabungan  >=  60)
            System.out.println("Selamat,  Anda  dinyatakan  Lulus"); 
        else
            System.out.println("Maaf,  Anda  dinyatakan  Tidak  Lulus"); 
        input.close();
    }
}
