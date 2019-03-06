package za.ac.cput;

/**
 * Hello world!
 *
 */

public class Student
{
    private int studNo;
    private String studName;
    private String studInstitution;
    private String studQualification;
    private int year;

    public Student (int studNo, String studName, String studInstitution, String studQualification, int year)
    {
        this.studNo = studNo;
        this.studName = studName;
        this.studInstitution = studInstitution;
        this.studQualification = studQualification;
        this.year = year;
    }

    public int getStudNo()
    {
        return studNo;
    }

    public String getStudName()
    {
        return studName;
    }

    public String getsStudInstitution()
    {
        return studInstitution;
    }

    public String getStudQualification()
    {
        return studQualification;
    }

    public int getYear()
    {
        return year;
    }
}
