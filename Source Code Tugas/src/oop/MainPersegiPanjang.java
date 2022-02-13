/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Rezky Yustisio
 */
public class MainPersegiPanjang {
    public static void main(String args[]){
        PersegiPanjang pp;
        pp = new PersegiPanjang(5, 3);
        System.out.println("OBJEK PERSEGI PANJANG");
        System.out.println("Panjang: " + pp.getPanjang());
        System.out.println("Lebar: " + pp.getLebar());
        System.out.println("Luas: " + pp.getLuas());
        System.out.println("Keliling: " + pp.getKeliling());
        
        System.out.println("");
        
        pp.setPanjang(5.3F);
        pp.setLebar(2.4F);
        System.out.println("OBJEK PERSEGI PANJANG");
        System.out.println("Panjang: " + pp.getPanjang());
        System.out.println("Lebar: " + pp.getLebar());
        System.out.println("Luas: " + pp.getLuas());
        System.out.println("Keliling: " + pp.getKeliling());
    }
    
}
