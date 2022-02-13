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
public class Televisi {
    private String merek;
    private String warna;
    private String ukuranLayar;
    private int volume = 0;
    private int channel = 1;
    private final int MAKS_CHANNEL = 10;
    private boolean status = false; // true=hidup, false=mati
    
    public Televisi(String merekTv, String warnaTv, String ukuranLayarTv){
        this.merek = merekTv;
        this.warna = warnaTv;
        this.ukuranLayar = ukuranLayarTv;
    }
    
    public String getMerek() {
        return merek;
    }
    
    public void powerOnOff() {
        if (status == false) {
            status = true;
            System.out.println("Televisi "+merek+ " On");
            this.displayInfo();
        } else {
            status = false;
            System.out.println("Televisi "+merek+" Off");
        }
    }
    
    public void setChannel(int channelTv) {
        this.channel = channelTv;
        if ((channel >= 1) && (channel <= 9)) {
            System.out.println(merek + " Channel sekarang " + channel);
        } else {
            System.out.println(merek + " Channel tidak ditemukan");
        }
    }
    
    public void nextChannel() {
        if (status == true){
            if (channel == MAKS_CHANNEL){
                channel = 1;
            } else {
                channel++;
            }
            System.out.println(merek + " Next Channel sekarang " + channel);
        }
    }
    
    public void prevChannel() {
        if (status == true) {
            if (channel == 1){
                channel = MAKS_CHANNEL;
            } else {
                channel--;
            }
            System.out.println(merek + " Prev Channel sekarang " + channel);
        }
    }

    public void volumeUp() {
        if (status == true) {
            if (volume < 100) {
                volume++;
                System.out.println(merek + " Up Volume sekarang " + volume);
            }
        }
    }
    
    public void volumeDown() {
        if (status == true) {
            if (volume > 0) {
                volume--;
                System.out.println(merek + " Down Volume sekarang " + volume);
            }
        }
    }
    
    public void displayInfo() {
        if (status == true) {
            System.out.println("Merek: " + merek);
            System.out.println("Warna: " + warna);
            System.out.println("Ukuran Layar: " + ukuranLayar);
            System.out.println("Channel: " + channel);
            System.out.println("Volume: " + volume);
        }
    }
}
