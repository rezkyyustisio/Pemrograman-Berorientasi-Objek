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
public class PersegiPanjang {
    
    // Variabel
    private float panjang; // Class Member
    private float lebar; // Instance Member
    private float luas; // Instance Member
    private float keliling; // Instace Member
    static int id = 0; // Class Member 
    
    // Constructor A
    public PersegiPanjang(float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        id = id + 1;
    }
    
    public void setPanjang(float panjang){
        this.panjang = panjang;
    }
    
    public float getPanjang(){
        return panjang;
    }
    
    public void setLebar(float lebar){
        this.lebar = lebar;
    }
    
    public float getLebar(){
        return lebar;
    }
    
    public float getLuas(){
        hitungLuas();
        return luas;
    }
    
    public float getKeliling(){
        hitungKeliling();
        return keliling;
    }
    
    // methods
    void hitungLuas(){
        luas = panjang * lebar;
    }
    
    void hitungKeliling(){
        keliling = 2 * (panjang + lebar);
    }
}
