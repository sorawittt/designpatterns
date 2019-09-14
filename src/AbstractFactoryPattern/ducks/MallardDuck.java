package AbstractFactoryPattern.ducks;

import AbstractFactoryPattern.quack.Quackable;

public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
