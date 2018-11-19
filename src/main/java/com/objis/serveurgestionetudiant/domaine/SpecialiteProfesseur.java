
package com.objis.serveurgestionetudiant.domaine;

import java.io.Serializable;

/**
 *Creation de la classe SpecialiteProfesseur 
 * @author Fallou
 * @since 10-11-2018
 * @version 1.0
 * 
 */
public class SpecialiteProfesseur implements Serializable{
    private int numeroSpecialite;
    private String nomDeSpecialite;

    /**
     *
     */
    public SpecialiteProfesseur() {
    }

    /**
     *
     * @param numeroSpecialite
     * @param nomDeSpecialite
     */
    public SpecialiteProfesseur(int numeroSpecialite, String nomDeSpecialite) {
        this.numeroSpecialite = numeroSpecialite;
        this.nomDeSpecialite = nomDeSpecialite;
    }

    /**
     *
     * @return
     */
    public int getNumeroSpecialite() {
        return numeroSpecialite;
    }

    /**
     *
     * @param numeroSpecialite
     */
    public void setNumeroSpecialite(int numeroSpecialite) {
        this.numeroSpecialite = numeroSpecialite;
    }

    /**
     *
     * @return
     */
    public String getNomDeSpecialite() {
        return nomDeSpecialite;
    }

    /**
     *
     * @param nomDeSpecialite
     */
    public void setNomDeSpecialite(String nomDeSpecialite) {
        this.nomDeSpecialite = nomDeSpecialite;
    }

    
    
     /**
     * Redefinition de la methode toString()
     *
     * @return
     */
    @Override
    public String toString() {
        return   numeroSpecialite + "-" + nomDeSpecialite +"\n";
    }
    
    
    
    
}
