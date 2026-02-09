public class Book {


    String title;

    static int bookCount = 0;

    public Book(String title) {
        this.title = title;
        bookCount++;
    }

    public static void showBookCount() {
        System.out.println("Түзүлгөн китептердин саны: " + bookCount);
    }
}
