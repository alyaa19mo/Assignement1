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
public class TV {
    int channel;
   int volumeLevel;
   boolean on = false;
   
   
   
 public TV()
 {
     
 }
 public void turnON( )
 {
     if(on==true)
         System.out.println("the tv on");
 }
 public void turnOff( )
 {
     if(on==false)
         System.out.println("the tv off");
 
 }

    public void setChannel(int channel)
    {
         if ( channel >=1&&  channel <=120)
        this.channel = channel;
    }

    public void setVolumeLevel(int volumeLevel)
    {
              if ( volumeLevel >=1&&  volumeLevel<=7)
        this.volumeLevel = volumeLevel;
    }
    public void channelUp( int channel )
    { 
        if (  channel < 120)
    channel++;
    
    }  
    public void channelDown(int channel)
    {
       if (channel >1)
     channel--;
    
    }  
    public void volumeUp(int volumeLevel)
    {
         if ( volumeLevel>=1&&volumeLevel<=7)
       volumeLevel++;
        
    }
    public void volumeDown(int volumeLevel)
    {
        if(volumeLevel>1)
            volumeLevel--;
    }
}
