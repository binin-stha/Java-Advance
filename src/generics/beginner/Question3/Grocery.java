package generics.beginner.Question3;

public class Grocery implements Identifiable {
    private int id;
    private String item;

    public Grocery(int id, String item) {
        this.id = id;
        this.item = item;
    }

    @Override
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.item;
    }

    @Override
    public String toString() {
        return "Book id = " + id + ", name = " + item;
    }
}
