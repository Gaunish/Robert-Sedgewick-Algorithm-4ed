package insertion;
import template.sorttemplate;
import java.util.Arrays;

public class insertionsort
{
      public static void insertionsort(Comparable[] a, int lo, int hi)
      {
            for(int i = lo; i < hi; i++)
            {
                  for (int j = i; j > lo && sorttemplate.less(a[j], a[j-1]); j--)
                  {
                        sorttemplate.exchange(a, j, j-1);
                  }
            }
      }

            public static void main(String[] args)
            {
                  Integer[] tester = {3, 2, 5, 7, 2, 9, 4, -1, 32, 43, 2, 1, 0, 4, 21,  45 ,24, 43 , 34};
                  insertionsort(tester, 0, 9);
                  sorttemplate.show(tester);
            }
}
