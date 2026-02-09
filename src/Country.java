
    String name;
    long population;
    double area;
    String language;

    public String getName() {
        return name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setName(String name) {
        this.name = name;

    }

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
