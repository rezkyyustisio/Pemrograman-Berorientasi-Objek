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
public class MainClass {
    public static void main(String[] args) {
        TvSharp tvSharp = new TvSharp("Sharp", "Silver", "29\"");
        tvSharp.powerOnOff();
        tvSharp.nextChannel();
    }
}
