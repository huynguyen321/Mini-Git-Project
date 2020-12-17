/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author huy.nguyen22
 */
public class Test {

    public static void main(String[] args) {
        Cat cat = new Cat("Kitty");
        Dog dog = new Dog("Lulu");
        Bird bird = new Bird("Miki");

        System.out.println("Sound of " + dog.name + " is " + cat.Say());
        System.out.println("Sound of " + dog.name + " is " + dog.Say());
        System.out.println("Sound of " + bird.name + " is " + bird.Say());

    }
}
