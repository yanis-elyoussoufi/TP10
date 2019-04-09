package fr.umontpellier.iut;

import java.time.LocalDate;
import java.util.Objects;

public class Employe {
    private String numeroSecuriteSocial;
    private String nom;
    private String prenom;
    private int echelon;
    private double nbHeure;
    private double base;

    private LocalDate dateEmbauche;

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return Objects.equals(numeroSecuriteSocial, employe.numeroSecuriteSocial);
        /* return numeroSecuriteSocial.equals(employe.numeroSecuriteSocial); */
    }

    @Override
    public int hashCode() {
        return numeroSecuriteSocial.hashCode();
    }

    public Employe(String numeroSecuriteSocial, String nom, String prenom, int echelon, double nbHeure, double base) {
        this.numeroSecuriteSocial = numeroSecuriteSocial;
        this.nom = nom;
        this.prenom = prenom;
        this.echelon = echelon;
        this.nbHeure = nbHeure;
        this.base = base;
    }

    public static class EmployeBuilder {
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

    public int getEchelon() {
        return echelon;
    }

    public double getBase() {
        return base;
    }

    public double calculerSalaireBrut(){
        return(this.base * this.nbHeure + 100);
    }

    public double calculerSalaireNet(){
        return(this.calculerSalaireBrut()*0.8);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "Numero securite social :'" + this.numeroSecuriteSocial + '\'' +
                ", nom :'" + this.nom + '\'' +
                ", prenom :'" + this.prenom + '\'' +
                ", echelon :" + this.echelon +
                ", Salaire brut :" + this.calculerSalaireBrut() +
                ", Salaire net :" + this.calculerSalaireNet() +
                '}';
    }

    public double getNbHeure() {
        return nbHeure;
    }
}
