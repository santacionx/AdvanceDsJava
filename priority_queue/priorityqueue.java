import java.util.*;

class node<v> {
    v value;
    int priority;

    node(v value, int priority) {
        this.value = value;
        this.priority = priority;
    }
}

public class priorityqueue<v> {
    // heap array (value, priority)
    ArrayList<node<v>> heap;

    public priorityqueue() {
        heap = new ArrayList<>();
    }

    public int size() {
        return heap.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void insert(v value) {

    }

    public v getMin() throws thereiswong {
        if (size() == 0) {
            throw new thereiswong();
        }
        return heap.get(0).value;
    }

    public v removeMin() {

    }

    public static void main(String[] args) {

    }
}