package generics.beginner.Question1;

public class Main {
    static void main() {
        Storage<Electronics> electronicsStorage = new Storage<>();

        electronicsStorage.add(new Electronics("Laptop"));
        electronicsStorage.add(new Electronics("Smartphone"));

        System.out.println("Electronics:");
        System.out.println(electronicsStorage.getAll());

        Storage<Furniture> furnitureStorage = new Storage<>();

        furnitureStorage.add(new Furniture("Chair"));
        furnitureStorage.add(new Furniture("Table"));

        System.out.println("\nFurniture:");
        System.out.println(furnitureStorage.getAll());

        Storage<Clothing> clothingStorage = new Storage<>();
        clothingStorage.add(new Clothing("Jacket"));
        clothingStorage.add((new Clothing("T-shirt")));

        System.out.println("\nClothing:");
        System.out.println(clothingStorage.getAll());

        electronicsStorage.remove(1);

        System.out.println("\nAfter Removal:");
        System.out.println(electronicsStorage.getAll());

        System.out.println();

        System.out.println(clothingStorage.get(0));
        System.out.println();

        Furniture desk = new Furniture("Desk");
        System.out.println(furnitureStorage.contains(desk));

        furnitureStorage.add(desk);
        System.out.println(furnitureStorage.contains(desk));
    }
}
