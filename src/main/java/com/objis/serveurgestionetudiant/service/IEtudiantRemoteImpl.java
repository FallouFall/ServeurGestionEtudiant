package com.objis.serveurgestionetudiant.service;

import com.objis.serveurgestionetudiant.domaine.Etudiant;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Creation de la classe GererEtudiant qui contient les services lies a la
 * gestion des etudiants
 *
 * @author Fallou
 * @since 11-2018
 * @version 1.0
 */
public class IEtudiantRemoteImpl extends UnicastRemoteObject implements IEtudiantRemote {

   

   private List<Etudiant> listeEtudiant;

    File file;
    transient    FileOutputStream fileOuputStream = null;
    transient ObjectOutputStream objectOutputStream = null;

   transient  FileInputStream fileInputStream = null;
   transient  ObjectInputStream objectIntputStream = null;
    /**
     *
     * @throws RemoteException
     * @throws java.io.FileNotFoundException
     */
    public IEtudiantRemoteImpl() throws RemoteException, FileNotFoundException, IOException {
    //  throw new UnsupportedOperationException();
    }

    /**
     * methode qui permet d initialiser et de recuperer la liste des etudiant
     *
     * @return
     */
    @Override
    public List<Etudiant> getListeEtudiant() throws RemoteException {
        if (listeEtudiant == null) {
            listeEtudiant = new ArrayList<>();
        }
        return listeEtudiant;
    }

    /**
     * methode permettant de generer un matricule
     *
     * @param etudiant
     * @return
     */
    @Override
    public String genererMatriculeEtudiant(Etudiant etudiant) throws RemoteException {
        int numeroGenerer = (int) (Math.random() * 9999999);
        return "MATET" + LocalDate.now().getYear() + etudiant.getNom().charAt(0) + etudiant.getPrenom().charAt(2) + numeroGenerer;
    }

    /**
     * methode permettant de rechercher un etudiant
     *
     * @param matriculeEtudiant
     * @return
     */
    @Override
    public Etudiant findEtudiant(String matriculeEtudiant) throws RemoteException {
        return getListeEtudiant()
                .stream()
                .filter(etudiant -> etudiant.getMatricule().equalsIgnoreCase(matriculeEtudiant))
                .findAny()
                .orElse(null);
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) throws RemoteException {
        listeEtudiant = getListeEtudiant();
        listeEtudiant.add(e);
        
         //serialisation de l etudant
        try {
           
            serialiseEtudiant(e);
        } catch (IOException ex) {
            Logger.getLogger(IEtudiantRemoteImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return e;
    }

    @Override
    public void serialiseEtudiant(Etudiant e) throws  RemoteException, FileNotFoundException, IOException {
      

      
            file = new File("etudiants.dat");
            fileOuputStream = new FileOutputStream(file,true);
            objectOutputStream = new ObjectOutputStream(fileOuputStream);

            objectOutputStream.writeObject(e);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOuputStream.close();
   
    
    }

    @Override
    public void deserialiseEtudiant() throws RemoteException, FileNotFoundException, IOException {
        try {
            Etudiant etudiant=null;
            listeEtudiant=  getListeEtudiant();
            
            file = new File("etudiants.dat");
            fileInputStream = new FileInputStream(file);
            objectIntputStream = new ObjectInputStream(fileInputStream);
            
            while ((etudiant = (Etudiant) objectIntputStream.readObject()) != null) {
                if (etudiant instanceof Etudiant) {
             listeEtudiant.add(etudiant);
                }
              
            }   } catch (ClassNotFoundException ex) {
            Logger.getLogger(IEtudiantRemoteImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
         fileInputStream.close();
               
  }
      
    

}
