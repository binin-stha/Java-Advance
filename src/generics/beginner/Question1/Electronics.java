package generics.beginner.Question1;

public class Electronics {
    private String name;
    public Electronics(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Electronics{name='" + name + "'}";
    }
}
