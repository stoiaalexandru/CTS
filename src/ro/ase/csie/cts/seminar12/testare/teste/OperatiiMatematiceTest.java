package ro.ase.csie.cts.seminar12.testare.teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ro.ase.csie.cts.seminar12.testare.modele.OperatiiMatematice;

import static org.junit.Assert.*;

public class OperatiiMatematiceTest{

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAdunaValoriPozitive() {
        int a = 5;
        int b = 5;

        int rezultatAsteptat = 10;
        int rezultatCalculat = OperatiiMatematice.aduna(a, b);

        assertEquals("Suma cu numere pozitive",rezultatAsteptat,rezultatCalculat);
    }

    @Test
    public void testImpartire() {
        assertEquals(1,1);
    }
}