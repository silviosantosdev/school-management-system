package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher melissa = new Teacher (2, "Melissa", 700);
        Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);
        Teacher megan = new Teacher(6, "Megan", 900);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(vanderhorn);


        Student tamara = new Student(1, "Tamara", 4);
        Student rakshith = new Student(2, "Rakshith Vasudev", 12);
        Student rabbi = new Student(3, "Rabbi", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamara);
        studentList.add(rakshith);
        studentList.add(rabbi);

        School ghs = new School(teacherList, studentList);

        ghs.addTeacher(megan);

        tamara.payFees(5000);
        rakshith.payFees(6000);
        System.out.println("GHS has earned $ " + ghs.getTotalMoneyEarned());

        System.out.println("------ Making SCHOOL PAY SALARY ------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName()
         + " and now has $" + ghs.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to " + vanderhorn.getName()
                + " and now has $" + ghs.getTotalMoneyEarned());

        System.out.println(rakshith);

        melissa.receiveSalary(melissa.getSalary());

        System.out.println(melissa);

    }
}
