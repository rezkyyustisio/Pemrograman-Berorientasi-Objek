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
public class percobaan4 {
    public static void main(String args[]) {
        Task:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 3){
                    break;
                }
                System.out.println(i);
            }
        }
    }
}
