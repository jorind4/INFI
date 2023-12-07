package at.juwi_op;

import java.util.ArrayList;
import java.util.Random;

public class Testit {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Katze> mKatzenliste = new ArrayList();
        Katze katze = new Katze();
        String[] charListe ={"bösartig", "lieb", "verspielt", "verschmust", "listig", "drollig"};

        for(int i=0; i<=100; i++) {
            int ci = r.nextInt();
            mKatzenliste.add(new Katze(charListe[0], "kurzhaar", 1, "dreifarbig", "Lina"));
        }

        katze.setCharakter("lieb");
        katze.setAlter(3);
        katze.setFarbe("schwarz");
        katze.setOberflaechenbeschaffenheit("flauschig");
        katze.setName("Seff Tone");

        Katze katze2 = new Katze("aufgedreht", "kurzhaar", 1, "dreifarbig", "Lina");
        mKatzenliste.add(katze2);

        //System.out.println("Meine Kater "+katze.getName() + " ist " + katze.getAlter() + " Jahre alt!");

        for(Katze k: mKatzenliste){
            System.out.println("Meine Kater "+k.getName() + " ist " + k.getAlter() + " Jahre alt!");
        }
    }
}
