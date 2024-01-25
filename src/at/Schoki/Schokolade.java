package at.Schoki;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Schokolade {
    public static void main(String[] args) {
        // Arrays für die fünf Kategorien
        String[] toppings = {"Nüsse", "Erdbeeren", "Himbeeren", "Walnüsse", "Haselnüsse"};
        String[] marken = {"Milka", "Kinder", "Lindt", "Hofbauer", "Xocolat"};
        String[] formen = {"Praline", "Tafel", "Riegel"};
        String[] kakaogehalt = {"zartbitter", "bitter", "milchschokolade", "weiße schokolade"};
        String[] geschmack = {"eklig", "zu süß", "genau richtig", "lecker", "perfekt"};

        // Arrays für die Schubladen
        String[] schubladen = {"Küche", "Nachttisch", "Versteck", "Kleiderschrank", "Schatztruhe"};

        // Zufallsgenerator
        Random rand = new Random();

        // Map für die Schubladen mit Liste von Schokoladen
        Map<String, List<String>> schubladenMap = new HashMap<>();

        // Initialisiere die Schubladen mit leeren Listen
        for (String schublade : schubladen) {
            schubladenMap.put(schublade, new ArrayList<>());
        }

        // Schleife für 50 Kombinationen
        for (int i = 1; i <= 50; i++) {
            // Zufällige Auswahl für jede Kategorie
            String topping = toppings[rand.nextInt(toppings.length)];
            String marke = marken[rand.nextInt(marken.length)];
            String form = formen[rand.nextInt(formen.length)];
            String kakaogehaltValue = kakaogehalt[rand.nextInt(kakaogehalt.length)];
            String geschmackValue = geschmack[rand.nextInt(geschmack.length)];

            // Zufällige Auswahl der Schublade
            String schublade = schubladen[rand.nextInt(schubladen.length)];

            // Prüfe, ob die maximale Anzahl in der Schublade erreicht ist
            if (schubladenMap.get(schublade).size() < 10) {
                // Füge die Schokolade zur Schublade hinzu
                schubladenMap.get(schublade).add("In der Schublade befindet sich folgende Schoki: " +
                        "Auf der Schoki sind " + topping + ", " +
                        "die Schoki ist von " + marke + ", " +
                        "es ist ein/e " + form + ", " +
                        "es ist " + kakaogehaltValue + ", " +
                        "sie schmeckt " + geschmackValue);
            }
        }

        // Ausgabe der Schubladeninhalte
        for (String schublade : schubladen) {
            System.out.println("Schublade " + schublade + ":");
            for (String schokolade : schubladenMap.get(schublade)) {
                System.out.println(schokolade);
            }
            System.out.println();
        }
    }
}
