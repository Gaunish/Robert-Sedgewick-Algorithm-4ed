import insertion.insertionsort;
import selection.selectionsort;
import shell.shellsort;
import stop.stopwatch;
import template.sorttemplate;
import edu.princeton.cs.algs4.StdRandom;

public class sortcompare
{
      public static double time(int option, Integer[] a)
      {
            double outtime;
            if(option == 0)
            {
                stopwatch one = new stopwatch();
                insertionsort.insertionsort(a);
                outtime = one.elapsedTime();
            }
            else if(option == 1)
            {
                stopwatch two = new stopwatch();
                selectionsort.selectionsort(a);
                outtime = two.elapsedTime();
            }
            else
            {
                stopwatch three = new stopwatch();
                shellsort.shellsort(a);
                outtime = three.elapsedTime();
            }
            return outtime;
      }

      public static void timeRandomInput(int option, int n, int t)
      {
            double total = 0.0;
            Integer[] xo = new Integer[n];
            for(int i = 0; i < t; i++)
            {
                  for(int j = 0; j < n; j++)
                  {
                        if(StdRandom.bernoulli(0.5))
                        {
                            xo[j] = 1;
                        }
                        else
                        {
                            xo[j] = 0;
                        }
                  }
                  total +=  time(option, xo);
            }
            System.out.println("time, alg, ratio : " + total + " " + option + " " + total / t);

      }

      public static void main(String[] args)
      {
            for(int i = 128; true; i *= 2)
            {
                  timeRandomInput(0, i, 50);
                  timeRandomInput(1, i, 50);
            }
      }


}
