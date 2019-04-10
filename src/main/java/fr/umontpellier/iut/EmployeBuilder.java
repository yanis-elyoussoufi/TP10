package fr.umontpellier.iut;

public class EmployeBuilder {
    private String numeroSecuriteSocial;
    private String nom;
    private String prenom;
    private int echelon;
    private double nbHeure;
    private double base;

    public EmployeBuilder setNumeroSecuriteSocial(String numeroSecuriteSocial) {
        this.numeroSecuriteSocial = numeroSecuriteSocial;
        return this;
    }

    public EmployeBuilder setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public EmployeBuilder setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public EmployeBuilder setEchelon(int echelon) {
        this.echelon = echelon;
        return this;
    }

    public EmployeBuilder setNbHeure(double nbHeure) {
        this.nbHeure = nbHeure;
        return this;
    }

    public EmployeBuilder setBase(double base) {
        this.base = base;
        return this;
    }

    public Employe createEmploye() {
        return new Employe(numeroSecuriteSocial, nom, prenom, echelon, nbHeure, base);
    }
}