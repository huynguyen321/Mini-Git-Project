/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author admin
 */

public class Bird extends Animal implements Sound {
  

    public Bird(){
        this.sound = "Chip chip";
    }
    public Bird(String name){
        this.name = name;
        this.sound = "Chip chip";
    }
    
    @Override
    public String Say() {
        return this.sound;
    }
}
