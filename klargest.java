import java.util.*;

public class klargest {
    // o(nlogk); space o(k)
    public static void prink(int a[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(a[i]);
        }
        for (int i = k; i < a.length; i++) {
            if (pq.peek() < a[i]) {
                pq.poll();
                pq.add(a[i]);
            }
        }
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = { 4, 1, 6, 3, 7, 2, 9, 8 };
        prink(a, 3);
    }
}
// o/p
// 7 8 9