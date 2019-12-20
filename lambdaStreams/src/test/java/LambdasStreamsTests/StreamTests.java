package LambdasStreamsTests;

import LambdasStreams.Person;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamTests {

    @Test
    void filterOutAdults() {
        List<Person> peeps = createPeople();
        List<Person> kids = peeps.stream().filter(p -> p.getAge() < 18).collect(Collectors.toList());
        assertEquals(2, kids.size());
        assertEquals("John", kids.get(0).getName());
    }

    @Test
    void getAllNames() {
        List<Person> peeps = createPeople();
        List<String> names = peeps.stream().map(pr -> pr.getName()).collect(Collectors.toList());
        assertEquals(peeps.size(), names.size());
        assertEquals("John", names.get(1));
    }

    private List<Person> createPeople() {
        List<Person> peeps = new ArrayList<>();
        peeps.add(new Person("Alex", 30));
        peeps.add(new Person("John", 11));
        peeps.add(new Person("Percy", 93));
        peeps.add(new Person("Dante", 20));
        peeps.add(new Person("Toby", 15));
        return peeps;
    }

    @Test
    void getAverageAge() {
        List<Person> peeps = createPeople();
        int age = peeps.stream().map(p -> p.getAge()).reduce(0, (answer, a) -> answer+= a) /peeps.size();
        assertEquals(33, age);
    }
    @Test
    void printOutNames() {
        List<Person> peeps = createPeople();
        peeps.stream().forEach(peep -> System.out.println(peep.getName() + ", "));
    }

}
