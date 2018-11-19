package com.objis.serveurgestionetudiant.service;

import com.objis.serveurgestionetudiant.domaine.Inscription;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Fallou
 */
public class IInscriptionRemoteImpl extends UnicastRemoteObject implements IInscriptionRemote{

  
  private  List<Inscription> listeInscription;
    File file;
 transient    FileOutputStream fileOuputStream = null;
   transient  ObjectOutputStream objectOutputStream = null;
  
   transient  FileInputStream fileInputStream = null;
   transient ObjectInputStream objectIntputStream = null;
   
    /**
     *
     * @throws RemoteException
     */
    public IInscriptionRemoteImpl() throws RemoteException,UnsupportedOperationException {
        
 
    }

   

    @Override
    public List<Inscription> getListeInscriptions() throws RemoteException {
       
        if (listeInscription == null) {
            listeInscription = new ArrayList<>();

        }
        return listeInscription;
    }

    @Override
    public Inscription addInscription(Inscription e) throws RemoteException {
       listeInscription=getListeInscriptions();
       listeInscription.add(e);
       return  e;
    }

    @Override
    public void serialiseInscription(Inscription e) throws RemoteException {
       try {

            file = new File("inscriptions.dat");
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

    @Override
    public void deserialiseInscription() throws RemoteException, FileNotFoundException, IOException {
          try {
            Inscription inscription=null;
            listeInscription=  getListeInscriptions();
            
            file = new File("inscription.dat");
            fileInputStream = new FileInputStream(file);
            objectIntputStream = new ObjectInputStream(fileInputStream);
            
                while ((inscription = (Inscription) objectIntputStream.readObject()) != null) {
                if (inscription instanceof Inscription) {
             listeInscription.add(inscription);
                }
              
            }   } catch (ClassNotFoundException ex) {
            Logger.getLogger(IEtudiantRemoteImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
         fileInputStream.close();
    }
    
}
