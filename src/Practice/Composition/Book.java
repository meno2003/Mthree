package Practice.Composition;

class Book {
    String title;
    String isbn;
    Author[] authors;     // composition
    Publisher publisher;  // composition

    Book(String title, String isbn, Author[] authors, Publisher publisher) {
        this.title = title;
        this.isbn = isbn;
        this.authors = authors;
        this.publisher = publisher;
    }
}