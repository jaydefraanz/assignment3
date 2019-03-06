package za.ac.cput;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

/**
 * Unit test for simple Student.
 */
public class StudentTest
{
    /**
     * Rigorous Test :-)
     */
    Student myStudent = new Student(1055,"Jayde", "CPUT","photography",2017);

    @Test
    public void nameCheck()
    {
        String name = "Jayde";
        assertEquals(name,myStudent.getStudName());
    }

    @Test
    public void studNoCheck()
    {
        Student myStudent2 = new Student(1552,"Peter","CPUT","Engineering", 2016);
        assertNotSame(myStudent.getStudNo(),myStudent2.getStudNo());
    }


    @Test
    public static void fail(String message) {
        if (message == null) {
            throw new AssertionError();
        }
        throw new AssertionError(message);
    }
}
