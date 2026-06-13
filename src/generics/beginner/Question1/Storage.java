package generics.beginner.Question1;

import java.util.ArrayList;
import java.util.List;

public class Storage<T> {
    private List<T> items;

    public Storage() {
        items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public T get(int index) {
        return items.get(index);
    }

    public void remove(int index) {
        items.remove(index);
    }

    public List<T> getAll() {
        return items;
    }

    public boolean contains(T item) {
        return items.contains(item);
    }



}
