import shell.shellsort;
import edu.princeton.cs.algs4.StdRandom;

public class twelve
{
      public static void main(String[] args)
      {
            Double[] tester;
            for(int i = 100; true; i *= 10)
            {
                  tester = new Double[i];
                  for(int j = 0; j < i; j++)
                  {
                        tester[j] = StdRandom.uniform(-10000.0, 10000.0);
                  }
                  int x = shellsort.shellsort(tester);
                  double yoo = x / i ;
                  System.out.println(yoo);
            }
      }
}
