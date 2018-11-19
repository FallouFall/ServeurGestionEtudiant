
package com.objis.serveurgestionetudiant.domaine;

import java.io.Serializable;


/**
 * *Creation de la   classe Filiere 
 * @author Fallou
 * @since 10-11-2018
 * @version 1.0
 */
public class Filiere implements Serializable{

    private String matriculeFiliere;
    private String nomFiliere;
    private double prixInscription;
    private double mensualiteInscription;

    /**
     *Constructeur avec parametres
     * @param matriculeFiliere
     * @param nomFiliere
     * @param prixInscription
     * @param mensualiteInscription
     */
    public Filiere(String matriculeFiliere, String nomFiliere, double prixInscription, double mensualiteInscription) {
        this.matriculeFiliere = matriculeFiliere;
        this.nomFiliere = nomFiliere;
        this.prixInscription = prixInscription;
        this.mensualiteInscription = mensualiteInscription;
    }

    /**
     *Constructeur sans parametres
     */
    public Filiere() {
    }

    /**
     *
     * @return
     */
    public String getMatriculeFiliere() {
        return matriculeFiliere;
    }

    /**
     *
     * @param matriculeFiliere
     */
    public void setMatriculeFiliere(String matriculeFiliere) {
        this.matriculeFiliere = matriculeFiliere;
    }

    /**
     *
     * @return
     */
    public String getNomFiliere() {
        return nomFiliere;
    }

    /**
     *
     * @param nomFiliere
     */
    public void setNomFiliere(String nomFiliere) {
        this.nomFiliere = nomFiliere;
    }

    /**
     *
     * @return
     */
    public double getPrixInscription() {
        return prixInscription;
    }

    /**
     *
     * @param prixInscription
     */
    public void setPrixInscription(double prixInscription) {
        this.prixInscription = prixInscription;
    }

    /**
     *
     * @return
     */
    public double getMensualiteInscription() {
        return mensualiteInscription;
    }

    /**
     *
     * @param mensualiteInscription
     */
    public void setMensualiteInscription(double mensualiteInscription) {
        this.mensualiteInscription = mensualiteInscription;
    }

    /**
     * Redefinition de la methode toString()
     *
     * @return
     */
    @Override
    public String toString() {
        return "MATRICULE FILIERE:" + matriculeFiliere + "  NOM FILIERE :" + nomFiliere +"  ";
    }

}
