package com.objis.serveurgestionetudiant.service;

import com.objis.serveurgestionetudiant.domaine.Professeur;
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
public class IProfesseurRemoteImpl  extends UnicastRemoteObject implements IProfesseurRemote{
  
 

  private List<Professeur> listeProfesseur;
  
    File file;
transient     FileOutputStream fileOuputStream = null;
   transient  ObjectOutputStream objectOutputStream = null;

   

    /**
     *
     * @throws RemoteException
     */
    public IProfesseurRemoteImpl() throws  RemoteException,UnsupportedOperationException{
        
        
    }

    
   
    @Override
    public List<Professeur> getListeProfesseur() throws RemoteException {
            if (listeProfesseur == null) {
            listeProfesseur = new ArrayList<>();
        }
        return listeProfesseur;
    }

    @Override
    public String genererMatriculeProfesseur(Professeur professeur) throws RemoteException {
        int numeroGenerer = (int) (Math.random() * 9999999);
        return "MATPROF" + LocalDate.now().getYear() + professeur.getNom().charAt(0) + professeur.getPrenom().charAt(2) + numeroGenerer;
    }

    @Override
    public Professeur addProfesseur(Professeur e) throws RemoteException {
       this.listeProfesseur=getListeProfesseur();
       listeProfesseur.add(e);
       return  e;
    }

    @Override
    public void serialiseProfesseur(Professeur e) throws RemoteException  {
      try {

            file = new File("professeurs.txt");
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
