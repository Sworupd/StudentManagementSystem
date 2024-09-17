package models;

public class Classroom {
    int classroomID;
    String classroomName;
    int classroomCapacity;

    public Classroom(int classroomID, String classroomName, int classroomCapacity) {
        this.classroomID = classroomID;
        this.classroomName = classroomName;
        this.classroomCapacity = classroomCapacity;
    }

    public int getClassroomID() {
        return classroomID;
    }

    public void setClassroomID(int classroomID) {
        this.classroomID = classroomID;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public int getClassroomCapacity() {
        return classroomCapacity;
    }

    public void setClassroomCapacity(int classroomCapacity) {
        this.classroomCapacity = classroomCapacity;
    }
}
