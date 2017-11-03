/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m21atelierjava.entite.Avion;
import m21atelierjava.entite.SousMarin;
import m21atelierjava.entite.Vehicule;
import org.junit.Test;

/**
 *
 * @author Administrateur
 */
public class VehiculeTest {
    
//    @Test
    public void testAvion(){
        
        Avion a = new Avion("Boeing", false, "457", "blanc", 200, 0, 0, 0, 800) ;
        a.avancer();
        a.reculer();
        a.afficher();
    }
    
    
//   @Test
   public void testVehicule () {
       Vehicule vehic1 = new Vehicule("Ferrari", true, "F50", "rouge", 2, 0, 0, 0 ,100) ;
       Vehicule vehic2 = new Vehicule("Renaud 4", true, "4litres", "Violet", 4, 0, 0, 0, 10);
       Vehicule vehic3 = new Vehicule("Ford", true, "Mustang", "Noir", 4, 0, 0, 0, 500000);
       
      vehic3.avancer();
      vehic3.afficher();
      vehic3.setVitesse(3);
      vehic3.reculer();
      vehic3.afficher();
       
   }
    
   
   @Test
   public void testSousMarin () {
       
        SousMarin s1 = new SousMarin(true,"Le terrible", false, "S640", "noir", 0, 0, 0, 0, 46);
       
       s1.afficher();
       s1.setPlonge(true);
       s1.avancer();
       s1.afficher();
       s1.setPlonge(false);
       s1.avancer();
       s1.afficher();
   }
}
