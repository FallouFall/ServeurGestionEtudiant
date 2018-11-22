
package com.objis.serveurgestionetudiant.dao;

/**
 * @author Fallou
 * Example de classe pour ne pas laisser le package vide dans le javadoc.
 * Vide pour le moment
 */
public class ConnectionDao {
    private  static ConnectionDao connect=null;
    private static ConnectionDao getInstanceConnect()
    {
        if(connect==null)
        {
            connect=new ConnectionDao();
        }
        return connect;
    }
    
}
