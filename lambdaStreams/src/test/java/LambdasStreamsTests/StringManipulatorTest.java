package LambdasStreamsTests;

import LambdasStreams.CaptializeStringManipulator;
import LambdasStreams.IntMath;
import LambdasStreams.StringManipulator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManipulatorTest {

    @Test
    void capitalizeString() {
        StringManipulator testObject = new CaptializeStringManipulator();
        String name = "alex";
        String result = testObject.modify(name);
        assertEquals("ALEX", result);
    }

    @Test
    void capitilizeFirstLetterOnly_withAnonymousClass() {
        StringManipulator testObject = new StringManipulator() {
            @Override
            public String modify(String s) {
                String firstChar = s.substring(0,1).toUpperCase();
                String endChars = s.substring(1);


                return firstChar + endChars;
            }
        };
        String name = "alex";
        String result = testObject.modify(name);
        assertEquals("Alex", result);
    }

    @Test
    void lowerCaseAString_WithLambda(){
        StringManipulator testObject = String::toLowerCase;
        String name = "AlEx";
        String result = testObject.modify(name);
        assertEquals("alex", result);
    }

    @Test
    void addition_withLambda() {
        IntMath math = (a, b) -> a + b;

        assertEquals(5, math.doMath(2,3));
    }
}
