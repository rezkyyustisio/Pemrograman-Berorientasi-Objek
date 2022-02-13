/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RezkyYustisioHadiPratama;

/**
 *
 * @author Rezky Yustisio
 */
public class MainPulpen {
    public static void main(String[] args){
        Pulpen pulpen1;
        pulpen1 = new Pulpen("Hitam", "Pilot", "5 Cm");
        
        System.out.println("Jenis Pulpen");
        pulpen1.jenisPulpen();
        
        System.out.println("");
        
        System.out.println("Aksi Pada Pulpen: ");
        pulpen1.tulis();
        System.out.println(pulpen1.aduk());
    }
}
