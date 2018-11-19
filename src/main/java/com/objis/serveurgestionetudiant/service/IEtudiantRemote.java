package com.objis.serveurgestionetudiant.service;

import com.objis.serveurgestionetudiant.domaine.Etudiant;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Fallou
 */
public interface IEtudiantRemote  extends Remote{
    
    
      /**
     *methode qui permet de d'ajouter un etudiant
     * @param e
     * @return
     * @throws java.rmi.RemoteException
     */
    public  Etudiant addEtudiant( Etudiant e)throws RemoteException ;

    /**
     *methode qui permet d initialiser et de recuperer la liste des etudiant
     * @return
     * @throws java.rmi.RemoteException
     */
    public  List<Etudiant> getListeEtudiant() throws RemoteException ;
        
 /**
     *methode qui permet de serialiser un etudiant (ecrire les donnees en memoire vers un flux de donnes binaires qu on va enregistrer dans
     * un fichier)
     * @param e
     * @throws java.rmi.RemoteException
     * @throws java.io.FileNotFoundException
     */
    public  void serialiseEtudiant(Etudiant e) throws   RemoteException,FileNotFoundException,IOException;
    
     /**
     *methode qui permet de serialiser un etudiant (lire les donnees binaires  a partir d'un support physique (fichier)qu on va enregistrer dans
     * une liste)
     * @throws java.rmi.RemoteException
     * @throws java.io.FileNotFoundException
     */
    public  void deserialiseEtudiant() throws   RemoteException,FileNotFoundException,IOException;
    /**
     *methode permettant de generer un matricule 
     * @param etudiant
     * @return
     * @throws java.rmi.RemoteException
     */
    public  String genererMatriculeEtudiant(Etudiant etudiant) throws RemoteException;


    /**
     *methode permettant de rechercher un etudiant
     * @param matriculeEtudiant
     * @return
     * @throws java.rmi.RemoteException
     */
    public  Etudiant findEtudiant(String matriculeEtudiant) throws RemoteException;


}
