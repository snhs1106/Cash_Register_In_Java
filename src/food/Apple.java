package food;
public class Apple {

    private String type;
    private double weight;
    private double pricePreUnitWeight;

    public Apple(String type, double weightInGrams, double pricePreUnitWeight) {

        weight = 0.00220 * weightInGrams;
        this.type = type;
        this.pricePreUnitWeight = pricePreUnitWeight;

    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public double getPricePreUnitWeight() {
        return pricePreUnitWeight;
    }

    public void setPricePreUnitWeight(double pricePreUnitWeight, String personal) {
        this.pricePreUnitWeight = pricePreUnitWeight;
    }

    public void displayInfo() {
        System.out.println("==========================================");
        System.out.println("Apple Info");
        System.out.println("==========================================");
        System.out.printf("Type:\t\t\t\t\t\t %-15s\n", type);
        System.out.printf("Weight:\t\t\t\t\t\t %-6.4f lbs\n", weight);
        System.out.printf("Price Pre Unit:\t\t\t\t %-10.2f\n", pricePreUnitWeight);
        System.out.printf("Price:\t\t\t\t\t\t $%-10.2f\n", price());
        System.out.println("");
    }

    public double price() {
        double price = weight * pricePreUnitWeight;
        return price;
    }
}

