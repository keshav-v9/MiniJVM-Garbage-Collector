
public class MarkAndSweepCollector implements GarbageCollector{

    public MarkAndSweepCollector(){
    }

    public void mark(Heap heap, int address){
        if (heap == null || address < 0 || address >= heap.capacity()){
            return;
        }
        else{

            HeapObject object = heap.get(address);

            if (object == null){
                return;
            }
            if (object.isMarked()){
                return;
            }

            if (object.setMarked()){
                return;
            }

            object.setMarked(true);


            for (int reference : object.getReferences()) {
                mark(heap, reference);
            }

    }

    public void collect(Heap heap){

    }

}