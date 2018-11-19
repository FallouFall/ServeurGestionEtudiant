
package com.objis.serveurgestionetudiant.domaine;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


/**
 * Creation de la super  classe Personne qui la superclasse (classe parent des classes Etudiant,Secretaire,Professeur)
 * @author Fallou
 * @version 1.0
 * @since 10-11-2018
 */
public class Personne  implements Serializable{
   /**
    * Les attributs necessaire pour la classe personne
    */
   
    protected String nom;

    /**
     *
     */
    protected String prenom;

    /**
     *
     */
    protected LocalDate   naissance;

    /**
     *
     */
    protected String adresse;

    /**
     *
     */
    protected String mail;

    /**
     *
     */
    protected String telephone;

    /**
     *
     */
    protected int    age;

    /**
     *
     */
    protected  String sexe;
    
    
//constructeur sans parametre de la classe Personne

    /**
     *
     */
 public Personne() {
    }
 
 //Constructeur avec parametre de la classe Personne
 //L'age est une donnee calculee a partir de la date de naissance.

    /**
     * Constructeur avec parametre de la classe Personne
     *L'age est une donnee calculee a partir de la date de naissance.
     * @param nom
     * @param prenom
     * @param naissance
     * @param adresse
     * @param sexe
     */
    public Personne( String nom, String prenom, LocalDate naissance, String adresse, String sexe) {
   
        this.nom = nom;
        this.prenom = prenom;
        this.naissance = naissance;
        this.adresse = adresse;
    
        this.sexe = sexe;
        this.age = (int)ChronoUnit.YEARS.between( naissance,LocalDate.now());
    }

   /**
     * Redefinition de la methode toString()
     *
     * @return
     */

    @Override
    public String toString() {
     return "Nom :"+nom+"\nPrenom :"+prenom+"\n"+"Adresse :"+adresse+"\nTelephone :"+telephone+"\n"
            + "Mail :"+mail+"\nDate De Naissance:"+naissance+"\n"+"GENRE :"+sexe+"\nAge :"+age+"\n";
    }
    
    
 
    
    
    
}
    
