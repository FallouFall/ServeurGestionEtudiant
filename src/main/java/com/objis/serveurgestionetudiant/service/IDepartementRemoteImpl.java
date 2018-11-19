package com.objis.serveurgestionetudiant.service;

import com.objis.serveurgestionetudiant.domaine.Departement;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fallou
 */
public class IDepartementRemoteImpl  extends  UnicastRemoteObject implements IDepartementRemote{
    
    
   
  private List<Departement> listeDepartement;

    /**
     *
     * @throws RemoteException
     */
    public IDepartementRemoteImpl() throws RemoteException {
      //  throw new UnsupportedOperationException();
    }

    
    
    @Override
    public List<Departement> getListeDepartement() throws RemoteException {
        if (listeDepartement == null) {
            listeDepartement = new ArrayList<>();
            listeDepartement.add(0, new Departement(0, "GENERALE"));
        }
        return listeDepartement;
    }

    @Override
    public Departement findDepartement(String nomDepartement) throws RemoteException {
          return listeDepartement
                .stream()
                .filter(departement -> departement.getNomDepartement().equalsIgnoreCase(nomDepartement))
                .findAny()
                .orElse(null);
    }
    
}
