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
public class IfHurufVokal {
    public  static  void  main(String[]  args)  { 
        char huruf;
        Scanner  input  =  new  Scanner(System.in); 
        System.out.print("Input  sebuah  huruf:  "); 
        huruf  =  input.next().toLowerCase().charAt(0);
        if  ((huruf  ==  'a')  ||  (huruf  ==  'i')  ||(huruf  ==  'u')
        ||  (huruf  ==  'e')  ||  (huruf  ==  'o'))  { 
            System.out.println("Huruf  Vokal");
        }
        input.close();
    }
}
