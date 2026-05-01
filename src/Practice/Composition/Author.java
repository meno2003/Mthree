package Practice.Composition;

class Author {
    String firstName;
    String lastName;
    Address address; // composition

    Author(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
}