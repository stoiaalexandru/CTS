package ro.ase.csie.cts.seminar12.testare.teste;

import org.junit.*;
import ro.ase.csie.cts.seminar12.testare.exceptii.ExceptieImpartireLaZero;
import ro.ase.csie.cts.seminar12.testare.modele.OperatiiMatematice;

import static org.junit.Assert.*;

public class OperatiiMatematiceTest {

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Salut");
    }


    @Before
    public void setUp() throws Exception {
        System.out.println("Pregatire test");
    }


    @After
    public void tearDown() throws Exception {
        System.out.println("Sterge resurse test");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("La revedere");
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
    public void testImpartireValoriPozitive() throws ExceptieImpartireLaZero {
        int a = 1;
        int b = 2;
        double rezultatAsteptat = 0.5;
        double rezultatCalculat = OperatiiMatematice.impartire(a,b);

        assertEquals("Impartire 1/2 ",rezultatAsteptat,rezultatCalculat,0);
    }
}