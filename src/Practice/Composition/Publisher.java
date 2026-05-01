package Practice.Composition;

class Publisher {
    String name;
    Address address; // composition
    String phone;

    Publisher(String name, Address address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
}