package insertion;
import template.sorttemplate;
import java.util.Arrays;

public class insertionsort
{
      public static void insertionsort(Comparable[] a)
      {
            for(int i = 0; i < a.length; i++)
            {
                  for (int j = i; j > 0 && sorttemplate.less(a[j], a[j-1]); j--)
                  {
                        sorttemplate.exchange(a, j, j-1);
                  }
            }
      }

            public static void main(String[] args)
            {
                  Integer[] tester = {3, 2, 5, 7, 2, 9, 4, -1, 32, 43, 2, 1, 0, 4, 21,  45 ,24, 43 , 34};
                  insertionsort(tester);
                  sorttemplate.show(tester);
            }
}
