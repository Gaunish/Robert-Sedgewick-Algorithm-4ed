import java.util.Arrays;
import template.sorttemplate;
import merge.merge;

public class naturalmerge
{
      public static void naturalsort(Comparable[] arr)
      {
            int N = arr.length;
            Comparable[] a = new Comparable[N];
            int lo = 0;
            int mid = 0;
            int hi = 0;
            int j = 0;
            boolean drip = false;
            for(int i = 1; i < N; i++)
            {
                  if(arr[i].compareTo(arr[i - 1]) < 0)
                  {
                      if(drip == false)
                      {
                          mid = i - 1;
                          drip = true;
                      }
                      else
                      {
                            hi = i - 1;
                            merge.inmerge(arr, a, lo, mid, hi);
                            mid = hi;
                      }
                  }
            }

            if(hi != N - 1)
            {
                  merge.inmerge(arr, a, lo, mid , N - 1);
            }
      }

      public static void main(String[] args)
      {
          Integer[] arr = {3, 2, 1, 4, 4, 2, 4 , 1, 10, 9, 2, 1 };
          naturalsort(arr);
          sorttemplate.show(arr);
      }

}
