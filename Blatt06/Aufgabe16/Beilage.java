package Blatt06.Aufgabe16;

public class Beilage extends Doenerzusatz {

    private int preis;
    private String name;

    public Beilage(int preis, String name, Doener superDoener) {
        super(superDoener);
        this.preis = preis;
        this.name = name;
    }

    @Override
    protected int berechneZusatzkosten() {
        return preis;
    }

}