/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eksepsi;
/**
 *
 * @author Rezky Yustisio
 */
public class EfekThrow {
    public static void main(String[] args) {
        RuntimeException r;
        r = new RuntimeException("Terjadi Eksepsi RuntimeException");
        System.out.println("Sebelum terjadi eksepsi");
        try {
            throw(r);
        } catch(RuntimeException re){
            
        }
        System.out.println("Sesudah terjadi eksepsi");
    }
}
