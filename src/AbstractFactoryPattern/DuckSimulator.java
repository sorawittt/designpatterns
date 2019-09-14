package AbstractFactoryPattern;
import AbstractFactoryPattern.DuckFactory.CountingDuckFactory;
import AbstractFactoryPattern.DuckFactory.DuckFactory;
import AbstractFactoryPattern.DuckFactory.EchoCountingDuckFactory;
import AbstractFactoryPattern.DuckFactory.AbstractDuckFactory;
import AbstractFactoryPattern.quack.QuackCounter;
import AbstractFactoryPattern.quack.Quackable;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory echoCountingDuckFactory = new EchoCountingDuckFactory();
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        AbstractDuckFactory duckFactory = new DuckFactory();
        simulator.simulate(echoCountingDuckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        System.out.println("\nDuck Simulator: With Abstract Factory");
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
