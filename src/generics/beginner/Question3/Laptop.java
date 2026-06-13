package generics.beginner.Question3;

public class Laptop implements Identifiable {

    private int id;
    private String name;

    public Laptop(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Laptop id = " + id + ", name = " + name;
    }
}
