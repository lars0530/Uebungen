package Blatt06.Aufgabe16;

public class Special extends Doenerzusatz {

    private int einzelPreis;
    private int anzahl;

    public Special(int einzelPreis, int anzahl, Doener superDoener) {
        super(superDoener);
        this.einzelPreis = einzelPreis;
        this.anzahl = anzahl;
    }

    @Override
    protected int berechneZusatzkosten() {
        return einzelPreis * anzahl;
    }
}