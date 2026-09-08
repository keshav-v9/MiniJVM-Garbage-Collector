package core;

import java.util.ArrayList;
import java.util.List;

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
    public void addReference(int address) {
    references.add(address);
    }

    public void removeRefrence(int address){
        references.remove(address);
    }

    public boolean isMarked(){
        return marked;
    }
    public void setMarked(boolean marked) {
    this.marked = marked;
    }

    @Override
    public String toString() {
    return name + " { id=" + id
            + ", marked=" + marked
            + ", refs=" + references
            + " }";
    }
}