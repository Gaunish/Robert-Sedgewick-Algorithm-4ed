import edu.princeton.cs.algs4.StdRandom;
import stop.stopwatch;
import java.util.Arrays;
import threesumpack.threesum;

class doubling1
{
      public static void doublingratio(int n)
      {
            int max = 100000;
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
            {
                  arr[i] = StdRandom.uniform(-max, max);
            }

            stopwatch one = new stopwatch();
            int ont = threesum.threesumfast(arr);
            double ah = one.elapsedTime();

            stopwatch two = new stopwatch();
            int ond = threesum.threesumnaive(arr);
            double aha = two.elapsedTime();

            System.out.println("n : " + n + "   ah : " + ah + "    aha : " + aha);

      }

      public static void main(String[] args)
      {
              for(int i = 200; i < 40000; i += i)
              {
                    doublingratio(i);
              }

      }
}
