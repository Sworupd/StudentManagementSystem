package models;

public class Subject {
    int ID;
    String Name;
    int FullMarks;
    int Passmarks;
    String Teacher;
    float CreditHours;

    public Subject(int ID, String name, int fullMarks, int passmarks, String teacher, float creditHours) {
        this.ID = ID;
        Name = name;
        FullMarks = fullMarks;
        Passmarks = passmarks;
        Teacher = teacher;
        CreditHours = creditHours;
    }

    public static void add(Subject s2) {

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getFullMarks() {
        return FullMarks;
    }

    public void setFullMarks(int fullMarks) {
        FullMarks = fullMarks;
    }

    public int getPassmarks() {
        return Passmarks;
    }

    public void setPassmarks(int passmarks) {
        Passmarks = passmarks;
    }

    public String getTeacher() {
        return Teacher;
    }

    public void setTeacher(String teacher) {
        Teacher = teacher;
    }

    public float getCreditHours() {
        return CreditHours;
    }

    public void setCreditHours(float creditHours) {
        CreditHours = creditHours;
    }
}
