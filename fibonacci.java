import java.util.*;

public class fibonacci {
    public static int fib(int n, int a[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        // memoization
        int ans1, ans2;
        if (a[n - 1] == -1) {
            ans1 = fib(n - 1, a);
            a[n - 1] = ans1;
        } else {
            ans1 = a[n - 1];
        }
        if (a[n - 2] == -1) {
            ans2 = fib(n - 2, a);
            a[n - 2] = ans2;
        } else {
            ans2 = a[n - 2];
        }
        int ans = ans1 + ans2;
        return ans;

    }

    public static int fibmemoz(int n, int a[]) {
        if (n == 0 || n == 1) {
            a[n] = n;
            return a[n];
        }
        if (a[n] != -1) {
            return a[n];
        }
        a[n] = fibmemoz(n - 1, a) + fibmemoz(n - 2, a);
        return a[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[] = new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        System.out.println(fib(n, dp));
        System.out.println(fibmemoz(n, dp));
    }
}