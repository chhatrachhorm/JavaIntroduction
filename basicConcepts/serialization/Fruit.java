package serialization;

import java.io.Serializable;

public class Fruit implements Serializable {
    private int id;
    private String name;
    public Fruit(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " : " + name;
    }

}
