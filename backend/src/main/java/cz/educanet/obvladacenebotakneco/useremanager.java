package cz.educanet.obvladacenebotakneco;

import cz.educanet.zolololgicka.menuitem;

import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import java.util.ArrayList;

@ApplicationScoped
public class useremanager implements Serializable {
    private ArrayList<menuitem> animallist = new ArrayList<>();

    public void uvarnom(menuitem animal, int indeks) {
            animallist.add(indeks, animal);
    }

    public int uvarnom(menuitem animal) {
            animallist.add(animallist.size(), animal);
            return animallist.size();
    }

    public void karlesnezto(int indeks) {
            animallist.remove(indeks);
    }

    public void editnom(menuitem animal, int indeks){
            animallist.set(indeks, animal);
    }

    public menuitem servenom(int indeks){
            return animallist.get(indeks);
    }

    public Object[] serveallnoms(){
        return animallist.toArray();
    }

}
