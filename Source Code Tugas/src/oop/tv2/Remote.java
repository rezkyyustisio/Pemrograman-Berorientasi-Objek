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
public class Remote {
    private String merek;
    private String warna;
    
    public Remote(String merekTv, String warnaTv) {
        this.merek = merekTv;
        this.merek = warnaTv;
    }
    
    public void powerOnOff(Televisi tv) {
        if (tv.getMerek().equals("Sharp")){
            tv.powerOnOff();
        } else {
            System.out.println("Merek tidak dikenali");
        }
    }
    
    public void setChannel(Televisi tv, int channelTv) {
        tv.setChannel(channelTv);
    }
    
    public void nextChannel(Televisi tv) {
        tv.nextChannel();
    }
    
    public void prevChannel(Televisi tv) {
        tv.prevChannel();
    }

    public void volumeUp(Televisi tv) {
        tv.volumeUp();
    }
    
    public void volumeDown(Televisi tv) {
        tv.volumeDown();
    }
    
    public void displayInfo(Televisi tv) {
        tv.displayInfo();
    }
}
