package generics.beginner.Question2;

public class Course implements Identifiable{
    private int id;
    private String name;

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Course: " + name + ", id: " + id;
    }

}
