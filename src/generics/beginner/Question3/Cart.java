package generics.beginner.Question3;

import java.util.ArrayList;
import java.util.List;

public class Cart<T extends Identifiable> {
    private List<T> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        if (viewItemById(item.getId()) != null || viewItemByName(item.getName()) != null) {
            System.out.println("Error: Duplicate Item with same id or name exists already.");
            return;
        }
        items.add(item);
    }

    public void removeItemById(int id) {
        items.remove(id-1);
    }

    public List<T> viewItems() {
        return items;
    }

    public T viewItemById(int id) {
        for (T item: items) {
            if(item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public T viewItemByName(String name) {
        for(T item: items) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    public int getTotalItemCount() {
        return items.size();
    }
}
