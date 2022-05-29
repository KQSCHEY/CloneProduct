package app;


public class Product {

    private final String name;
    private final double weight;
    private final double prise;

    public Product(String name, double weight, double prise) {
        this.name = name;
        this.weight = weight;
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrise() {
        return prise;
    }
}
