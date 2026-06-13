package generics.beginner.Question1;

public class Clothing {
    public String name;
    public Clothing(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Clothing{name='" + name + "'}";
    }
}
