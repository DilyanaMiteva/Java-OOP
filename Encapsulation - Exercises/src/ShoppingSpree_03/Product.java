package ShoppingSpree_03;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.setName(name);
        this.setCost(cost);
    }

    private void setName(String name) {
        Validator.isValidName(name);
        this.name = name;

    }

    private void setCost(double cost) {
        Validator.isValidMoney(cost);
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}


