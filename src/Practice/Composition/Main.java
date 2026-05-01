package Practice.Composition;

public class Main {
    public static void main(String[] args) {

        Address authorAddress = new Address("123 Main St", "London", "UK", "E1");
        Author author = new Author("John", "Doe", authorAddress);

        Address publisherAddress = new Address("456 High St", "Manchester", "UK", "M1");
        Publisher publisher = new Publisher("BigBooks Ltd", publisherAddress, "123-456");

        Author[] authors = { author };

        Book book = new Book("Java Basics", "123456789", authors, publisher);

        System.out.println(book.title);
        System.out.println(book.publisher.name);
        System.out.println(book.authors[0].firstName);
        System.out.println(book.authors[0].address.city);
    }
}