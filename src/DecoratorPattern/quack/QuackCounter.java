package DecoratorPattern.quack;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public static int getQuacks() {
        return numberOfQuacks/2;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }


}
