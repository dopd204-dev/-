public class Person {
    protected String name;
    protected String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void learn() {
        System.out.println(name + " is learning");
    }

    public void walk() {
        System.out.println(name + " is walking");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Designation: " + designation;
    }
}

