package com.objis.serveurgestionetudiant.service;

import com.objis.serveurgestionetudiant.domaine.Professeur;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Fallou
 */
public interface IProfesseurRemote extends Remote{
    
  
     
     /**
     *methode qui permet de d'ajouter un professeur
     * @param e
     * @return
     * @throws java.rmi.RemoteException
     */
    public  Professeur addProfesseur( Professeur e)throws RemoteException ;

  

    /**
     * @return
     * @throws java.rmi.RemoteException
     */
    public  List<Professeur> getListeProfesseur()  throws RemoteException;
    
     /**
     *methode qui permet de serialiser un professeur (ecrire les donnees en memoire vers un flux de donnes binaires qu on va enregistrer dans
     * un fichier)
     * @param e
     * @throws java.rmi.RemoteException
     */
    public  void serialiseProfesseur(Professeur e) throws RemoteException;

    /**
     *
     * @param professeur
     * @return
     * @throws java.rmi.RemoteException
     */
    public  String genererMatriculeProfesseur(Professeur professeur) throws RemoteException ;
}
