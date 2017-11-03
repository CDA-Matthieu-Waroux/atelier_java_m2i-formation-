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
public class Serie {
    private String titre ;
    private int anneeDeSortie ;
    private int nbDeSaisons ;
    private String synopsis ;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnneeDeSortie() {
        return anneeDeSortie;
    }

    public void setAnneeDeSortie(int anneeDeSortie) {
        this.anneeDeSortie = anneeDeSortie;
    }

    public int getNbDeSaisons() {
        return nbDeSaisons;
    }

    public void setNbDeSaisons(int nbDeSaisons) {
        this.nbDeSaisons = nbDeSaisons;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    
    public void serieAffiche () {
        
        System.out.println(
        "Titre : "+this.titre + " , " + 
        "Annee de Sortie : " + this.anneeDeSortie + " , " +
        "Nb de saisons :" + this.nbDeSaisons + " , " + 
        "Synospsis :" +this.synopsis + " , "  ) ;
    }
    public void initialise (String titre , String synopsis , int nbSaisons , int anneeSortie) {
        
        this.titre = titre ;
        this.synopsis = synopsis ;
        this.nbDeSaisons = nbSaisons ;
        this.anneeDeSortie = anneeSortie ;
        
    }
}
