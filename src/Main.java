
public static void main(String[] args) {
    Student student = new Student();
    student.name = "Бека";
    student.age = 17;
    student.university = "КНУ";
    student.gpa = 3.8;

    Teacher teacher = new Teacher();
    teacher.name = "Мурат";
    teacher.age = 45;
    teacher.subject = "Математика";
    teacher.experience = 20;

    System.out.println("=== Student Info ===");
    student.showStudentInfo();

    System.out.println("\n=== Teacher Info ===");
    teacher.showTeacherInfo();
}