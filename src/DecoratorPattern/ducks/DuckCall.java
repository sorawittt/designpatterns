package DecoratorPattern.ducks;

import DecoratorPattern.quack.Quackable;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
