/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.tv2;

/**
 *
 * @author Rezky Yustisio
 */
public class MainTelevisi {
    public static void main(String[] args) {
        Televisi tvSharp1;
        Televisi tvSharp2;
        Remote rm = new Remote("Sharp", "Abu-abu");
        
        tvSharp1 = new Televisi("Sharp", "Hitam", "25 Inch");
        tvSharp2 = new Televisi("Hitam", "Sharp", "20 Inch");
        rm.powerOnOff(tvSharp1);
        rm.powerOnOff(tvSharp2);
    }
}
