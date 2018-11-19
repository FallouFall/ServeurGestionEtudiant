package com.objis.serveurgestionetudiant.service;

import com.objis.serveurgestionetudiant.domaine.Filiere;
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
 *
 * @author Fallou
 */
public class IFiliereRemoteImpl  extends UnicastRemoteObject implements IFiliereRemote{

 
  private  List<Filiere> listeFiliere;
    File file;
 transient    FileOutputStream fileOuputStream = null;
   transient  ObjectOutputStream objectOutputStream = null;
  transient   FileInputStream fileInputStream = null;
  transient   ObjectInputStream objectIntputStream = null;
    /**
     *
     * @throws RemoteException
     */
    public IFiliereRemoteImpl() throws RemoteException {
            //  throw new UnsupportedOperationException();
    }

    
    @Override
    public List<Filiere> getListeFiliere() throws RemoteException {
        if (listeFiliere == null) {
            listeFiliere = new ArrayList<>();
            listeFiliere.add(0, new Filiere("001", "INFORMATIQUE", 80000, 45000));
            listeFiliere.add(0, new Filiere("002", "GESTION", 30000, 45000));
            listeFiliere.add(0, new Filiere("003", "DROIT", 60000, 55000));
        }
        return listeFiliere;
    }

    @Override
    public Filiere findFiliere(String matriculeFiliere) throws RemoteException {
           return getListeFiliere()
                .stream()
                .filter(filiere -> filiere.getMatriculeFiliere().equalsIgnoreCase(matriculeFiliere))
                .findAny()
                .orElse(null);
    }


    @Override
    public String genererMatriculeInscrption(String nomFilire)throws RemoteException {
        int numeroGenerer = (int) (Math.random() * 9999999);
        return "Fil" + LocalDate.now().getYear() + numeroGenerer + nomFilire.substring(0, 3);
    }

    @Override
    public Filiere addEFiliere(Filiere e) throws RemoteException {
       listeFiliere=getListeFiliere();
       listeFiliere.add(e);
       return  e;
    }

    
    
    @Override
    public void serialiseFiliere(Filiere e)  throws RemoteException{
        try {

            file = new File("filieres.dat");
            fileOuputStream = new FileOutputStream(file,true);
            objectOutputStream = new ObjectOutputStream(fileOuputStream);

            objectOutputStream.writeObject(e);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOuputStream.close();
        } catch (IOException ex) {
            Logger.getLogger(IEtudiantRemoteImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deserialiseFiliere() throws RemoteException, FileNotFoundException, IOException {
        try {
            Filiere filiere=null;
            listeFiliere=  getListeFiliere();
            
            file = new File("etudiants.dat");
            fileInputStream = new FileInputStream(file);
            objectIntputStream = new ObjectInputStream(fileInputStream);
            
            while ((filiere = (Filiere) objectIntputStream.readObject()) != null) {
                if (filiere instanceof Filiere) {
             listeFiliere.add(filiere);
                }
              
            }   } catch (ClassNotFoundException ex) {
            Logger.getLogger(IEtudiantRemoteImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
         fileInputStream.close();
    }
}
