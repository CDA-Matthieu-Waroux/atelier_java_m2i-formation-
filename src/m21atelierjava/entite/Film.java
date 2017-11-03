/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m21atelierjava.entite;

import java.util.Date;

/**
 *
 * @author Administrateur
 */
public class Film {
    
    private String titre ;
    private String synopsis ;
    private int anneeDeProduction ;
    private Date dateCreation ;
   
 public void affiche () {
     System.out.println(titre+" "+synopsis+" "+ anneeDeProduction +" "+ dateCreation);
 }//on peux éviter la concaténation avec String.format , le %d est utilisé pour les chiffres et %s pour le texte :)
 
    public void initiale (String titre , String synopsis , int anneeDeProduction ,Date dateCreation){
     this.titre = titre ;
     this.synopsis = synopsis ;
     this.anneeDeProduction = anneeDeProduction ;
     this.dateCreation = dateCreation ;
 }
    
    
    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getAnneeDeProduction() {
        return anneeDeProduction;
    }

    public void setAnneeDeProduction(int anneeDeProduction) {
        this.anneeDeProduction = anneeDeProduction;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
    
    
    
    public String getTitre() {
        return titre ;
    }
     
    public void setTitre(String t){
        titre = t ;
    }
    
    public int getAnneDeProduction(){
        return anneeDeProduction ;
    }
    
    public void setAnneDeProduction (int dc) {
        anneeDeProduction = dc ;
    }
    
    
    
   
    
}
