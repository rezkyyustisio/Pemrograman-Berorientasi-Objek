/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;
import java.util.Scanner;

/**
 *
 * @author Rezky Yustisio
 */
public class soal6While {
    public static void main(String args[]) {
        int n, faktorial, i;
        Scanner input = new Scanner(System.in);
        System.out.print("Input nilai N: ");
        n = input.nextInt();
        faktorial = 1;
        i = 1;
        while(i <= n){
            faktorial *= i;
            i++;
        }
        System.out.println("Nilai faktorial dari " + n + ": " + faktorial);
        input.close();
    }
}
