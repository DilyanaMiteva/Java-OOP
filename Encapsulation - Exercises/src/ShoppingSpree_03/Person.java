package ShoppingSpree_03;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money){
        this.name = name;
        this.money = money;
        this.products = new ArrayList<>();
    }

    private void setName(String name){
        Validator.isValidName(name);
        this.name = name;
    }

    private void setMoney(double money){
        Validator.isValidMoney(money);
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void buyProduct(Product product){
        if (!hasEnoughMoney(product)){
            throw new IllegalArgumentException(name + " can't afford " + product.getName());
        } else {
            products.add(product);
            this.money -= product.getCost();
        }
    }

    private boolean hasEnoughMoney(Product product) {
        return this.money >= product.getCost();
    }
}
