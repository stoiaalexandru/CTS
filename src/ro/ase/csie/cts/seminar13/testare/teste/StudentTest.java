package ro.ase.csie.cts.seminar13.testare.teste;

import org.junit.*;
import ro.ase.csie.cts.seminar13.testare.exceptii.ExceptieNume;
import ro.ase.csie.cts.seminar13.testare.exceptii.ExceptieVarsta;
import ro.ase.csie.cts.seminar13.testare.modele.Student;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    public static Student student;
    public static ArrayList<Integer> note = new ArrayList<>();
    public static String numeInitial = "Gigel";
    public static int varstaInitiala = 21;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        note = new ArrayList<>();
        note.add(9);
        note.add(10);
        note.add(8);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        note.clear();
        note = null;
    }

    @Before
    public void setUp() throws Exception {
        student = new Student(numeInitial, varstaInitiala, note);
    }

    @After
    public void tearDown() throws Exception {
        student = null;
    }


    @Ignore
    @Test
    public void test() {
        fail("Not yet implemented");
    }

    @Test
    public void testSetVarstaValoriNormaleRight() throws ExceptieVarsta {
        //int varstaNoua = 22;
        int varstaNoua = Student.MIN_VARSTA + 1;
        student.setVarsta(varstaNoua);
        assertEquals("Testare cu valori ok", varstaNoua, student.getVarsta());
    }

    @Test
    public void testSetNumeRight() {
        String numeNou = "Ionel";
        try {
            student.setNume(numeNou);
            assertEquals("Test cu valori corecte", numeNou, student.getNume());
        } catch (ExceptieNume exceptieNume) {
            fail("Am primit exceptie pentru valori normale");
        }
    }

    @Test
    public void testSetVarstaErrorConditionsNegative() {
        int varstaNoua = -100;
        try {
            student.setVarsta(varstaNoua);
            fail("Nu am primit exceptie pentru varsta cu valoare negativa");
        } catch (ExceptieVarsta exceptieVarsta) {
            assertTrue(true);
        }
    }

    @Test(expected = ExceptieVarsta.class)
    public void testSetVarstaErrorConditionsMari() throws ExceptieVarsta {
        int varstaNoua = Student.MAX_VARSTA + 100;
        student.setVarsta(varstaNoua);
    }
}