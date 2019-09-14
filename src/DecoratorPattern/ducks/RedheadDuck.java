package DecoratorPattern.ducks;

import DecoratorPattern.quack.Quackable;

public class RedheadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
