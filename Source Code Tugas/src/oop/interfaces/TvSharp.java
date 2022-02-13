/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.interfaces;

/**
 *
 * @author Rezky Yustisio
 */
public class TvSharp implements KontrolTv {
    
    private static int ID = 0;
    private int id = 0;
    private String merek = "kite";
    private String warna;
    private String ukuranLayar;
    private int volume = 0;
    private int channel = 1;
    private final int MAKS_CHANNEL = 10;
    private boolean status = false; // true=hidup, false=mati
    
    public TvSharp(String merekTv, String warnaTv, String ukuranLayarTv){
        this.merek = merekTv;
        this.warna = warnaTv;
        this.ukuranLayar = ukuranLayarTv;
    }

    @Override
    public void powerOnOff() {
        if (status == false) {
            status = true;
            System.out.println("Televisi "+id+" On");
            this.displayInfo();
        } else {
            status = false;
            System.out.println("Televisi "+id+" Off");
        }
    }

    @Override
    public void nextChannel() {
        if (status == true){
            if (channel == MAKS_CHANNEL){
                channel = 1;
            } else {
                channel++;
            }
            System.out.println("Next Channel sekarang " + channel);
        }
    }

    @Override
    public void prevChannel() {
        if (status == true) {
            if (channel == 1){
                channel = MAKS_CHANNEL;
            } else {
                channel--;
            }
            System.out.println("Prev Channel sekarang " + channel);
        }
    }

    @Override
    public void volumeUp() {
       if (status == true) {
            if (volume < 100) {
                volume++;
                System.out.println("Up Volume sekarang " + volume);
            }
        }
    }

    @Override
    public void volumeDown() {
        if (status == true) {
            if (volume > 0) {
                volume--;
                System.out.println("Down Volume sekarang " + volume);
            }
        }
    }

    @Override
    public void displayInfo() {
        if (status == true) {
            System.out.println("ID Tv: " + id);
            System.out.println("Merek: " + merek);
            System.out.println("Warna: " + warna);
            System.out.println("Ukuran Layar: " + ukuranLayar);
            System.out.println("Channel: " + channel);
            System.out.println("Volume: " + volume);
        }
    }
    
}
