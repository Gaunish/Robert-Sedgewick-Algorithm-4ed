package merge;
import java.util.Arrays;
import template.sorttemplate;

public class merge
{
      public static void inmerge(Comparable[] a, Comparable[] arr, int lo, int mid, int hi)
      {
            int aux = 0;
            for(int p = 0; p <= mid; p++)
            {
                  arr[aux] = a[p];
                  aux++;
            }

            for(int po = hi; po > mid; po--)
            {
                  arr[aux] = a[po];
                  aux++;
            }

            int indexleft = lo;
            int indexright = hi;
            int arrindex = lo;

            while(arrindex <= hi)
            {
                  if(sorttemplate.less(arr[indexleft], arr[indexright]))
                  {
                      a[arrindex] = arr[indexleft++];
                  }
                  else
                  {
                      a[arrindex] = arr[indexright--];
                  }
                  arrindex++;
            }

      }


      public static void main(String[] args)
      {
            Integer[] a = {5, 2, 4 ,5 ,6, 7 ,13, 43 ,6 ,13, 17 ,11, 20 ,12, 0, 5, 2, 4 ,5 ,6, 7 ,13, 43 ,6 ,13, 17 ,11, 20 ,12, 0, 10, 11};
            Integer[] arr = new Integer[a.length];
            int mid = a.length / 2;
            inmerge(a, arr, 0, mid - 1, a.length - 1);
      }
}
