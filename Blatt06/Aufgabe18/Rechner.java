package Blatt06.Aufgabe18;

public final class Rechner {
    public static int posSkalarProdukt(int[] is0, int[] is1) {
        if (is0 == null || is1 == null) {
            throw new IllegalArgumentException(" Vektoren duerfen nicht null sein ");
        } else if (is0.length != is1.length) {
            throw new IllegalArgumentException(" Vektoren muessen gleich lang sein ");
        }
        int ergebnis = 0;
        for (int i = 0; i < is0.length; i++) {
            ergebnis += abs(is0[i]) * abs(is1[i]);
        }
        return ergebnis;
    }

    private static int abs(int i) {
        if (i < 0) {
            return -i;
        } else {
            return i;
        }
    }
}