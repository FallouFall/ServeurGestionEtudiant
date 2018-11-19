package com.objis.serveurgestionetudiant.service;

import com.objis.serveurgestionetudiant.domaine.Inscription;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Fallou
 */
public interface IInscriptionRemote  extends Remote{
    

         /**
     *methode qui permet de d'ajouter une inscription
     * @param e
     * @return
     * @throws java.rmi.RemoteException
     */
    public  Inscription addInscription( Inscription e)throws RemoteException ;


    /**
     * methode qui initialise et retourne la liste des inscriptions
     *
     * @return
     * @throws java.rmi.RemoteException
     */
    public  List<Inscription> getListeInscriptions() throws RemoteException ;

    
     /**
     *methode qui permet de serialiser une inscription (ecrire les donnees en memoire vers un flux de donnes binaires qu on va enregistrer dans
     * un fichier)
     * @param e
     * @throws java.rmi.RemoteException
     */
    public  void serialiseInscription(Inscription e)throws RemoteException;
    
      /**
     *methode qui permet de deserialiser une inscription (lire les donnees binaires  a partir d'un support physique (fichier)qu on va enregistrer dans
     * une liste)
     * @throws java.rmi.RemoteException
     * @throws java.io.FileNotFoundException
     */
    public  void deserialiseInscription() throws   RemoteException,FileNotFoundException,IOException;

}
