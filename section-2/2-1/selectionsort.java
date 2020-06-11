package selection;
import template.sorttemplate;
import java.lang.*;
import java.util.Arrays;

public class selectionsort
{
      public static void selectionsort(Integer[] a)
      {
            for(int i = 0; i < a.length; i++)
            {
                  int min = i;
                  for(int j = i + 1; j < a.length; j++)
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
            selectionsort(tester);
            sorttemplate.show(tester);
      }
}
