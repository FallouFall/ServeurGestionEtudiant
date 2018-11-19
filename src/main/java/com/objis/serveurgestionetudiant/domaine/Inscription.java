
package com.objis.serveurgestionetudiant.domaine;

import java.io.Serializable;
import java.time.LocalDate;


/**
 *Creation de la  classe Inscription  
 * @author Fallou
 * @since 10-11-2018
 * @version 1.0
 */
public class Inscription implements Serializable{

    private Etudiant etudiant;
    private LocalDate dateInscription;
    private Filiere filiere;

    /**
     *Constructeur avec parametres
     * @param etudiant
     * @param dateInscription
     * @param filiere
     */
    public Inscription(Etudiant etudiant, LocalDate dateInscription, Filiere filiere) {
        this.etudiant = etudiant;
        this.dateInscription = dateInscription;
        this.filiere = filiere;
    }

    /**
     *Constructeur sans parametres
     */
    public Inscription() {
    }

    /**
     *
     * @return
     */
    public Etudiant getEtudiant() {
        return etudiant;
    }

    /**
     *
     * @param etudiant
     */
    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    /**
     *
     * @return
     */
    public LocalDate getDateInscription() {
        return dateInscription;
    }

    /**
     *
     * @param dateInscription
     */
    public void setDateInscription(LocalDate dateInscription) {
        this.dateInscription = dateInscription;
    }

    /**
     *
     * @return
     */
    public Filiere getFiliere() {
        return filiere;
    }

    /**
     *
     * @param filiere
     */
    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    /**
     * Redefinition de la methode toString()
     *
     * @return
     */
    @Override
    public String toString() {
        return etudiant.toString() + "MATRICLE INSCRIPTION :" + filiere.getMatriculeFiliere() + "\nDATE INSCRIPTION :" + dateInscription ;
    }

}
