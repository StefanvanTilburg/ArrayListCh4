package controller;

import java.util.ArrayList;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht 6.2 ArrayList
 * <p>
 * Doel     Oefenen met ArrayList mogelijkheden
 */
public class ArrayListLauncher {
    public static void main(String[] args) {
        // Stap 1: Lijst met woorden
        ArrayList<String> woorden = new ArrayList<>();
        woorden.add("Morgen");
        woorden.add("wordt");
        woorden.add("het");
        woorden.add("mooi");
        woorden.add("weer");
        woorden.remove(1);
        woorden.add(1,"is");
        for (String woord : woorden) {
            System.out.print(woord + " ");
        }
    }
}
