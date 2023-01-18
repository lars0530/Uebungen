package Blatt06.Aufgabe16;

public abstract class Doenerzusatz extends Doener {

    private Doener superDoener;

    public Doenerzusatz(Doener superDoener) {
        this.superDoener = superDoener;
    }

    @Override
    public int berechnePreis() {
        return berechneZusatzkosten() + superDoener.berechnePreis();
    }

    protected abstract int berechneZusatzkosten();

}
