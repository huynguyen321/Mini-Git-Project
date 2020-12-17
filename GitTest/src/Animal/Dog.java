package Animal;
public class Dog extends Animal implements Sound(
    public Dog (){
        this.sound = " haha";
    }
    public Dog (String name){
        this.name = name;
        this.sound = " haha";
    }
    @Override
    public String Say(){
        return this.sound;
    }

)