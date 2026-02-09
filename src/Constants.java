public class Constants {


    // Константалар
    public static final double PI = 3.14;
    public static final int MAX_USERS = 100;

    public static double getPI() {
        return PI;
    }

    public static int getMaxUsers() {
        return MAX_USERS;
    }


    public static void main(String[] args) {

        System.out.println("PI = " + Constants.getPI());
        System.out.println("MAX_USERS = " + Constants.getMaxUsers());


    }
}
