public class Teacher extends Person {
    String subject;
    int experience;

    public void showTeacherInfo() {
        showInfo();
        System.out.println("Сабак берген предмети: " + subject);
        System.out.println("Тажрыйбасы жыл: " + experience);
    }
}

