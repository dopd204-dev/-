
public static void main(String[] args) {
    Country c1 = new Country("Кыргызстан",7000000,199951,"Кыргыз тили");
    Country c2 = new Country("Казакстан", 19000000, 2724900, "Казак тили");
    Country c3 = new Country("Өзбекстан", 36000000, 448924, "Өзбек тили");

    Country[] countries = {c1, c2, c3};

    Country largest = Country.findLargestCountry(countries);

    System.out.println("Аянты боюнча эн чон олко ");
    System.out.println("Аты: " + largest.name);
    System.out.println("Аянты: " + largest.area);
    System.out.println("Калкы: " + largest.population);
    System.out.println("Тили: " + largest.language);

}