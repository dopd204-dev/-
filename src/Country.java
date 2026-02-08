public class Country {

    String name;
    long population;
    double area;
    String language;

    public Country(String name, long population, double area, String language) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.language = language;
    }

    public static Country findLargestCountry(Country[] countries) {
        Country largest = countries[0];

        for (int i = 1; i < countries.length; i++) {
            if (countries[i].area > largest.area) {
                largest = countries[i];
            }
        }
        return largest;
    }
}

