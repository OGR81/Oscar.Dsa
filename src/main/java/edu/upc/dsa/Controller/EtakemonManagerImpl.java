package edu.upc.dsa.Controller;

import java.util.HashMap;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class EtakemonManagerImpl {

    public static HashMap umap;
    public static int ultimoid = 1;
    private static EtakemonManagerImpl instance = null;


    public static EtakemonManagerImpl getInstance() {
        if (instance == null) instance = new EtakemonManagerImpl();
        return instance;
    }
    public EtakemonManagerImpl() {
        umap = new HashMap<>();
    }
    public Object addUserToUsersMap(User usr) {
        return umap.put(usr.id, usr);
    }
    public Object delUserFromMap(int key) {
        return umap.remove(key);
    }
    public Object getUserFromMap(int key) {
        return umap.get(key);
    }
    public void delUsersFromMap() { umap.clear(); }
    public boolean usrAuthentication(String usrname, String pw) throws NullPointerException, MissingResourceException {
        Boolean successful = false;
        ResourceBundle usrdata = ResourceBundle.getBundle("Users_data");
        if (pw.equals(usrdata.getString(usrname))) {
            return successful = true;
        }
        else return successful;
    }


} {
}
