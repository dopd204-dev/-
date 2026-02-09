public class Calculator {

    private static int a;
    private static int b;

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Calculator.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        Calculator.b = b;
    }

    // Static методдор
    public static int add() {
        return a + b;
    }

    public static int subtract() {
        return a - b;
    }

    public static int multiply() {
        return a * b;
    }

    public static int divide() {
        if (b == 0) {
            throw new ArithmeticException("Нөлгө бөлүүгө болбойт");
        }
        return a / b;
    }

    public static void main(String[] args) {

        Calculator.setA(10);
        Calculator.setB(5);

        System.out.println("Кошуу: " + Calculator.add());
        System.out.println("Алуу: " + Calculator.subtract());
        System.out.println("Көбөйтүү: " + Calculator.multiply());
        System.out.println("Бөлүү: " + Calculator.divide());
    }
}
