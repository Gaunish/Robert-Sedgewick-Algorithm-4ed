package bottom;
import java.util.Arrays;
import template.sorttemplate;
import merge.merge;
import java.lang.Math;


public class bottomup
{
      public static int compar = 0;

      public static void bottomupsort(Comparable[] a)
      {
            int N = a.length;
            Comparable[] arr = new Comparable[N];
            for(int sz = 1; sz < N; sz = sz + sz)
            {
                  for(int lo = 0; lo < N - sz; lo += sz + sz)
                  {
                        merge.inmerge(a, arr, lo, lo + sz - 1, Math.min(N - 1, lo + sz + sz - 1));
                  }
            }

      }

      public static void main(String[] args)
      {
            Integer[] a = {5, 2, 4 ,5 ,6, 7 ,13, 43 ,6 ,13, 17 ,11, 20 ,12, 0, 5, 2, 4 ,5 ,6, 7 ,13, 43 ,6 ,13, 17 ,11, 20 ,12, 0, 10, 11};
      }
}
