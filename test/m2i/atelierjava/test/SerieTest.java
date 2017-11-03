/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m21atelierjava.entite.Serie;
import org.junit.Test;

/**
 *
 * @author Administrateur
 */
public class SerieTest {
    @Test
    public void nouveauSerie() {
        Serie s1 = new Serie() ;
        s1.initialise("mon sexe est un volcan", "une fille rencontre un garçon", 6 , 1993);
        
        s1.serieAffiche();
                
    }
    
    
}
