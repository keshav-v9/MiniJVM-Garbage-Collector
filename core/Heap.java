public class Heap{

    private HeapObject[] slots;
    private int capacity;

    public Heap(int capacity){
        this.capacity = capacity;
        slots = new HeapObject[capacity];
    }

    public int capacity(){
        return capacity;
    }

    public HeapObject get(int index){
        return slots[index];
    }

    public void set(int index, Object HO){
        slots[index] = HO;
    }

    public boolean isFree(int index){
        return slots[i] == null;
    }

}