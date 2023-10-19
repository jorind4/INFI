package at;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int auswahl =0;
        int i = 0;
        do{
            System.out.print("Bitte den Wert eingeben:");
            auswahl = scanner.nextInt();
            System.out.println("Hier kommt der Wert:");
        }
    }
}
