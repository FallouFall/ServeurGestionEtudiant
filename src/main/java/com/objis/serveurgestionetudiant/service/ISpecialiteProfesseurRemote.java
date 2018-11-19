package com.objis.serveurgestionetudiant.service;

import com.objis.serveurgestionetudiant.domaine.SpecialiteProfesseur;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Fallou
 */
public interface ISpecialiteProfesseurRemote extends Remote{
    
    
    /**
     * methode qui initialise et retourne la liste des professeurs
     * @return
     * @throws java.rmi.RemoteException
     */
    public  List<SpecialiteProfesseur> getListeProfesseur() throws RemoteException;
      
    /**
     *methode qui recherche un specialite
     * @param nomSpecialite
     * @return
     * @throws java.rmi.RemoteException
     */
    public SpecialiteProfesseur findSpecialiteProfesseur(String nomSpecialite) throws RemoteException ;
  
 /**
     *methode qui permet de serialiser une specialisation (ecrire les donnees en memoire vers un flux de donnes binaires qu on va enregistrer dans
     * un fichier)
     * @param e
     * @throws java.rmi.RemoteException
     */
    public  void serialiseSpecialite(SpecialiteProfesseur e)throws RemoteException;
    
         /**
     *methode qui permet de d'ajouter un specialite d'un professeur
     * @param e
     * @return
     * @throws java.rmi.RemoteException
     */
    public  SpecialiteProfesseur addSpecialiteProfesseur( SpecialiteProfesseur e)throws RemoteException ;
}
