package core;

import java.util.List;
import java.util.ArrayList;

public class HeapObject {

    private final int id;
    private final String name;
    private boolean marked;
    private List<Integer> references;

    public HeapObject(int id, String name) {
        this.id = id;
        this.name = name;
        this.marked = false;
        this.references = new ArrayList<>();
    }
    @Override
    public String toString() {
    return name + " { id=" + id
            + ", marked=" + marked
            + ", refs=" + references
            + " }";
    }
}