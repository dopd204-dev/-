public class Student extends Person {
    String university;
    double gpa;
    public void showStudentInfo() {
        showInfo();
        System.out.println("Университети: " + university);
        System.out.println("GPA: " + gpa);
    }
}
