public class Singer extends Person{

    public Singer(String name, int age) {
        super(name, age);
    }

    @Override
    public void walk() {
        System.out.println(getName() + " (Singer) is walking while singing ");
    }
}
