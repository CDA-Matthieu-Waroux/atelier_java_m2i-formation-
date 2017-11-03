/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import m21atelierjava.entite.Synthet;
import org.junit.Test;

/**
 *
 * @author Administrateur
 */
public class TestSynthetiseur {
    
@Test
  public void TestSynthetiseur () {
      
      Synthet s1 = new Synthet(false , "piano", 0);
      
      s1.allumage();
      s1.volumePlus();
      s1.volumePlus();
      s1.volumeMoins();
      s1.affichage();
      s1.jouerNote("là");
      s1.jouerNote("Si");
      s1.ClicBtOnOff();
      s1.jouerNote("kuikui");
      s1.affichage();
      
  }
  
  
  @Test
  public void synthTest(){
      
  
      
      
  }
    
}
