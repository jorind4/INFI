package at;


import java.util.Random;

public class If_Bedingung {
    public static void main(String[] args) {
         // Erstelle zwei Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        // Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50
        if((a<b) && (a<50))    {
            System.out.println("Zahl 1 ist kleiner als Zahl 2, Mini");}
        // dann gib aus "Zahl 1 ist kleiner als Zahl 2 und Mini"
        if((a<30) || (b<30)) System.out.println("Eine der beiden ist kleiner als 30");
        // Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30
        // dann gib aus "Eine der beiden ist kleiner als 30"
        if((a<50) && (b!=50)) {
            System.out.println("Erste Zahl klein, zweite kein 50iger");
        }
        // Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist
        // dann gib aus "Erste Zahl klein, zweite kein 50iger"



    }
}
