package SayHelloExtended_04;

public abstract class BasePerson implements Person{
    private String name;

    protected BasePerson(String name) {
        this.setName(name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Hello";
    }

    private void setName(String name) {
        this.name = name;
    }
}
