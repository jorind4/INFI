package at.Schoki;

import java.util.ArrayList;

public class Schublade {
}

public class Schublade {
    private int groesse;
    private String Nummer;
    private String Schrank;
    private String Griff;
    private int anzahlSchoki;
    private ArrayList<Schokolade> SchokiListe;

    public Haus(int flaeche, String adresse, int anzahlZimmer, int maxKatzenimHaus, int maxAlter) {
        this.groesse = groesse;
        this.Nummer = Nummer;
        this.Schrank = Schrank;
        this.katzenListe = new ArrayList<>();
        this.maxKatzenimHaus = maxKatzenimHaus;
        this.maxAlter = maxAlter;
    }

    public int getFlaeche() {
        return flaeche;
    }

    public void setFlaeche(int flaeche) {
        this.flaeche = flaeche;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getAnzahlZimmer() {
        return anzahlZimmer;
    }

    public void setAnzahlZimmer(int anzahlZimmer) {
        this.anzahlZimmer = anzahlZimmer;
    }

    public void getInfo(){
        System.out.println("Adresse: " + this.adresse +"\nFlaeche: " + this.flaeche + "\nAnzahl der Zimmer: "+ this.anzahlZimmer);
    }

    public void addKatze(Katze katze) {
        if (katzenListe.size() > this.maxKatzenimHaus){
            System.out.println("Die Chefin will nicht mehr als " + this.maxKatzenimHaus + " Katze im Haus!!");
        }
        if (katzenListe.size >= this.maxAlter)
        else {
            katzenListe.add(katze);
        }}

    public void getKatzenImHaus(){
        for (Katze k : katzenListe)
            k.getInfo();
    }

    public int getMaxKatzenimHaus() {
        return maxKatzenimHaus;
    }

    public void setMaxKatzenimHaus(int maxKatzenimHaus) {
        this.maxKatzenimHaus = maxKatzenimHaus;
    }

    public int getMaxAlter() {
        return maxAlter;
    }

    public void setMaxAlter(int maxAlter) {
        this.maxAlter = maxAlter;
    }
}
