package selection;
import template.sorttemplate;
import java.lang.*;
import java.util.Arrays;

public class selectionsort
{
      public static void selectionsort(Comparable[] a, int lo, int hi)
      {
            for(int i = lo; i < hi; i++)
            {
                  int min = i;
                  for(int j = i + 1; j < hi; j++)
                  {
                        if(sorttemplate.less(a[j], a[min]))
                        {   min = j;   }
                  }
                  sorttemplate.exchange(a, min, i);

            }

      }


      public static void main(String[] args)
      {
            Integer[] tester = {3, 2, 5, 7, 2, 9, 4, 2, 1, 0, 4, 21,  45 ,24, 43 , 34};
            selectionsort(tester, 0, 9);
            sorttemplate.show(tester);
      }
}
