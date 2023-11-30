package at;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double kontostand =0.0;
        double auswahl =0.0;
        int input =0;
        int i = 0;
       
        do{
            System.out.println("1. einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand");
            System.out.println("4. Beenden");
            System.out.print("Bitte den Wert eingeben:");
            auswahl = scanner.nextInt();
            System.out.println("Hier kommt der Wert:"+ auswahl);
        }while (auswahl != 4);

        int option = input;


        switch (option) {
            case 1:
                System.out.print("Geben Sie den Einzahlungsbetrag ein: ");
                auswahl = scanner.nextDouble();
            {kontostand += auswahl;
                System.out.println("Einzahlung erfolgreich!");}
                break;
            case 2:
                System.out.print("Geben Sie den Abhebungsbetrag ein: ");
                auswahl = input;
                if (auswahl > kontostand) {
                    System.out.println("Nicht genügend Guthaben auf dem Konto.");
                } else {
                    kontostand -= auswahl;
                    System.out.println("Auszahlung erfolgreich!");
                }
                break;
            case 3:
                System.out.println("Ihr Kontostand beträgt: " + kontostand);
                break;
            case 4:
                System.out.println("Vielen Dank und auf Wiedersehen!");
                System.exit(0);
            default:
                System.out.println("Ungültige Option. Bitte wählen Sie erneut.");
        }
    }
}
