package FoodShortage_04;

public class Rebel implements Buyer, Person{

    private static final int INCREASES_FOOD_WHIT_TEN = 5;

    private String name;
    private int age;
    private String group;
    private int food = 0;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.food = 0;
    }

    @Override
    public void buyFood() {
        food += INCREASES_FOOD_WHIT_TEN;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

}
