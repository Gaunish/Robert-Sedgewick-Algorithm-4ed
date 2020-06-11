import template.sorttemplate;
import insertion.insertionsort;
import stop.stopwatch;
import edu.princeton.cs.algs4.StdRandom;

public class autoboxing
{
      public static void insertionsort1(int[] a)
      {
            for(int i = 0; i < a.length; i++)
            {
                  int min = a[i];
                  for(int k = i; k > 0 && min < a[k - 1]; k--)
                  {
                            a[k] = a[k - 1];
                  }
                  a[i] = min;
            }
      }

      public static void autoocompare(int[] x, Comparable[] y)
      {
            stopwatch one = new stopwatch();
            insertionsort.insertionsort(y);
            double a = one.elapsedTime();

            stopwatch two = new stopwatch();
            insertionsort1(x);
            double b = two.elapsedTime();

            System.out.println(a + " " + b);
      }

      public static void main(String[] args)
      {
            int[] tester;
            Integer[] yo;
            for(int i = 100; true; i *= 5)
            {
                  yo = new Integer[i];
                  tester = new int[i];
                  for(int j = 0; j < i; j++)
                  {
                        int ax = StdRandom.uniform(0, i);
                        yo[j] = ax;
                        tester[j] = ax;
                  }
                  autoocompare(tester, yo);

            }

      }


}
