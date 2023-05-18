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

class priorityqueue1<v> {
    // heap array (value, priority)
    ArrayList<node<v>> heap;

    public priorityqueue1() {
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
            if (heap.get(cindex).priority < heap.get(pindex).priority) {
                node<v> temp = heap.get(pindex);
                heap.set(pindex, heap.get(cindex));
                heap.set(cindex, temp);
                cindex = pindex;
                pindex = (cindex - 1) / 2;

            } else {
                // or parent <=child priority
                return;
            }
        }

    }

    public v removeMin() throws thereiswong {
        if (isEmpty()) {
            throw new thereiswong();
        }
        node<v> temp = heap.get(0);
        v ans = temp.value;
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int pindex = 0, lindex = (2 * pindex + 1), rindex = (2 * pindex + 2), minindex = pindex;
        while (lindex < heap.size()) {
            if (heap.get(lindex).priority < heap.get(minindex).priority) {
                minindex = lindex;
            }
            if (rindex < heap.size() && (heap.get(rindex).priority < heap.get(minindex).priority)) {
                minindex = rindex;
            }
            if (minindex == pindex) {
                break;
            }
            node<v> temp1 = heap.get(minindex);
            heap.set(minindex, heap.get(pindex));
            heap.set(pindex, temp1);
            pindex = minindex;
            lindex = 2 * pindex + 1;
            rindex = 2 * pindex + 2;
        }
        return ans;
    }

    public v getMin() {
        return heap.get(0).value;
    }
}

public class priorityqueue {
    public static void main(String[] args) {
        priorityqueue1<String> pq = new priorityqueue1();
        pq.insert("abc", 15);
        pq.insert("def", 20);
        System.out.println(pq.getMin());

    }
}
