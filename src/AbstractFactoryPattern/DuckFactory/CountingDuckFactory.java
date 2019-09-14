package AbstractFactoryPattern.DuckFactory;

import AbstractFactoryPattern.ducks.DuckCall;
import AbstractFactoryPattern.ducks.MallardDuck;
import AbstractFactoryPattern.ducks.RedheadDuck;
import AbstractFactoryPattern.ducks.RubberDuck;
import AbstractFactoryPattern.quack.QuackCounter;
import AbstractFactoryPattern.quack.Quackable;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
