package fr.umontpellier.iut;

public class GestionEmployes {

    public static void main(String[] args){
        Entreprise entreprise = new Entreprise();
        Employe Carl = new Employe.EmployeBuilder().setNom("Calamar").setPrenom("Carl").setEchelon(2).setBase(100).setNbHeure(30).setNumeroSecuriteSocial("123456789").createEmploye();
    }

}
