package generics.beginner.Question2;

public class Teacher implements Identifiable {
    private int id;
    private String name;

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Teacher: " + name + ", id: " + id;
    }
}
