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
public class IfKuadran {
    public  static  void  main(String[]  args)  { 
        int  x,  y;
        Scanner  input  =  new  Scanner(System.in); 
        System.out.print("Input  koordinat  x:  "); 
        x  =  input.nextInt(); 
        System.out.print("Input  koordinat  y:  "); 
        y  =  input.nextInt();
        if ((x > 0) && (y > 0)) 
            System.out.println("Kuadran  I");
        else if ((x < 0) && (y > 0)) 
            System.out.println("Kuadran  II");
        else if ((x < 0) && (y < 0)) 
            System.out.println("Kuadran  III");
        else if ((x > 0) && (y < 0)) 
            System.out.println("Kuadran  IV");
        else
            System.out.println("Tidak  di  kuadran  manapun"); 
        input.close();
    }
}
