public class Programmer extends Person{
    public Programmer(String name, int age) {
        super(name, age);
    }

    @Override
    public void walk() {
        System.out.println(getName() + " (Programmer) is walking to office with laptop ");
    }
}
