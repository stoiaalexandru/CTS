package ro.ase.csie.cts.seminar13.testare.teste;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import ro.ase.csie.cts.seminar13.testare.exceptii.ExceptieNote;
import ro.ase.csie.cts.seminar13.testare.exceptii.ExceptieVarsta;
import ro.ase.csie.cts.seminar13.testare.modele.Student;

import java.util.ArrayList;
import java.util.Random;

public class StudentTestAlteTeste {

    //test fixture
    static Student student;
    static ArrayList<Integer> note;
    static String numeInitial;
    static int varstaInitiala;
    static int nrNoteInitiale;
    static ArrayList<Integer> multitudineNote;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        note = new ArrayList<>();
        nrNoteInitiale =3;
        Random random =  new Random();
        for (int i = 0; i< nrNoteInitiale;i++){
            note.add(random.nextInt(Student.MAX_NOTA)+1);
        }
        numeInitial= "Gigel";
        varstaInitiala = Student.MIN_VARSTA+1;

        multitudineNote = new ArrayList<>();
        int nrNote = 1000000;
        for(int i = 0 ; i<nrNote;i++){
            multitudineNote.add(Student.MAX_NOTA);
        }
    }

    @Before
    public void setUp() throws Exception {
        student = new Student(numeInitial, varstaInitiala, note);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(expected = ExceptieVarsta.class)
    public void testSetVarstaRangeMinInt() throws ExceptieVarsta {
        int varstaNoua = Integer.MIN_VALUE;
        student.setVarsta(varstaNoua);
    }
    @Test(expected = ExceptieVarsta.class)
    public void testSetVarstaRangeMaxInt() throws ExceptieVarsta {
        int varstaNoua = Integer.MAX_VALUE;
        student.setVarsta(varstaNoua);
    }

    @Test
    public void testSetVarstaBoundaryVarstaMinimaRight() throws ExceptieVarsta {
        int varstaNoua = Student.MIN_VARSTA;
        student.setVarsta(varstaNoua);
        int varstaModificata = student.getVarsta();
        assertEquals("Test pentru limita inferioara varsta", varstaNoua, varstaModificata);
    }

    @Test
    public void testSetVarstaBoundaryVarstaMaximaRight() throws ExceptieVarsta {
        int varstaNoua = Student.MAX_VARSTA;
        student.setVarsta(varstaNoua);
        int varstaModificata = student.getVarsta();
        assertEquals("Test pentru limita superioara varsta", varstaNoua, varstaModificata);
    }

    @Test
    public void testSetNoteReferenceDeepCopy() throws ExceptieNote {
        ArrayList<Integer> note = new ArrayList<>();
        note.add(10);
        note.add(10);
        note.add(10);
        int expectedCount = note.size();
        student.setNote(note);
        note.add(10);

        assertEquals("Test modificare note din exterior",expectedCount, student.getNrNote());

    }

    @Test
    public void testGetMediePerformance() throws ExceptieNote {
        ArrayList<Integer> note = new ArrayList<>();
        int nrNote = 1000000;
        for(int i = 0 ; i<nrNote;i++){
            note.add(Student.MAX_NOTA);
        }
        student.setNote(note);

        long tStart = System.currentTimeMillis();
        float medieCalculata = student.getMedie();
        long tFinal = System.currentTimeMillis();

        long durata = tFinal-tStart;
        long durataMaxima = 10 ;

        assertTrue(durata <= durataMaxima);


    }

    @Test(timeout = 10)
    public void testGetMediePerformanceJUnit4() throws ExceptieNote {
        student.setNote(multitudineNote);
        float medieCalculata = student.getMedie();
    }


    @Test
    public void testGetNotaMinimaInverse() throws ExceptieNote {
        ArrayList<Integer> note = new ArrayList<>();
        int nrNote = 10000;
        Random random = new Random();
        for(int i =0; i<nrNote; i++) {
            note.add(random.nextInt(Student.MAX_NOTA+1));
        }
        student.setNote(note);

        int minimCalculat =student.getNotaMinima();

        //pt ca nu putem determina valoara estimata
        //verificam relatia dintre minim si valorile initiale
        for(int i=0; i<nrNote; i++) {
            if(minimCalculat > note.get(i)) {
                fail("Minimul calculat nu este corect");
            }
        }

        assertTrue(true);
    }

    @Test
    public void testGetMedieCrossCheck() throws ExceptieNote {
        ArrayList<Integer> note = new ArrayList<>();
        int nrNote = 10;
        Random random = new Random();
        for(int i =0; i<nrNote; i++) {
            note.add(random.nextInt(Student.MAX_NOTA+1));
        }
        student.setNote(note);

        float medieEstimata = getMedieVariantaInitiale(note);
        float medieCalculata = student.getMedie();

        assertEquals("Valorile calculate de cele 2 functii nu sunt identice", medieEstimata, medieCalculata, 0);
    }

    public float getMedieVariantaInitiale(ArrayList<Integer> valori) {
        float suma =0;
        for(int valoare:valori) {
            suma+= valoare;
        }
        return suma/valori.size();
    }
}