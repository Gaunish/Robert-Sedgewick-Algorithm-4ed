package binary;
import java.util.Arrays;

public class binarysearch
{
      public static int rank(int[] a, int key)
      {
            int n = a.length;
            return rank(a, key, 0, n - 1);
      }

      public static int rank(int[] a, int key, int lo, int hi)
      {
            if(lo <= hi)
            {
                  int mid = lo + (hi - lo) / 2;
                  if(a[mid] == key) { return mid;}
                  else if(a[mid] < key) { return rank(a, key, mid + 1, hi); }
                  else if(a[mid] > key) { return rank(a, key, lo, mid - 1); }
            }
            return -1;
      }

      public static void main(String[] args)
      {
            int[] arr = {1, 2, 3, 5, 7, 9, 11, 14, 19, 23, 28, 31};
            int key = rank(arr, 0);
            System.out.println("key : " + key);
      }
}
