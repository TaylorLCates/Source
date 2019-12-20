package LambdasStreams;

public class CaptializeStringManipulator implements StringManipulator {

    @Override
    public String modify(String s) {
        return s.toUpperCase();
    }
}
