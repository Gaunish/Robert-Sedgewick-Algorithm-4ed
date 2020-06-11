import edu.princeton.cs.algs4.StdRandom;
import stop.stopwatch;
import insertion.insertionsort;
import selection.selectionsort;
import shell.shellsort;
import stop.stopwatch;
import template.sorttemplate;


class doublingsort
{
      public static void doublingratio(int n)
      {
            int max = 100000;
            Integer[] arr = new Integer[n];
            Integer[] arr1 = new Integer[n];
            Integer[] arr2 = new Integer[n];
            for(int i = 0; i < n; i++)
            {
                  Integer xo = StdRandom.uniform(-max, max);
                  arr[i] = xo;
                  arr1[i] = xo;
                  arr2[i] = xo;
            }

            stopwatch one = new stopwatch();
            insertionsort.insertionsort(arr);
            double ah = one.elapsedTime();

            stopwatch two = new stopwatch();
            selectionsort.selectionsort(arr1);
            double aha = two.elapsedTime();

            stopwatch three = new stopwatch();
            shellsort.shellsort(arr2);
            double outtime = three.elapsedTime();

            System.out.println(ah + " " + aha + " " + outtime);

      }

      public static void main(String[] args)
      {
              for(int i = 1000; true; i *= 2)
              {
                    doublingratio(i);
              }

      }
}
