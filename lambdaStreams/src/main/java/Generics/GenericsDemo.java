package Generics;

import javax.naming.ConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class GenericsDemo {

    public static void main(String[] args) throws IOException {
        Predicate<Integer> isMyFavoriteNum = s -> s.equals(33);
        IsMeaningOfLife isLife = new IsMeaningOfLife();

        System.out.println("Number 33 fave: " + isMyFavoriteNum.test(33) + "Life: " + isLife.test(33));

        Box<String, IOException> stringBox = new Box<>(new IOException());
        stringBox.add("My String");
        List<String> strings = new ArrayList<>(Arrays.asList("my", "Strings"));
        stringBox.add(strings.get(0) + strings.get(1));
        System.out.println("My box contains: " + stringBox.remove());
        System.out.println("My box contains: " + stringBox.remove());

        Box<List<String>, ConfigurationException> stringyBox = new Box<>(new ConfigurationException());
        stringyBox.add(strings);
        System.out.println("Me Strings: " + stringyBox.manageItem());

        stringyBox.manageItem().add("New");
        System.out.println("Me strings again: " + stringyBox.manageItem());
    }

}