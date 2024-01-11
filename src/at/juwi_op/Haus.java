package at.juwi_op;

import java.util.ArrayList;

public class Haus {
    private int flaeche;
    private String adresse;
    private int maxKatzenimHaus;
    private int maxAlter;
    private int anzahlZimmer;
    private ArrayList<Katze> katzenListe;

    public Haus(int flaeche, String adresse, int anzahlZimmer, int maxKatzenimHaus, int maxAlter) {
        this.flaeche = flaeche;
        this.adresse = adresse;
        this.anzahlZimmer = anzahlZimmer;
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
