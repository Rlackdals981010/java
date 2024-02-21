package week_0;
import java.util.*;

public class Permutation {
    public static int[] v = {1, 2, 3};

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        makePermutation(3, 0);
    }

    static void makePermutation(int n, int depth) {
        if (depth == n) {
            System.out.println(Arrays.toString(v));
            return;
        }
        for (int i = depth; i < n; i++) {
            swap(i, depth);
            makePermutation(n, depth + 1);
            swap(i, depth);
        }
    }

    static void swap(int i, int depth) {
        int m = v[i];
        v[i] = v[depth];
        v[depth] = m;
    }
}