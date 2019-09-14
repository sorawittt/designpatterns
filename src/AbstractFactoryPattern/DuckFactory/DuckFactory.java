package AbstractFactoryPattern.DuckFactory;

import AbstractFactoryPattern.ducks.DuckCall;
import AbstractFactoryPattern.ducks.MallardDuck;
import AbstractFactoryPattern.ducks.RedheadDuck;
import AbstractFactoryPattern.ducks.RubberDuck;
import AbstractFactoryPattern.quack.Quackable;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
