/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eksepsi;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Rezky Yustisio
 */
public class Aritmatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        try {
            System.out.println("Input nilai x: ");
            x = input.nextInt();
            System.out.println("Inpu nilai y: ");
            y = input.nextInt();
            System.out.println("x / y: " + (x/y));
        } catch (InputMismatchException ime) {
            System.out.println("Terjadi kesalahan: input");
        } catch (ArithmeticException ae) {
            System.out.println("Terjadi kesalahan: pembagian dengan nol");
        }
        input.close();
    }
}
