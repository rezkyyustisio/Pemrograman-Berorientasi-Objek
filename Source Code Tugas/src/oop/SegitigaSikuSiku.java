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
public class SegitigaSikuSiku {
    // Variabel
    private float alas; // Class Member
    private float tinggi; // Instance Member
    private float luas; // Instance Member
    
    public SegitigaSikuSiku(float alas, float tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public void setAlas(float alas){
        this.alas = alas;
    }
    
    public float getAlas(){
        return alas;
    }
    
    public void setTinggi(float tinggi){
        this.tinggi = tinggi;
    }
    
    public float getTinggi(){
        return tinggi;
    }
    
    public float getLuas(){
        hitungLuas();
        return luas;
    }
    
    // methods
    void hitungLuas(){
        luas = 0.5f * alas * tinggi;
    }
    
}
