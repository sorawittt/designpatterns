package AbstractFactoryPattern.ducks;

import AbstractFactoryPattern.quack.Quackable;

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
