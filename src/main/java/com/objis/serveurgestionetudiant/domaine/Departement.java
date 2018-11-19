
package com.objis.serveurgestionetudiant.domaine;

import java.io.Serializable;

/**
 * *Creation de la   classe Departement 
 * @author Fallou
 * @since 10-11-2018
 * @version 1.0
 *
 */
public class Departement implements Serializable{

	private int numeroDepartement;
    private String nomDepartement;

    /**
     * Constructeur avec parametres permettant d'initialiser l'objet a sa
     * creation.
     *
     * @param numeroDepartement
     * @param nomDepartement
     */
    public Departement(int numeroDepartement, String nomDepartement) {
        this.numeroDepartement = numeroDepartement;
        this.nomDepartement = nomDepartement;
    }

    /**
     * Constructeur sans parametres.
     */
    public Departement() {
    }

    //Les :Accesseurs et Setteurs 
    /**
     *
     *@return
     */
    public int getNumeroDepartement() {
        return numeroDepartement;
    }

    /**
     *
     * @param numeroDepartement
     */
    public void setNumeroDepartement(int numeroDepartement) {
        this.numeroDepartement = numeroDepartement;
    }

    /**
     *
     * @return
     */
    public String getNomDepartement() {
        return nomDepartement;
    }

    /**
     *
     * @param nomDepartement
     */
    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    /**
     * Redefinition de la methode toString()
     *
     * @return
     */
    @Override
    public String toString() {
        return numeroDepartement + " " + nomDepartement;
    }

}
