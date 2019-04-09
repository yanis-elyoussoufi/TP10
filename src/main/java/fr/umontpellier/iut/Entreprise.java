package fr.umontpellier.iut;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

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


}
