import java.util.ArrayList;
import java.util.List;

public class Locations {

    private String name;
    private List<Exits> exits = new ArrayList<>();

    public Locations() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Exits> getExits() {
        return exits;
    }

    public void setExits(List<Exits> exits) {
        this.exits = exits;
    }


}
