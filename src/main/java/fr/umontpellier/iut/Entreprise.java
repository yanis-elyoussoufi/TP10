package fr.umontpellier.iut;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Entreprise {
    private Collection<Employe> lePersonnel;
    private double bonusTotal;

    public Entreprise(){
        this.lePersonnel = new ArrayList<>();
    }

    public void embaucher(Employe e, LocalDate dateEmbauche){
        lePersonnel.add(e);
        e.setDateEmbauche(dateEmbauche);
    }
    public void licencier(Employe e){
        lePersonnel.remove(e);
    }

    @Override
    public String toString() {
        return "Entreprise{" +
                "lePersonnel=" + lePersonnel +
                '}';
    }

    public void setBonusTotal(double bonusTotal) {
        this.bonusTotal = bonusTotal;
    }

    public Collection<Employe> getEmployes() {
        TreeSet<Employe> t = new TreeSet<>();
        for (Employe e : lePersonnel) {
            t.add(e);
        }
        return t;
        //return TreeSet<>(lePersonnel);
    }
    public void distribuerBonus(){
        PriorityQueue<Employe> personnel = PriorityQueue<>(lePersonnel.size(),new ComparateurDate());
        personnel.addAll(lePersonnel);
        for (Employe e: personnel){
            double bonus = 3*e.getMoisAnciennete();
            if (bonus < bonusTotal){
                e.setBonus(bonus);
                bonusTotal -= bonus;
            }else{
                e.setBonus(bonusTotal);
                bonusTotal = 0;
                break;
            }
        }
    }
    public void remercier(int n){
        PriorityQueue<Employe> personnel = new PriorityQueue<>(lePersonnel.size(), new ComparateurDate());
        personnel.addAll(lePersonnel);
        ArrayList<Employe> personnelTrie = new ArrayList<>(personnel)

        for (int i = 0; i < n  ; i++) {
            licencier(personnelTrie.get(personnelTrie.size() - 1 - i));

        }
    }

}
