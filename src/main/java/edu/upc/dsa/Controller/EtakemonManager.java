package edu.upc.dsa.Controller;

import edu.upc.dsa.Model.Etakemon;

import java.util.ArrayList;
import java.util.List;

public class EtakemonManager {
    private List<Etakemon> etakemonList = new ArrayList<Etakemon>();

    public List<Etakemon> getList() {
        return this.etakemonList;
    }
    public void addEtakemonToList(Etakemon e) {
        this.etakemonList.add(e);
    }
    public void delEtakemonFromList(int id) {
        for(Etakemon e: etakemonList) {
            if (e.id == id) {
                etakemonList.remove(e);
                break;
            }
        }
    }
    public List<Etakemon> getEtakemonFromList (String nombre) {
        List<Etakemon> resultado = new ArrayList<>();
        for(Etakemon e: etakemonList) {
            if (e.nombre.equals(nombre)) {
                resultado.add(e);
            }
        }
        return resultado;
    }

    public List<Etakemon> getEtakemonFromListbyNameAproximation (String aproximation) {
        List<Etakemon> aproxList = new ArrayList<>();
        return aproxList;
    }
}
