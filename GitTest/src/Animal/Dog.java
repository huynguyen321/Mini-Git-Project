package Animal;

public class Dog extends Animal implements Sound {

    public Dog() {
        this.sound = "Gau gau";
    }

    public Dog(String name) {
        this.name = name;
        this.sound = "Gau gau";
    }

    @Override
    public String Say() {
        return this.sound;
    }

}
