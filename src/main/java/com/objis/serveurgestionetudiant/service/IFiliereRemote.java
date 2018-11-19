/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.serveurgestionetudiant.service;

import com.objis.serveurgestionetudiant.domaine.Filiere;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Fallou
 */
public interface IFiliereRemote  extends Remote{
    
    /**
     * methode qui retourne la liste des filiere
     *
     * @return
     * @throws java.rmi.RemoteException
     */
    public  List<Filiere> getListeFiliere()  throws RemoteException;

      /**
     *methode qui permet de d'ajouter un etudiant
     * @param e
     * @return
     * @throws java.rmi.RemoteException
     */
    public  Filiere addEFiliere( Filiere e)throws RemoteException ;

 /**
     *methode qui permet de serialiser un filiere (ecrire les donnees en memoire vers un flux de donnes binaires qu on va enregistrer dans
     * un fichier)
     * @param e
     * @throws java.rmi.RemoteException
     */
    public  void serialiseFiliere(Filiere e) throws RemoteException;
    /**
     *methode qui permet de retrouver une filiere
     * @param matriculeFiliere
     * @return
     * @throws java.rmi.RemoteException
     */
    public  Filiere findFiliere(String matriculeFiliere) throws RemoteException;
  /**
     *methode qui permet de deserialiser un filiere (lire les donnees binaires  a partir d'un support physique (fichier)qu on va enregistrer dans
     * une liste)
     * @throws java.rmi.RemoteException
     * @throws java.io.FileNotFoundException
     */
    public  void deserialiseFiliere() throws  IOException;

    /**
     *methode qui genere le matricule de L'inscription
     * @param nomFilire
     * @return matricule
     * @throws java.rmi.RemoteException
     */
    public  String genererMatriculeInscrption(String nomFilire) throws RemoteException ;
 
}
