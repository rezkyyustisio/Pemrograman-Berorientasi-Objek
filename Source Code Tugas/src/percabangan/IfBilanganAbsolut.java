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
public class IfBilanganAbsolut {
    public  static  void  main(String[]  args)  { 
        float  bilangan;
        Scanner  input  =  new  Scanner(System.in); 
        System.out.print("Input  sebuah  bilangan  real:  "); 
        bilangan  =  input.nextFloat();
        if  (bilangan  <  0)
            bilangan  =  bilangan * -1;
        System.out.println("Nilai  absolut:  "  +  bilangan); 
        input.close();
    }
}
