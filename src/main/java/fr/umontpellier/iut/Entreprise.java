package fr.umontpellier.iut;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class Entreprise {
    private Collection<Employe> LePersonnel;

    public Entreprise(ArrayList lePersonnel) {
        LePersonnel = new ArrayList<>();
    }

    public void embaucher(Employe e, LocalDate dateEmbauche){

        LePersonnel.add(e);
        e.setDateEmbauche(dateEmbauche);
    }

    public void licencier(Employe e){
        LePersonnel.remove(e);

    }

    public Collection<Employe> getLePersonnel() {
        TreeSet<Employe> t = new TreeSet<>();
        for (Employe e : LePersonnel){
            t.add(e);
        }
        return t;
        //return new Treeset<>(LePersonnel)
    }

}
