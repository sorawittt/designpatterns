package AdapterPattern.ducks;

import AdapterPattern.quack.Quackable;

public class RedheadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
