public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public void singing() {
        System.out.println(name + " is singing");
    }

    public void playGuitar() {
        System.out.println(name + " is playing guitar");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Band: " + bandName;
    }
}

