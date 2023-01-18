package Blatt06.Aufgabe16;

public abstract class Doener {
    public abstract int berechnePreis();

    public static void main(String[] args){
        Doener testDoener = new VeggieBasisDoener(350);
        System.out.println("\nDer Preis vom Testdöner ohne alles beträgt: "+testDoener.berechnePreis());

        // neue sauce hinzufügen
        Doenerzusatz mildeCocktail = new Sauce("Etwas", "Cocktailsauce", testDoener);
        System.out.println("\nDer Preis von der milden Cocktailsauce beträgt: "+mildeCocktail.berechneZusatzkosten());
        System.out.println("Der Preis vom aktuellen Döner beträgt: "+mildeCocktail.berechnePreis());

        // 3 falafeln hinzufügen
        Doenerzusatz special = new Special(30,3,mildeCocktail);
        System.out.println("\nDer Preis von den Falafelbällchen beträgt: "+special.berechneZusatzkosten());
        System.out.println("Der Preis vom aktuellen Döner beträgt: "+special.berechnePreis());

        // Mais als Beilage
        Doenerzusatz mais = new Beilage(50,"Mais", special);
        System.out.println("\nDer Preis vom Mais beträgt: "+mais.berechneZusatzkosten());
        System.out.println("Der Preis vom aktuellen Döner beträgt: "+mais.berechnePreis());
    }
}

