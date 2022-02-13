/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eksepsi;
import java.io.IOException;
/**
 *
 * @author Rezky Yustisio
 */
public class MainClass {
    public static void main(String[] args) {
        SuatuKelas kelas = new SuatuKelas();
        kelas.methodA();
        try {
            kelas.methodB();
        } catch (IOException ioe){
            
        }
    }
}
