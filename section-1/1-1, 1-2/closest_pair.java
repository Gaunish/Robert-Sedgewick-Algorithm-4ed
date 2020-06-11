import edu.princeton.cs.algs4.*;
import java.lang.Math;
import java.util.Arrays;

class closest_pair
{
      public static int find_closest(int[] arr)
      {
          Arrays.sort(arr);
          int diff = Math.abs(arr[arr.length - 1] - arr[0]);
          return diff;
      }

      public static void main(String[] args)
      {
          int[] arr = {3, 6, 10, 4 ,5 ,12 ,33};
          int diff = find_closest(arr);
          System.out.println(diff);
      }
}
