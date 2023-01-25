package Blatt06.Aufgabe16;

public abstract class Doener {
    public abstract int berechnePreis();

    public static void main(String[] args){
        Doener testDoener = new VeggieBasisDoener(350);
        System.out.println("\nDer Preis vom Testdöner ohne alles beträgt: "+testDoener.berechnePreis());

        // neue sauce hinzufügen
        Doenerzusatz zusatz1 = new Sauce("Etwas", "Cocktailsauce", testDoener);
        System.out.println("\nDer Preis von der milden Cocktailsauce beträgt: "+zusatz1.berechneZusatzkosten());
        System.out.println("Der Preis vom aktuellen Döner beträgt: "+zusatz1.berechnePreis());

        // 3 falafeln hinzufügen
        Doenerzusatz zusatz2 = new Special(30,3,zusatz1);
        System.out.println("\nDer Preis von den Falafelbällchen beträgt: "+zusatz2.berechneZusatzkosten());
        System.out.println("Der Preis vom aktuellen Döner beträgt: "+zusatz2.berechnePreis());

        // Mais als Beilage
        Doenerzusatz zusatz3 = new Beilage(50,"Mais", zusatz2);
        System.out.println("\nDer Preis vom Mais beträgt: "+zusatz3.berechneZusatzkosten());
        System.out.println("Der Preis vom aktuellen Döner beträgt: "+zusatz3.berechnePreis());
    }
}

