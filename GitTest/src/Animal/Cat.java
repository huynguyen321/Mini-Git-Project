
package Animal;

public class Cat extends Animal implements Sound{

    public Cat(){
        this.sound = "Meow Meow";
    }
    public Cat(String name){
        this.name = name;
        this.sound = "Meow Meow";
    }
    
    @Override
    public String Say() {
        return this.sound;
    }
}
