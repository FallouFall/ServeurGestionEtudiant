package com.objis.serveurgestionetudiant.presentation;

import com.objis.serveurgestionetudiant.service.IDepartementRemoteImpl;
import com.objis.serveurgestionetudiant.service.IEtudiantRemoteImpl;
import com.objis.serveurgestionetudiant.service.IFiliereRemoteImpl;
import com.objis.serveurgestionetudiant.service.IInscriptionRemoteImpl;
import com.objis.serveurgestionetudiant.service.IPersonneRemoteImpl;
import com.objis.serveurgestionetudiant.service.IProfesseurRemoteImpl;
import com.objis.serveurgestionetudiant.service.ISecretaireRemoteImpl;
import com.objis.serveurgestionetudiant.service.ISpecialiteProfesseurRemoteImpl;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import com.objis.serveurgestionetudiant.service.IDepartementRemote;
import com.objis.serveurgestionetudiant.service.IEtudiantRemote;
import com.objis.serveurgestionetudiant.service.IFiliereRemote;
import com.objis.serveurgestionetudiant.service.IInscriptionRemote;
import com.objis.serveurgestionetudiant.service.IPersonneRemote;
import com.objis.serveurgestionetudiant.service.IProfesseurRemote;
import com.objis.serveurgestionetudiant.service.ISecretaireRemote;
import com.objis.serveurgestionetudiant.service.ISpecialiteProfesseurRemote;






/**
 * Classe principale du programme contenant plusieurs petits modules fonctionnels
 * @author Fallou
 * @since 11-2018
 * @version 1.0
 * 
 */
public class AccueilServeur {

    /**
     *
     */
    public static final String URL="rmi://localhost:2000/";

    /**
     *
     * @param args
     * @throws RemoteException
     * @throws java.io.FileNotFoundException
     * @throws AlreadyBoundException
     * @throws MalformedURLException
     */
    public static void main(String[] args) throws Exception {
      
    
     System.setProperty("java.security.policy", "file:grant.policy");
     System.setSecurityManager(new SecurityManager());
     System.setProperty("java.rmi.server.hostname", "127.0.0.1");
     
     
   
     LocateRegistry.createRegistry(2000);   
      
    
     IPersonneRemote personneServices = new IPersonneRemoteImpl();
     IEtudiantRemote etudiantServices = new IEtudiantRemoteImpl();
     IFiliereRemote  filiereServices  = new IFiliereRemoteImpl();
     IInscriptionRemote inscriptionServices = new IInscriptionRemoteImpl();
     IProfesseurRemote professeurServices = new IProfesseurRemoteImpl();
     ISecretaireRemote secretaireServices = new ISecretaireRemoteImpl();
     ISpecialiteProfesseurRemote specialiteProfServices = new ISpecialiteProfesseurRemoteImpl();
     IDepartementRemote departementServices = new IDepartementRemoteImpl();
     
   
     Naming.bind(URL+"personne", personneServices);
     Naming.bind(URL+"etudiant", etudiantServices);
     Naming.bind(URL+"filiere", filiereServices);
     Naming.bind(URL+"inscription", inscriptionServices);
     Naming.bind(URL+"professeur", professeurServices);
     Naming.bind(URL+"secretaire", secretaireServices);
     Naming.bind(URL+"specialiteprofesseur", specialiteProfServices);
     Naming.bind(URL+"departement", departementServices);
    
     System.out.println("*********************************Server is UP on......"+URL+"***********************************");

     }
    

}
