import java.util.*;

class node<v> {
    v value;
    int priority;

    node(v value, int priority) {
        this.value = value;
        this.priority = priority;
    }
}

public class priorityqueue<k, v> {
    // heap array (value, priority)
    ArrayList<node<k>> heap;

    public priorityqueue() {
        heap = new ArrayList<>();
    }

    public int size() {

    }

    public boolean isEmpty() {

    }

    public void insert(v value) {

    }

    public v getMin() {

    }

    public v getMax() {

    }

    public v removeMin() {

    }

    public v removeMax() {

    }

    public static void main(String[] args) {

    }
}