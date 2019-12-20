package Generics;

public class Box<TYPE, ERROR extends Exception>  {

    private final ERROR error;
    private TYPE item;

    public Box(ERROR error){
        this.error = error;
    }
    public void add(TYPE item) {
        this.item = item;

    }

    public TYPE remove() throws ERROR {
        if (null == item) {
            throw error;
        }
        TYPE myItem = item;
        item=null;
        return myItem;
    }

    public TYPE manageItem() {
        return item;
    }
}
