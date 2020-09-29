package model;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht 6.2 ArrayList
 * <p>
 * Doel     Auto's class sorteerbaar maken gebruikmakende van Interface Comparable
 */
public class Auto implements Comparable<Auto> {
    private String naam;
    private int gewicht;

    public Auto(String naam, int gewicht) {
        this.setNaam(naam);
        this.setGewicht(gewicht);
    }

    public Auto() {
        this("Onbekend", 0);
    }

    @Override
    public int compareTo(Auto andereAuto) {
        if (this.getGewicht() > andereAuto.getGewicht()) {
            return 1;
        } else if (this.getGewicht() < andereAuto.getGewicht()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%s heeft als gewicht %d", this.getNaam(), this.getGewicht());
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }
}
