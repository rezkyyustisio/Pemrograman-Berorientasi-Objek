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
public class TelevisiKite {
    private static int ID = 0;
    private int id = 0;
    final private String MEREK = "kite";
    private String warna;
    private String ukuranLayar;
    private int volume = 0;
    private int channel = 1;
    private final int MAKS_CHANNEL = 10;
    private boolean status = false; // true=hidup, false=mati
    
    public TelevisiKite(String warnaTv, String ukuranLayarTv){
        this.warna = warnaTv;
        this.ukuranLayar = ukuranLayarTv;
        ID++;
        id = ID;
    }
    
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
    
    public void setChannel(int channelTv) {
        this.channel = channelTv;
        if ((channel >= 1) && (channel <= 9)) {
            System.out.println("Channel sekarang " + channel);
        } else {
            System.out.println("Channel tidak ditemukan");
        }
    }
    
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

    public void volumeUp() {
        if (status == true) {
            if (volume < 100) {
                volume++;
                System.out.println("Up Volume sekarang " + volume);
            }
        }
    }
    
    public void volumeDown() {
        if (status == true) {
            if (volume > 0) {
                volume--;
                System.out.println("Down Volume sekarang " + volume);
            }
        }
    }
    
    public void displayInfo() {
        if (status == true) {
            System.out.println("ID Tv: " + id);
            System.out.println("Merek: " + MEREK);
            System.out.println("Warna: " + warna);
            System.out.println("Ukuran Layar: " + ukuranLayar);
            System.out.println("Channel: " + channel);
            System.out.println("Volume: " + volume);
        }
    }
}
