package Blatt06.Aufgabe18;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class scalarTester {

    @Test
    public void nullTest() throws Exception {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            int[] nullvector1 = null;
            int[] nullvector2 = null;
            Rechner.posSkalarProdukt(nullvector1, nullvector2);
        });

        String expectedMessage = " Vektoren duerfen nicht null sein ";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void unevenLengthTest() throws Exception {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            int[] vectorLength3 = { 1, 2, 3 };
            int[] vectorLength2 = { 1, 2 };
            Rechner.posSkalarProdukt(vectorLength3, vectorLength2);
        });

        String expectedMessage = " Vektoren muessen gleich lang sein ";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void actualTest(){
        int[] testVector1 = {1,2,3};
        int[] testVector2 = {-1,-2,3};

        int expextedOutput = 14;

        assertEquals(expextedOutput,Rechner.posSkalarProdukt(testVector1, testVector2));
    }
}
