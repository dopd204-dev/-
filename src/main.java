public class main {
        public static void main(String[] args) {

            Person[] people = new Person[3];

            people[0] = new Programmer("Ali", 22);
            people[1] = new Dancer("Aizada", 20);
            people[2] = new Singer("Bek", 25);

            for (Person p : people) {
                System.out.println(p);
                p.walk();
                System.out.println("------------------");
            }
        }

    }
