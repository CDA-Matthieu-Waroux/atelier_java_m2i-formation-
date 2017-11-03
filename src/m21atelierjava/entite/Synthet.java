/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m21atelierjava.entite;

/**
 *
 * @author Administrateur
 */
public class Synthet {
    protected boolean on ;
    protected String instrument ;
    protected int volume ;

    public Synthet(boolean on, String instrument, int volume) {
        this.on = on;
        this.instrument = instrument;
        this.volume = volume;
    }
    
    

    public boolean isOn() {
        return on;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getVolume() {
        return volume;
    }
    
    public void ClicBtOnOff(){
        if (on==true){ 
            on = false ;
            instrument = "None" ;
            volume = 0 ;
        }
        
        else{ 
            on = true ;
            instrument = "Piano" ;
             volume = 5 ;
                }}
    
    public void allumage () {
    
        on = true ;
        
    }
    public void eteindre() {
            
        on = false ;
        }
    public void volumePlus(){
        if (volume<10) {
            
                this.volume = this.volume +1 ;
            }
       
        }
    public void volumeMoins(){
        if(volume>0){
            this.volume=this.volume-1 ;
        }
       
    }
    
    public void jouerNote(String note){
        if (volume>0 && on==true){
            
            System.out.println(note);
        String txt = String.format("power=%s intruments=%s volume=%d" ,
                this.on ,
                this.instrument,
                this.volume );
        System.out.println(txt);
        }
       
    
  
        
    }
    public void affichage (){
        String txt = String.format("power=%s intruments=%s volume=%d" ,
                this.on ,
                this.instrument,
                this.volume );
        System.out.println(txt);
        
    }
}
