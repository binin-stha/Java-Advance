package generics.beginner.Question2;

public class Student implements Identifiable{
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getRollNo() {
        return this.id;
    }

    public int getAge(){
        return this.age;
    }

     @Override
    public String toString() {
        return "Student: " + name + ", id: " + id + ", Age: " + age;
    }

    @Override
    public int getId() {
        return id;
    }
}
