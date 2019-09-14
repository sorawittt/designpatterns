package CompositePattern;
import CompositePattern.DuckFactory.AbstractDuckFactory;
import CompositePattern.DuckFactory.CountingDuckFactory;
import CompositePattern.DuckFactory.DuckFactory;
import CompositePattern.DuckFactory.EchoCountingDuckFactory;
import CompositePattern.Flock.Flock;
import CompositePattern.quack.QuackCounter;
import CompositePattern.quack.Quackable;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DuckFactory();
        simulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        System.out.println("\nDuck Simulator: With Composite - Flocks");


//        Quackable mallardDuck = duckFactory.createMallardDuck();
//        Quackable redheadDuck = duckFactory.createRedheadDuck();
//        Quackable duckCall = duckFactory.createDuckCall();
//        Quackable rubberDuck = duckFactory.createRubberDuck();
//        Quackable goose = new GooseAdapter(new Goose());
//        Quackable pigeon = new PigeonAdapter(new Pigeon());

        Flock flockOfMallards = new Flock();

        Quackable one = duckFactory.createMallardDuck();
        Quackable two = duckFactory.createRubberDuck();
        Quackable three = duckFactory.createDuckCall();
        Quackable four = duckFactory.createRubberDuck();
        flockOfMallards.add(one);
        flockOfMallards.add(two);
        flockOfMallards.add(three);
        flockOfMallards.add(four);

        simulate(flockOfMallards);

    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
