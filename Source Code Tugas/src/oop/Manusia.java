/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;
// Instance Member
/**
 *
 * @author Rezky Yustisio
 */
public class Manusia {
    
    // variabel
    String nama;
    int umur;
    int beratBadan;
    int tinggiBadan;
    
    // default constructor
    public Manusia(){
        nama = "Budi";
        umur = 21;
        beratBadan = 60;
        tinggiBadan = 160;
    }
    
    // constructor 2
    public Manusia(String nama, int umur, int tinggiBadan, int beratBadan){
        this.nama = nama;
        this.umur = umur;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }
    
    public Manusia(String nama){
        this.nama = nama;
    }
    
    // methods
    void berjalan(){
        System.out.println(nama + " Berjalan");
    }
    void berlari(){
        System.out.println(nama + " Berlari");
    }
    
    int kecepatanBerlari(){
        return 100;
    }
    
    void makan(){
        System.out.println(nama + " Makan");
    }
    void minum(){
        System.out.println(nama + " Minum");
    } 
    
}
