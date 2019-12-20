public class Exits {

    private String name;
    private Locations destination;

    public Exits(String name, Locations destination) {
        this.name = name;
        this.destination = destination;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Locations getDestination() {
        return destination;
    }

    public void setDestination(Locations destination) {
        this.destination = destination;
    }


}
