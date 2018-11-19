/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.serveurgestionetudiant.service;

import com.objis.serveurgestionetudiant.domaine.Secretaire;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Fallou
 */
public interface ISecretaireRemote  extends Remote{
   
    
     /**
     *methode qui permet de d'ajouter un secretaire
     * @param e
     * @return
     * @throws java.rmi.RemoteException
     */
    public  Secretaire addSecretaire( Secretaire e)throws RemoteException ;
   
   
    /**
     * @return
     * @throws java.rmi.RemoteException
     */
    public  List<Secretaire> getListeSecretaire() throws RemoteException;

    /**
     *
     * @param secretaire
     * @return
     * @throws java.rmi.RemoteException
     */
    public  String genererMatriculeSecretaire(Secretaire secretaire) throws RemoteException;
      
    
     /**
     *methode qui permet de serialiser un secretaire (ecrire les donnees en memoire vers un flux de donnes binaires qu on va enregistrer dans
     * un fichier)
     * @param e
     * @throws java.rmi.RemoteException
     */
    public  void serialiseSecretaire(Secretaire e)throws RemoteException;
    
}
