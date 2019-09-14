package DecoratorPattern;

import DecoratorPattern.ducks.DuckCall;
import DecoratorPattern.ducks.MallardDuck;
import DecoratorPattern.ducks.RedheadDuck;
import DecoratorPattern.ducks.RubberDuck;
import DecoratorPattern.quack.QuackCounter;
import DecoratorPattern.quack.QuackEcho;
import DecoratorPattern.quack.Quackable;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new QuackEcho(new QuackCounter(new MallardDuck()));
        Quackable redheadDuck = new QuackEcho(new QuackCounter(new RedheadDuck()));
        Quackable duckCall = new QuackEcho(new QuackCounter(new DuckCall()));
        Quackable rubberDuck = new QuackEcho(new QuackCounter(new QuackCounter(new RubberDuck())));
        Quackable goose = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        System.out.println("-- Duck Simulator --");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);
        simulate(pigeon);

        System.out.println("The ducks quacked " +
                QuackCounter.getQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
