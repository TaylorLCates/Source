import java.util.ArrayList;
import java.util.List;

public class Engine {

    private List<Locations> locationList = new ArrayList<>();

    public void run() {

        boolean loop
    }

    private Locations world(){
        Locations lake = new Locations();
        Locations forest = new Locations();
        Locations treeHouse= new Locations();

        lake.setName("Lake");
        lake.getExits().add(new Exits("South", forest));
        forest.getExits().add(new Exits("North", lake));
        forest.getExits().add(new Exits("Up", treeHouse));
        treeHouse.getExits().add(new Exits("Down", forest));
        treeHouse.getExits().add(new Exits("Zipline", lake));

        return lake;
    }
}
