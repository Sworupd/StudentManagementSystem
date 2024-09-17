import models.Bill;
import models.Classroom;
import models.Student;
import models.Subject;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Bill> bills = new ArrayList<Bill>();
        ArrayList<Subject> subjects = new ArrayList<Subject>();



        Classroom c1 = new Classroom(101, "Khumbila", 30);
        Classroom c2 = new Classroom(102, "Lobuche", 30);
        Classroom c3 = new Classroom(103, "Yala", 30);

        Subject s1 = new Subject(1, "Math", 100, 40, "Bishnu Pandey", 12);
        Subject s2 = new Subject(2, "Physics", 100, 40, "Mazina Rajopadhya", 12);


        Subject.add(s1);
        Subject.add(s2);

      Bill b1 = new Bill(19500, "1", "2023/09/11" , "Sworup Dhakal");


        bills.add(b1);


        Student ss2 = new Student("Yunish Shrestha", 25055, "Lobuche", 12, c2, subjects);


    }



}
}