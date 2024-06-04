public class Cat extends Animal implements Moveable {

    public String type = "Cat";
    public Cat(String name) {
        super(name);
        this.name = name;
    }
    @Override
    public void start() {
        System.out.println(type + " Starts!");
    }
    @Override
    public String getType() {
        return type;
    }
    @Override
    public void stop() {
        System.out.println(type + "Stopped!");
    }

}
