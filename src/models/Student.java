package models;

import java.util.ArrayList;

public class Student {
    String Name;
    int RollNo;
    String Section;
    int Grade;
    Classroom Classroom;
    ArrayList<Subject> Subject;
    Club Club;
    boolean Transportation;
    ArrayList<Bill> Bills;

    public Student(String name, int rollNo, String section, int grade, models.Classroom classroom, ArrayList<models.Subject> subject, models.Club club, boolean transportation, ArrayList<Bill> bills) {
        Name = name;
        RollNo = rollNo;
        Section = section;
        Grade = grade;
        Classroom = classroom;
        Subject = subject;
        Club = club;
        Transportation = transportation;
        Bills = bills;
    }

    public Student(String Name, int rollNo, String Section, int grade, models.Classroom c2, ArrayList<models.Subject> subjects) {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        Grade = grade;
    }

    public models.Classroom getClassroom() {
        return Classroom;
    }

    public void setClassroom(models.Classroom classroom) {
        Classroom = classroom;
    }

    public ArrayList<models.Subject> getSubject() {
        return Subject;
    }

    public void setSubject(ArrayList<models.Subject> subject) {
        Subject = subject;
    }

    public models.Club getClub() {
        return Club;
    }

    public void setClub(models.Club club) {
        Club = club;
    }

    public boolean isTransportation() {
        return Transportation;
    }

    public void setTransportation(boolean transportation) {
        Transportation = transportation;
    }

    public ArrayList<Bill> getBills() {
        return Bills;
    }

    public void setBills(ArrayList<Bill> bills) {
        Bills = bills;
    }
}

