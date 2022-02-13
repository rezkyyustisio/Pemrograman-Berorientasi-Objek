/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.polimorfisme;

/**
 *
 * @author Rezky Yustisio
 */
public class MainClass {
    public static void main(String[] args) {
        // Rekomendasi Konsep Polimorfisme
        Hewan[] animal = new Hewan[5];
        animal[0] = new Harimau();
        animal[1] = new Kucing();
        animal[2] = new Serigala();
        
        for (int i = 0; i < 3; i++) {
            animal[i].bersuara();
        }
    }
}
