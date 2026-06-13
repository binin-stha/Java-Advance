package generics.beginner.Question3;

public class Main {
    static void main() {
        Cart<Book> bookCart = new Cart<>();
        bookCart.addItem(new Book(1, "Harry Potter"));
        bookCart.addItem(new Book(2, "Love is All i got"));
        bookCart.addItem(new Book(3, "Something new"));

        System.out.println(bookCart.viewItems());

        bookCart.addItem(new Book(3, "Something new"));
        bookCart.addItem(new Book(5, "Something new"));

//        bookCart.removeItem(new Book(1, "Harry Potter"));
        bookCart.removeItemById(2);

        System.out.println(bookCart.viewItems());

        bookCart.addItem(new Book(2, "Something new to come"));
        System.out.println(bookCart.viewItems());

        bookCart.removeItemById(5);
    }
}
