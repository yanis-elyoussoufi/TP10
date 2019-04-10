package fr.umontpellier.iut;

import java.time.LocalDate;

public class GestionEmployes {

    public static void main(String[] args) {
        Entreprise entreprise = new Entreprise();
        Employe yanis = new Employe.EmployeBuilder().setNom("ElYoussoufi").setPrenom("Yanis").setNumeroSecuriteSocial("12345").createEmploye();
        Employe yanissou = new Employe.EmployeBuilder().setNom("ElYoussoufi").setPrenom("Yanissou").setNumeroSecuriteSocial("34512").createEmploye();
        Employe alexis = new Employe.EmployeBuilder().setNom("Bernard").setPrenom("Alexis").setNumeroSecuriteSocial("23456").createEmploye();
        Employe tanguy = new Employe.EmployeBuilder().setNom("Ladet").setPrenom("Tanguy").setNumeroSecuriteSocial("34567").createEmploye();

        System.out.println(entreprise);

        entreprise.embaucher(yanis, LocalDate.of(2018, 9, 8));
        entreprise.embaucher(yanissou, LocalDate.now());
        entreprise.embaucher(tanguy, LocalDate.of(2017, 9, 8));
        entreprise.embaucher(alexis, LocalDate.of(2016, 9, 8));

        System.out.println(entreprise.getEmployes());

    }

}
