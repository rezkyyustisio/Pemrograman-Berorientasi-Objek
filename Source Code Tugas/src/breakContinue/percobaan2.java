/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakContinue;

/**
 *
 * @author Rezky Yustisio
 */
public class percobaan2 {
    public static void main(String args[]) {
        int i = 1;
        Task:
        switch (i) {
            case 1: System.out.println("1");
            i++;
            switch (i) {
                case 1: System.out.println("1");
                case 2: System.out.println("2");
                        break;
                case 3: System.out.println("3");
            }
        case 2: System.out.println("2");
        case 3: System.out.println("3");
        }
    }
}
