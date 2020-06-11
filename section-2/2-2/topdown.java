package top;
import java.util.Arrays;
import template.sorttemplate;
import selection.selectionsort;
import merge.merge;
import insertion.insertionsort;

public class topdown
{
      public static int compar = 0;
      public static Comparable[] arr;
      public static void topdownmergesort(Comparable[] a)
      {
            arr = new Comparable[a.length];
            preprocess(a);
            sort(a , arr, 0, a.length - 1);
      }

      public static void preprocess(Comparable[] a)
      {
            int mish = 4;
            for(int i = 0; i < a.length - mish; i += mish + 1)
            {
                  selectionsort.selectionsort(a, i, i + mish);
            }
      }

      public static void sort(Comparable[] a, Comparable[] arr, int lo, int hi)
      {
            if(lo >= hi) { return; }
            int mid = lo + (hi - lo) / 2;
            if((hi - lo) > 8)
            {
                sort(a, arr, lo, mid);
                sort(a, arr, mid + 1, hi);
            }
            else
            {
                insertionsort.insertionsort(a, lo, hi);
            }
            if(sorttemplate.less(a[mid], a[mid + 1]))
            {
                return;
            }
            else
            {
                merge.inmerge(a, arr, lo, mid, hi);
            }
      }

      public static void main(String[] args)
      {
            Integer[] a = {5, 2, 4 ,5 ,6, 7 ,13, 43 ,6 ,13, 17 ,11, 20 ,12, 0, 5, 2, 4 ,5 ,6, 7 ,13, 43 ,6 ,13, 17 ,11, 20 ,12, 0, 10, 11};
            topdownmergesort(a);
            sorttemplate.show(a);
      }
}
