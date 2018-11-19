
package com.objis.serveurgestionetudiant.domaine;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *Creation de la   classe Etudiant heritant de la classe Personne 
 * @author Fallou
 * @since 10-11-2018
 * @version 1.0
 */
public class Etudiant extends Personne implements Serializable{

    private String matriculeEtudiant;

   
    /**
     *Constructeur sans argument de la classe Etudiant
     */
    public Etudiant() {
    }

    //Surcharge du constructeur de la classe Etudiant
    /**
     *
     * @param matricule
     */
    public Etudiant(String matricule) {
        this.matriculeEtudiant = matricule;
    }

    //Constructeur avec arguments de la classe Etudiant
    /**
     * Constructeur avec parametres permettant d'initialiser l'objet a sa
     * creation. L.age est calcule a la creation de l'objet
     *
     * @param matricule
     * @param nom
     * @param prenom
     * @param naissance
     * @param adresse
     * @param sexe
     */
    public Etudiant(String matricule, String nom, String prenom, LocalDate naissance, String adresse, String sexe) {
        super(nom, prenom, naissance, adresse,  sexe);
        this.matriculeEtudiant = matricule;
    }

    
    
    /**
     *Les getteurs qui nous permettrons d'acceder au attributs de visibilite private
     *A part le matricule les autres attributs sont herites de la classe mere Personne
     * @return
     */
    public String getMatricule() {
        return matriculeEtudiant;
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
     * @return
     */
    public String getPrenom() {
        return prenom;
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
     * @return
     */
    public String getAdresse() {
        return adresse;
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
     * @return
     */
    public String getTelephone() {
        return telephone;
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
     * @return
     */
    public String getSexe() {
        return sexe;
    }

    //Les setteurs qui nous permettrons d'acceder au attributs de visibilite private
    /**
     *
     * @param matricule
     */
    public void setMatricule(String matricule) {
        this.matriculeEtudiant = matricule;
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
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
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
     * @param adresse
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
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
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
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
     * @param sexe
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    /**
     * Redefinition de la methode toString() en affichant les proprites herites
     * de la super classe Personne
     *
     * @return
     */
    @Override
    public String toString() {
        return "\n\n#########LES INFORMATIONS DE ETUDIANT #########\n\nMatricule :" + matriculeEtudiant + "\n" + super.toString();
    }

}
