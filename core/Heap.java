import java.util.set;

public class Heap {

    private HeapObject[] slots;
    private int capacity;
    private int nextId = 1;
    private Set<Integer> roots;

    public Heap(int capacity) {
        this.capacity = capacity;
        slots = new HeapObject[capacity];
    }

    public int capacity() {
        return capacity;
    }

    public HeapObject get(int index) {
        return slots[index];
    }

    public void set(int index, HeapObject HO) {
        slots[index] = HO;
    }

    public boolean isFree(int index) {
        return slots[index] == null;
    }

    public int allocate(String name) {
        for (int i = 0; i < capacity; i++) {
            if (isFree(i)) {
                slots[i] = new HeapObject(nextId, name);
                nextId++;
                return i;
            }
        }

        return -1;
    }
    public void addReference(int from, int to) {
        if (from < 0 || from >= capacity || to < 0 || to >= capacity) {
        return;
        }

        if (slots[from] == null || slots[to] == null) {
        return;
        }

        slots[from].addReference(to);

    }

    public void removeRefrence(int from, int to){
            if (from < 0 || from >= capacity || to < 0 || to >= capacity) {
        return;
        }

        if (slots[from] == null || slots[to] == null) {
        return;
        }

        slots[from].removeRefrence(to);

    }

    public void addRoot(int address){

        roots.add(address);

    }

    public void removeRoot(int address){
        roots.remove(address);

    }

    public boolean isRoot(int address){
        return roots.contains(address);
    }



    











}