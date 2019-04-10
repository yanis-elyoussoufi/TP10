package fr.umontpellier.iut;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EntrepriseTest {
    private Entreprise entreprise;
    private Employe e1, e2, e3, e4;


    @BeforeEach
    void setUp() {
        entreprise = new Entreprise();
        e1 = new Employe.EmployeBuilder().setNom("ElYoussoufi").setPrenom("Yanis").setNumeroSecuriteSocial("12345").createEmploye();
        e2 = new Employe.EmployeBuilder().setNom("ElYoussoufi").setPrenom("Yanissou").setNumeroSecuriteSocial("34512").createEmploye();
        e3 = new Employe.EmployeBuilder().setNom("Bernard").setPrenom("Alexis").setNumeroSecuriteSocial("23456").createEmploye();
        e4 = new Employe.EmployeBuilder().setNom("Ladet").setPrenom("Tanguy").setNumeroSecuriteSocial("34567").createEmploye();

    }

    @Test
    void getEmployes() {
        entreprise.embaucher(e1, LocalDate.now());
        entreprise.embaucher(e2, LocalDate.now());
        entreprise.embaucher(e3, LocalDate.now());
        entreprise.embaucher(e4, LocalDate.now());

        ArrayList<Employe> employes = new ArrayList<>(entreprise.getEmployes());

        assertEquals(4, employes.size());
        assertEquals(e1, employes.get(2));
        assertEquals(e2, employes.get(1));
        assertEquals(e3, employes.get(0));
        assertEquals(e4, employes.get(3));
    }

    @Test

    void getEmployesDoublon(){
        entreprise.embaucher(e1, LocalDate.now());
        entreprise.embaucher(e1, LocalDate.now());
        assertEquals(1, entreprise.getEmployes().size());
    }

    @Test
    void getEmployesDoublonBis(){
        entreprise.embaucher(e1, LocalDate.now());
        entreprise.embaucher(e1, LocalDate.now());
        assertEquals(1, entreprise.getEmployes().size());
    }

    @Test
    void distribuerBonus(){
        entreprise.embaucher(e1, LocalDate.of(2014,1,1));
        entreprise.embaucher(e2, LocalDate.of(2012,1,1));
        entreprise.embaucher(e3, LocalDate.of(2016,1,1));
        entreprise.embaucher(e4, LocalDate.of(2011,1,1));
        entreprise.setBonusTotal(500);
        entreprise.distribuerBonus();
        assertEquals(0,e1.getBonus());
        assertEquals(0,e3.getBonus());
        assertEquals(500,e2.getBonus()+e4.getBonus());
        assertEquals(3 * e4.getMoisAnciennete(),e4.getBonus());



    }
    @Test
    remercier(){
        entreprise.embaucher(e1, LocalDate.of(2014,1,1));
        entreprise.embaucher(e2, LocalDate.of(2012,1,1));
        entreprise.embaucher(e3, LocalDate.of(2016,1,1));
        entreprise.embaucher(e4, LocalDate.of(2011,1,1));
        assertEquals();

    }
}