public class Student {

    private String name;
    private int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }


    @Override
    public String toString() {
        return "Student with name " + name + " and id " + studentId;
    }

}
