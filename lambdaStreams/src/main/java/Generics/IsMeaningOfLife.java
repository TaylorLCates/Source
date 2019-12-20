package Generics;

import java.util.function.Predicate;

public class IsMeaningOfLife implements Predicate<Integer> {


    @Override
    public boolean test(Integer i) {
        return i == 42;
    }
}
