public class Dancer extends Person{
    public Dancer(String name, int age) {
        super(name, age);
    }

    @Override
    public void walk() {
        System.out.println(getName() + " (Dancer) is walking gracefully ");
    }
}
