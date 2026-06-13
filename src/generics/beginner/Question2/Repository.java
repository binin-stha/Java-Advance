package generics.beginner.Question2;

import java.util.ArrayList;
import java.util.List;

public class Repository<T extends Identifiable> {
    private List<T> records;

    public Repository() {
        records = new ArrayList<>();
    }

    public void save(T record) {
        if(findById(record.getId()) != null) {
            System.out.println("Duplicate entry is not allowed");
            return;
        }
        records.add(record);

    }

    public void deleteById(int id) {
        records.remove(id-1);
    }

    public T findById(int id) {
        for (T record : records) {
            if (record.getId() == id) {
                return record;
            }
        }
        return null;
    }

    public List<T> findAll() {
        return records;
    }
}
