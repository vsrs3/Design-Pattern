package Iterator;

public class Demo {
    public static void main(String[] args) {
        BookCollection library = new BookCollection();
        
        library.addBook("Design Patterns: Elements of Reusable Object-Oriented Software");
        library.addBook("Clean Code: A Handbook of Agile Software Craftsmanship");
        library.addBook("Effective Java");
        library.addBook("The Pragmatic Programmer");
        
        System.out.println("Books in the library:");
        Iterator<String> iterator = library.createIterator();
        
        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next());
        }
    }
}