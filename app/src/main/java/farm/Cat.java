package farm;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String talk() {
        return this.name + " diz miau.";
    }
}