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
public class IfGenapGanjil {
    public  static  void  main(String[]  args)  { 
        int  bilangan;
        Scanner  input  =  new  Scanner(System.in); 
        System.out.print("Input  sebuah  bilangan  bulat:  "); 
        bilangan  =  input.nextInt();
        if  (bilangan  %  2  ==  0) 
            System.out.println("Bilangan  Genap");
        else
            System.out.println("Bilangan  Ganjil"); 
        input.close();
    }
}
