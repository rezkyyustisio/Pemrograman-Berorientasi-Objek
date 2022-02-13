/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;
/**
 *
 * @author Rezky Yustisio
 */
import  java.util.Scanner;

public  class  IfBilanganGenap  {
    public  static  void  main(String[]  args)  { 
        int  bilangan;
        Scanner  input  =  new  Scanner(System.in); 
        System.out.print("Input  sebuah  bilangan  bulat:  "); 
        bilangan  =  input.nextInt();
        if  (bilangan  %  2  ==  0)
            System.out.println("Bilangan  yang  anda  masukkan  "  + "adalah  Bilangan  Genap");
        input.close();
    }
}

