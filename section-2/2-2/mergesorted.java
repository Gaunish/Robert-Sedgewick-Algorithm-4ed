import java.util.Arrays;
import template.sorttemplate;

public class mergesorted
{
      public static void mergetwo(Comparable[] a, Comparable[] b)
      {
            int len_a = a.length;
            int len_b = b.length;
            int len = len_a + len_b;
            Comparable[] c = new Comparable[len];
            Comparable[] d = new Comparable[len];

            int index = 0;
            for(int i = 0; i < len_a; i++)
            {
                  c[index] = a[i];
                  index++;
            }
            for(int j = 0; j < len_b; j++)
            {
                  c[index] = b[j];
                  index++;
            }

            int lo = 0;
            int mid = len_a;

            for(int k = 0; k < len; k++)
            {
                  if(lo >= len_a ) { d[k] = c[mid++];}
                  else if(mid >= (len - 1)) { d[k] = c[lo++];}
                  else  if(sorttemplate.less(c[lo], c[mid]))
                    {
                        d[k] = c[lo++];
                    }
                    else
                    {
                        d[k] = c[mid++];
                    }
            }

            sorttemplate.show(d);
    }

    public static void main(String[] args)
    {
          Integer[] a = {1 , 3, 6, 7, 8, 34, 56, 87 , 100};
          Integer[] b = {2, 2, 3, 6 ,10, 32, 43, 65, 102, 321};
          mergetwo(a, b);
    }
}
