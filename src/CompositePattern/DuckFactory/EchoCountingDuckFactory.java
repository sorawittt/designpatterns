package CompositePattern.DuckFactory;

import CompositePattern.ducks.DuckCall;
import CompositePattern.ducks.MallardDuck;
import CompositePattern.ducks.RedheadDuck;
import CompositePattern.ducks.RubberDuck;
import CompositePattern.quack.QuackCounter;
import CompositePattern.quack.QuackEcho;
import CompositePattern.quack.Quackable;

public class EchoCountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackEcho(new QuackCounter(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackEcho(new QuackCounter(new RedheadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackEcho(new QuackCounter(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackEcho(new QuackCounter(new RubberDuck()));
    }
}
