
package com.objis.serveurgestionetudiant.domaine;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Creation de la super classe Secretaire heritant de la super classe Personne
 *
 * @author Fallou
 * @since 11-2018
 * @version 1.0
 */
public class Secretaire extends Personne  implements Serializable{

    private String numeroSecretaire;
    private Departement departement;
//Constructeur sans parametres

    /**
     *
     */
    public Secretaire() {
    }
//Constructeur avec parametres

    /**
     *
     * @param numeroSecretaire
     * @param departement
     * @param nom
     * @param prenom
     * @param naissance
     * @param adresse
     * @param sexe
     */
    public Secretaire(String numeroSecretaire, Departement departement, String nom, String prenom, LocalDate naissance, String adresse, String sexe) {
        super(nom, prenom, naissance, adresse, sexe);
        this.numeroSecretaire = numeroSecretaire;
        this.departement = departement;
    }

    /**
     *
     * @return
     */
    public String getNumeroSecretaire() {
        return numeroSecretaire;
    }

    /**
     *
     * @param numeroSecretaire
     */
    public void setNumeroSecretaire(String numeroSecretaire) {
        this.numeroSecretaire = numeroSecretaire;
    }

    /**
     *
     * @return
     */
    public Departement getDepartement() {
        return departement;
    }

    /**
     *
     * @param departement
     */
    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    /**
     *
     * @return 
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     *
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     *
     * @return
     */
    public LocalDate getNaissance() {
        return naissance;
    }

    /**
     *
     * @param naissance
     */
    public void setNaissance(LocalDate naissance) {
        this.naissance = naissance;
    }

    /**
     *
     * @return
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     *
     * @param adresse
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     *
     * @return
     */
    public String getMail() {
        return mail;
    }

    /**
     *
     * @param mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     *
     * @return
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     *
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     *
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return
     */
    public String getSexe() {
        return sexe;
    }

    /**
     *
     * @param sexe
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    /**
     * Redefinition de la methode toString()
     *
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() + "DEPARTEMENT :" + departement.getNomDepartement() + '\n';
    }

}
