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
public class RemoteKite {
    final private String MEREK = "Kite";
    private String warna;
    private TelevisiKite tk;
    
    public RemoteKite(TelevisiKite tk, String warnaTv) {
        this.tk = tk;
        this.warna = warnaTv;
    }
    
    public void powerOnOff() {
        tk.powerOnOff();
    }
    
    public void setChannel(int channelTv) {
        tk.setChannel(channelTv);
    }
    
    public void nextChannel() {
        tk.nextChannel();
    }
    
    public void prevChannel() {
        tk.prevChannel();
    }

    public void volumeUp() {
        tk.volumeUp();
    }
    
    public void volumeDown() {
        tk.volumeDown();
    }
    
    public void displayInfo() {
        tk.displayInfo();
    }
}
