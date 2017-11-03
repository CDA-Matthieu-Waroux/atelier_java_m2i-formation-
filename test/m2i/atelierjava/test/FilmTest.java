/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import java.util.Date;
import m21atelierjava.entite.Film;
import org.junit.Test;



/**
 *
 * @author Administrateur
 */
public class FilmTest {
    
    
    @Test
    public void nouveauFilm () {
        
        Film f1 = new Film() ; 
//        f1.setTitre("Dracula");
//        f1.setAnneDeProduction(2001);
        Film f2 = new Film() ;
//        f2.setTitre("Kung Fu PANDA"); 
//        f2.setAnneDeProduction(2010);
       Date d = new Date() ;
        
        
//        System.out.println(f1.getTitre() +": " +f1.getAnneDeProduction());
//        System.out.println(f2.getTitre() +": " + f2.getAnneDeProduction() );
//        
     f1.initiale("Titanic", "bato", 1993, d );
              f1.affiche();
     f2.initiale("Peter Pan", "un enfant", 1547,d);
              f2.affiche();
        
     
                
        
        
        
    }
    
}
