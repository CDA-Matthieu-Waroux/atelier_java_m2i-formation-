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
public class SousMarin extends Vehicule {
    
        
     protected boolean plonge ;

    

    public boolean isPlonge() {
        return plonge;
    }

    public void setPlonge(boolean plonge) {
        this.plonge = plonge;
    }
    

    public SousMarin(boolean plonge, String marque, boolean utilitaire, String modele, String couleur, int nbPlaces, int x, int y, int z, int vitesse) {
        super(marque, utilitaire, modele, couleur, nbPlaces, x, y, z, vitesse);
        this.plonge = plonge;
    }

       
    @Override
    public void avancer() {
        super.avancer(); 
        
        if (plonge == true){
         
           this.y = this.y - pas ;
       }
       else {
            this.y = this.y + pas ;
        }
           
       }
      
  
    
    
}
