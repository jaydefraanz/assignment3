package za.ac.cput;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Unit test for simple Student.
 */
public class StudentTest
{
    /**
     * Rigorous Test :-)
     */
    Student myStudent = new Student(1055,"Jayde", "CPUT","photography",2017);

    //Object equality
    @Test
    public void nameCheck()
    {
        String name = "Jayde";
        assertEquals(name,myStudent.getStudName());
    }

    //Object identity
    @Test
    public void studNoCheck()
    {
        Student myStudent2 = new Student(1059,"Peter","CPUT","Engineering", 2016);
        assertNotSame(myStudent.getStudNo(),myStudent2.getStudNo());

    }

    //
    @Test
    public void studentDescription()
    {
        assertEquals(myStudent.getsStudInstitution(),"CPUT");
        fail("No test found");
    }


    //Timeout
    @Test(timeout = 5000)
    public void timeOut()
    {
        assertThat(1055, is(myStudent.getStudNo()));
    }

    //Disabling test
    @Ignore
    @Test
    public void checkQualification()
    {
        Student myStudent3 = new Student(1554,"John","CPUT","Engineering", 2018);
        assertNotSame(myStudent.getStudQualification(),myStudent3.getStudQualification());
    }

}
