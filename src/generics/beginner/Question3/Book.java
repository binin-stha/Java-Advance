package generics.beginner.Question3;

import generics.beginner.Question3.Identifiable;

public class Book implements Identifiable {
    private int id;
    private String name;

    public Book(int id, String name) {
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
        return "Book id = " + id + ", name = " + name;
    }

}
