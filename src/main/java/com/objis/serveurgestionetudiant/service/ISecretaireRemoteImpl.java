package com.objis.serveurgestionetudiant.service;

import com.objis.serveurgestionetudiant.domaine.Secretaire;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fallou
 */
public class ISecretaireRemoteImpl  extends UnicastRemoteObject implements ISecretaireRemote{

 
  
   private List<Secretaire> listeSecretaire;

    File file;
    transient  FileOutputStream fileOuputStream = null;
    transient ObjectOutputStream objectOutputStream = null;


    /**
     *
     * @throws RemoteException
     */
    public ISecretaireRemoteImpl() throws RemoteException,UnsupportedOperationException{
         
    }
  
    @Override
    public List<Secretaire> getListeSecretaire() throws RemoteException {
           if (listeSecretaire == null) {
            listeSecretaire = new ArrayList<>();
        }
        return listeSecretaire;
    }

    @Override
    public String genererMatriculeSecretaire(Secretaire secretaire) throws RemoteException {
        int numeroGenerer = (int) (Math.random() * 9999999);
        return "MATSEC" + LocalDate.now().getYear() + secretaire.getNom().charAt(0) + secretaire.getPrenom().charAt(1) + numeroGenerer;
    }

    @Override
    public Secretaire addSecretaire(Secretaire e) throws RemoteException {
       listeSecretaire=getListeSecretaire();
       listeSecretaire.add(e);
       return  e;
    }

    @Override
    public void serialiseSecretaire(Secretaire e) throws RemoteException {
        try {

            file = new File("secretaires.txt");
            fileOuputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOuputStream);

            objectOutputStream.writeObject(e);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOuputStream.close();
        } catch (IOException ex) {
            Logger.getLogger(IEtudiantRemoteImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
