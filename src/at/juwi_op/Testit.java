package at.juwi_op;

import java.util.ArrayList;
import java.util.Random;

public class Testit {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Katze> mKatzenliste = new ArrayList();
        Katze katze = new Katze();
        String[] charListe ={"bösartig", "lieb", "verspielt", "verschmust", "listig", "drollig"};
        String[] oberfliste ={"flauschig", "nackt", "kurzhaarig", "samtig", "weich", "struppig"};
        String[] nameliste ={"Josef", "Anton", "Lina", "Emmy", "Tommy", "Happy", "Joy", "Sunny", "Felix", "Elias", "Elija"};
        String[] farbliste ={"schwarz", "grau", "dreifärbig", "weiß", "getigert", "braun"};

        for(int i=0; i<=100; i++) {
            int ci = r.nextInt(charListe.length -1 -0) + 0;
            int ni = r.nextInt(nameliste.length -1 -0) + 0;
            int fi = r.nextInt(farbliste.length -1 -0) + 0;
            int oi = r.nextInt(oberfliste.length -1 -0) + 0;
            int ai = r.nextInt(20 + 1 - 0) +0;

            mKatzenliste.add(new Katze(charListe[ci], oberfliste[oi], ai, farbliste[fi], nameliste[ni]));
        }

        katze.setCharakter("lieb");
        katze.setAlter(3);
        katze.setFarbe("schwarz");
        katze.setOberflaechenbeschaffenheit("flauschig");
        katze.setName("Seff Tone");

        Katze katze2 = new Katze("aufgedreht", "kurzhaar", 1, "dreifarbig", "Lina");
        mKatzenliste.add(katze2);

        Haus haus = new Haus(350, "baumgarten 19a, 6858 Bildstein", 8, 5,5,);
        haus.getInfo();
        haus.addKatze (katze2);
        haus.getKatzenImHaus();
        haus.getMaxAlter();
        //System.out.println("Meine Kater "+katze.getName() + " ist " + katze.getAlter() + " Jahre alt!");



        for(Katze k: mKatzenliste){
            System.out.println("Meine Katze "+k.getName() + " ist " + k.getAlter() + " Jahre alt! Sie ist "+k.getCharakter()+ " und " +k.getOberflaechenbeschaffenheit());

            haus.addKatze(k);

        }

        haus.getKatzenImHaus();
    }
}
