import java.util.Arrays;
import template.sorttemplate;

public class sentinel
{
      public static void twentyfour(Comparable[] x)
      {
            int pos = 0;
            for(int j = 1; j < x.length; j++)
            {
                  if(sorttemplate.less(x[j], x[pos]))
                  {
                        pos = j;
                  }
            }
            Comparable[] arr = new Comparable[x.length];
            arr[0] = x[pos];
            sorttemplate.exchange(x, pos, 0);
            for(int i = 1; i < x.length; i++)
            {
                        arr[i] = x[i];
            }

            for(int k = 1; k < arr.length; k++)
            {
                  Comparable temp = arr[k];
                  int j = k;
                  while(sorttemplate.less(temp, arr[j - 1]))
                  {
                      sorttemplate.exchange(arr, j - 1, j);
                      j--;
                  }
            }

            sorttemplate.show(arr);

      }

      public static void main(String[] args)
      {
          Integer[] tester = {3, 2, 5, 7, 2, 9, 4, -1, 32, 43, 2, 1, 0, 4, 21,  45 ,24, 43 , 34};
          twentyfour(tester);
      }
}
