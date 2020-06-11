package shell;
import template.sorttemplate;
import java.util.Arrays;

public class shellsort
{
      public static void shellsort(Comparable[] a)
      {
            int h = 1;
            while(h < (a.length / 3))
            {   h = (3*h) + 1; }

            while(h >= 1)
            {
                  for(int i = h; i < a.length; i++)
                  {
                        for(int j = i; j >= h && sorttemplate.less(a[j], a[j-h]); j -= h)
                        {
                              sorttemplate.exchange(a, j , (j-h));
                        }
                  }
                  h = h / 3;
            }
      }

      public static void main(String[] args)
      {
            Integer[] tester = {3, 2, 5, 7, 2, 9, 4, -1, 32, 43, 2, 1, 0, 4, 21,  45 ,24, 43 , 34};
            shellsort(tester);
      }
}
