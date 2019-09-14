package CompositePattern.Flock;

import CompositePattern.quack.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable)iterator.next();
            if (i == 0) {
                quacker.quack();
                quacker.quack();
            }
            quacker.quack();
            i++;
        }
    }
}
