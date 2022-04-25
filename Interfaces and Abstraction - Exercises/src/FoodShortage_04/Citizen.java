package FoodShortage_04;

public class Citizen implements Buyer, Identifiable, Person, Birthable{

    private static final int INCREASES_FOOD_WHIT_TEN = 10;

    private String name;
    private int age;
    private String id;
    private String birthDate;
    private int food = 0;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
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

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }


    @Override
    public String getBirthDate() {
        return this.birthDate;
    }
}
