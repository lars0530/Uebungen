package Blatt06.Aufgabe16;

public class Sauce extends Doenerzusatz {

    private String schaerfe;
    private String name;

    public Sauce(String schaerfe, String name, Doener superDoener) {
        super(superDoener);
        this.schaerfe = schaerfe;
        this.name = name;
    }

    @Override
    protected int berechneZusatzkosten() {
        if (schaerfe.equals("Ohne"))
            return 50;
        if (schaerfe.equals("Etwas"))
            return 60;
        if (schaerfe.equals("Sehr"))
            return 80;
        // this should never happen
        return -1;
    }
}