package com.objis.serveurgestionetudiant.service;

import com.objis.serveurgestionetudiant.domaine.SpecialiteProfesseur;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
public class ISpecialiteProfesseurRemoteImpl  extends UnicastRemoteObject implements ISpecialiteProfesseurRemote{
    
  
    private List<SpecialiteProfesseur> listeSpecialite;
    File file;
    transient FileOutputStream fileOuputStream = null;
    transient ObjectOutputStream objectOutputStream = null;
    /**
     *
     * @throws RemoteException
     */
    public ISpecialiteProfesseurRemoteImpl() throws RemoteException,UnsupportedOperationException {
        
    }

    @Override
    public List<SpecialiteProfesseur> getListeProfesseur() throws RemoteException {
         if (listeSpecialite == null) {
            listeSpecialite = new ArrayList<>();
            listeSpecialite.add(0, new SpecialiteProfesseur(0, "GENERALISTE"));
        }
        return listeSpecialite;
    }

    @Override
    public SpecialiteProfesseur findSpecialiteProfesseur(String nomSpecialite) throws RemoteException {
       return listeSpecialite
                .stream()
                .filter(spec -> spec.getNomDeSpecialite().equalsIgnoreCase(nomSpecialite))
                .findAny()
                .orElse(null);
    }

    @Override
    public SpecialiteProfesseur addSpecialiteProfesseur(SpecialiteProfesseur e) throws RemoteException {
       listeSpecialite=getListeProfesseur();
       listeSpecialite.add(e);
       return  e;
    }

    @Override
    public void serialiseSpecialite(SpecialiteProfesseur e)throws RemoteException  {
      try {

            file = new File("specialiteProfesseurs.txt");
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
