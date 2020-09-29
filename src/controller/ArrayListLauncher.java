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

        // Stap 3: Som van rij getallen
        System.out.println();
        System.out.println(somVanRij(randGetallenLijst));

        // Stap 4: Gemiddelde van rij getallen
        System.out.println(gemiddeldeVanRij(randGetallenLijst));

        // Stap 5: Lijst van getallen
        ArrayList<Number> getallenLijst = new ArrayList<>();
        getallenLijst.add(5);
        getallenLijst.add(8);
        getallenLijst.add(13);
        getallenLijst.add(21);
        getallenLijst.add(34);
        getallenLijst.add(3.14);
        getallenLijst.add(2.72);
        getallenLijst.add(1.62);

        System.out.println();
        double som = 0;
        for (Number number : getallenLijst) {
            if (number instanceof Integer) {
                System.out.printf("Integer in lijst : %d\n", number);
            }
            if (number instanceof Double) {
                som += number.doubleValue();
            }
        }
        System.out.printf("Som van gebroken getallen : %f\n", som);
        System.out.printf("Gemiddelde van de lijst : %f", gemiddeldeVanRijNumber(getallenLijst));
    }

    public static ArrayList<Integer> maakRandomRijGetallen(int aantalGetallen, int maximum) {
        ArrayList<Integer> randomList = new ArrayList<>();

        for (int i = 0; i < aantalGetallen; i++) {
            randomList.add(random(maximum));
        }

        return randomList;
    }

    public static int random(int maximum) {
        final int minimum = 1;
        return ((int) (Math.random() * (maximum - minimum)) + minimum);
    }

    public static int somVanRij (ArrayList<Integer> rij) {
        int som = 0;

        for (Integer getal : rij) {
            som += getal;
        }

        return som;
    }

    public static double gemiddeldeVanRij (ArrayList<Integer> rij) {
        return (double) somVanRij(rij) / rij.size();
    }

    public static double somVanRijNumber (ArrayList<Number> rij) {
        double som = 0;

        for (Number getal : rij) {
            som += getal.doubleValue();
        }

        return som;
    }

    public static double gemiddeldeVanRijNumber (ArrayList<Number> rij) {
        return somVanRijNumber(rij) / rij.size();
    }
}
