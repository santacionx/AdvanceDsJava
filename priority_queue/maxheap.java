package priority_queue;

import java.util.*;

class node<v> {
    v value;
    int priority;

    node(v value, int priority) {
        this.value = value;
        this.priority = priority;
    }
}

public class maxheap<v> {
    // heap array (value, priority)
    ArrayList<node<v>> heap;

    public maxheap() {
        heap = new ArrayList<>();
    }

    public int size() {
        return heap.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void insert(v value, int priority) {
        node<v> root = new node<>(value, priority);
        heap.add(root);
        int cindex = heap.size() - 1;
        int pindex = (cindex - 1) / 2;
        // itr untill reached top of the tree or parent <=child priority
        // itr untill reached top of the tree
        while (cindex > 0) {
            // parent is gtr than child priority swap
            if (heap.get(cindex).priority >= heap.get(pindex).priority) {
                node<v> temp = heap.get(pindex);
                heap.set(pindex, heap.get(cindex));
                heap.set(cindex, temp);
                cindex = pindex;
                pindex = (cindex - 1) / 2;

            } else {
                // or parent >=child priority
                return;
            }
        }

    }

    public v getMax() throws thereiswong {
        if (size() == 0) {
            throw new thereiswong();
        }
        return heap.get(0).value;
    }

    public v removeMax() {

    }

    public static void main(String[] args) {

    }
}