
import java.util.*;

public class heapsort {
    // nlogn o(1)inplace space-complexity
    public static void downheap(int a[], int i, int n) {
        int pindex = i, lindex = (2 * pindex + 1), rindex = (2 * pindex + 2);
        while (lindex < n) {
            int mi = pindex;
            if (a[lindex] < a[mi]) {
                mi = lindex;
            }
            if (rindex < n && a[rindex] < a[mi]) {
                mi = rindex;
            }
            if (mi == pindex) {
                return;
            }
            int temp = a[pindex];
            a[pindex] = a[mi];
            a[mi] = temp;
            pindex = mi;
            lindex = 2 * pindex + 1;
            rindex = 2 * pindex + 2;
        }
    }

    public static void heapsor(int a[]) {
        int n = a.length;
        // to build a heap
        for (int i = (n / 2) - 1; i >= 0; i--) {
            downheap(a, i, n);
        }
        // to remove elements from start to last pos
        for (int i = n - 1; i >= 0; i--) {
            int temp = a[i];
            a[i] = a[0];
            a[0] = temp;
            downheap(a, 0, i);
        }
    }

    public static void main(String[] args) {
        int a[] = { 4, 7, 3, 2, 8, 9, 6, 1 };
        heapsor(a);
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }

}
// o/p
// 1 2 3 4 6 7 8 9
