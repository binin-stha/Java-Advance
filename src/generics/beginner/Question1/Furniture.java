package generics.beginner.Question1;

public class Furniture {
    private String name;
    public Furniture(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Furniture{name='" + name + "'}";
    }
}
