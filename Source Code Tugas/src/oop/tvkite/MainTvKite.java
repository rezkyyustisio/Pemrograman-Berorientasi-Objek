/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.tvkite;

/**
 *
 * @author Rezky Yustisio
 */
public class MainTvKite {
    public static void main(String[] args) {
        TelevisiKite tk1 = new TelevisiKite("Hitam", "14");
        tk1.powerOnOff();
        System.out.println("");
        TelevisiKite tk2 = new TelevisiKite("Biru", "15");
        tk2.powerOnOff();
        
        RemoteKite rk1 = new RemoteKite(tk1, "Hitam");
        rk1.nextChannel();
        
        RemoteKite rk2 = new RemoteKite(tk2, "Biru");
        System.out.println("");
        rk2.powerOnOff();
        System.out.println("");
        rk2.powerOnOff();
    }
}
