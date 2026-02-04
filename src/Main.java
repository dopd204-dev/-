
public static void main(String[] args) {
    Programmer programmer =
            new Programmer("Бека", "Java Developer", "Google");

    Dancer dancer =
            new Dancer("Ainura", "Professional Dancer", "Kyrgyz Group");

    Singer singer =
            new Singer("Бексултан", "Rock Singer", "RockStars");

    System.out.println(programmer.toString());
    System.out.println(dancer.toString());
    System.out.println(singer.toString());
}