package com.objis.serveurgestionetudiant.domaine;

import java.io.Serializable;
import java.time.LocalDate;


/**
 *Creation de la Professeur heritant de la classe  classe Personne 
 * @author Fallou
 * @since 11-2018
 * @version 1.0
 */
public class Professeur extends Personne implements Serializable{
    
    private String numeroProfesseur;
    private SpecialiteProfesseur specialite;

    //Constructeur avec arguments

    /**
     *
     * @param numeroProfesseur
     * @param specialite
     * @param nom
     * @param prenom
     * @param naissance
     * @param adresse
     * @param sexe
     */

    public Professeur(String numeroProfesseur,  SpecialiteProfesseur specialite, String nom, String prenom, LocalDate naissance, String adresse,String sexe) {
        super(nom, prenom, naissance, adresse,sexe);
        this.numeroProfesseur = numeroProfesseur;
        this.specialite = specialite;
    }
 
    
    //Constructeur sans argument

    /**
     *
     */
    public Professeur() {
    }
    
    //Redifinition de la methode toString() en affichant les proprietes herites

    @Override
    public String toString() {
        return super.toString()+"SPECIALITE :" + specialite.getNomDeSpecialite() + '\n';
    }

    //Getteurs et Setteurs
    
    
    /**
     *
     * @return
     */
    public String getNumeroProfesseur() {
        return numeroProfesseur;
    }

    /**
     *
     * @param numeroProfesseur
     */
    public void setNumeroProfesseur(String numeroProfesseur) {
        this.numeroProfesseur = numeroProfesseur;
    }

    /**
     *
     * @return
     */
    public SpecialiteProfesseur getSpecialiteProfesseur() {
        return specialite;
    }

    /**
     *
     * @param spec
     */
    public void setSpecialiteProfesseur(SpecialiteProfesseur spec) {
        this.specialite = spec;
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
    
    
}
