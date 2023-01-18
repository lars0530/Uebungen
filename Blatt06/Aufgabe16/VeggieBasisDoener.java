package Blatt06.Aufgabe16;

public class VeggieBasisDoener extends Doener {
    private int preis;

    public VeggieBasisDoener(int preis) {
        this.preis = preis;
    }

    @Override
    public int berechnePreis() {
        return preis;
    }
}
