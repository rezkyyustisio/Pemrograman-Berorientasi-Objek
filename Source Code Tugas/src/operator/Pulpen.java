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
public class Pulpen {
    private String warnaPulpen;
    private String merkPulpen;
    private String panjangPulpen;
    
    public Pulpen(String warnaPulpen, String merkPulpen, String panjangPulpen){
        this.warnaPulpen = warnaPulpen;
        this.merkPulpen = merkPulpen;
        this.panjangPulpen = panjangPulpen;
    }
    
    public void tulis(){
        System.out.println("Tulis");
    }
    
    public String aduk(){
        return "Mengaduk";
    }
    
    public void jenisPulpen(){
        System.out.println("Warna Pulpen: " + warnaPulpen);
        System.out.println("Merk Pulpen: " + merkPulpen);
        System.out.println("Panjang Pulpen: " + panjangPulpen);
    }
    
    
}
