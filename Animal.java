abstract class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
    String getType() {
        return "Animal type: ";
    }
    String getName() {
        return "Animal name: " + name;
    }
}
