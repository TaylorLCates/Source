package com.improving;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class DrankRepository {


    private final List<Dranks> dranks = new ArrayList<>();

    public DrankRepository() {
        dranks.add(new Dranks("1","Old Grandad", "$16", "Jim Beam Distillery"));
        dranks.add(new Dranks("2","Blade and Bow", "$45", "Stitzel-Weller"));
        dranks.add(new Dranks("3","W.L. Weller", "$30", "Sazerac"));
        dranks.add(new Dranks("4", "Fight Milk", "Free", "Crows"));
    }

    public void add(Dranks drank) {
        dranks.add(drank);
    }

    public void remove(Dranks drank){
        dranks.remove(drank);
    }

    public List<Dranks> getDranks(){
        return Collections.unmodifiableList(dranks);
    }

    public Dranks getDrank(Integer id) {
        return dranks.get(id - 1);
    }
}
