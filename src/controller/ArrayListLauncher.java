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

        // Stap 2: Lijst van random getallen
        System.out.println();
        ArrayList<Integer> randGetallenLijst = maakRandomRijGetallen(6, 10);
        for (Integer getal : randGetallenLijst) {
            System.out.print(getal + " ");
        }
    }

    public static ArrayList<Integer> maakRandomRijGetallen(int aantalGetallen, int maximum) {
        ArrayList<Integer> randomList = new ArrayList();

        for (int i = 0; i < aantalGetallen; i++) {
            randomList.add(random(maximum));
        }

        return randomList;
    }

    public static int random(int maximum) {
        final int minimum = 1;
        return ((int) (Math.random() * (maximum - minimum)) + minimum);
    }
}
