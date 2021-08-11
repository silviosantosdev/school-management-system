package school.management.system;

// This class is responsible for keep the track of the students fees, name, grade and fees paid.

public class Student {


    private int id;
    private String name;
    private int grade;
    private int fees;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student bt initializing.
     * Fees for every student is US$ 30.000,00.
     * Feed paid initially is 0,00
     * @param id id for the student: unique.
     * @param name name of the student.
     * @param grade grade of the student.
     *  */

    public Student (int id, String name, int grade) {
        this.id=id;
        this.name=name;
        this.grade=grade;
        this.feesPaid=0;
        this.feesTotal=30000;
    }
        //Not going to alter student's name, student's id.

    /*
    * Used to update the student's grade.
    * @param grade new grade of student.    *
    */

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /*
    * Keep adding the fees to feesPaid field
    * Add the fees to the fees paid.
    * The school is going receive the funds
    * @param fees the fees that the student pays.*/

    public void payFees (int fees) {
        // feesPaid=feesPaid + fees;
        // Linha acima pode ser substituida por comando abaixo, com a mesma utilidade:
        feesPaid += fees;
    }

    // @return id of the student.
    public int getId() {
        return id;
    }

    // @return the name of the student.
    public String getName() {
        return name;
    }

    // @return the grade of the student.
    public int getGrade() {
        return grade;
    }

    /* @return fees paid by the student.
    public int getFees() {
        return fees;
    } */

    //* @return fees paid by the student.
    public int getFeesPaid() {
        return feesPaid;
    }

    // @return the total fees of the student.
    public int getFeesTotal() {
        return feesTotal;
    }

    // @return the remainig fees.
    public int getRemaningFees () {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name : "+name+
                "Total fees paid so far $" + feesPaid;
    }
}
