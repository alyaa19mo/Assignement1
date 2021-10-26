/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignement;

/**
 *
 * @author USER
 */
public class Assignement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TV t=new TV();
        t.turnON();
        t.setChannel(100);
        t.setVolumeLevel(5);
        System.out.println(" channel=" + t.channel +" VolumeLevel="  + t.volumeLevel);
    }
    
}
