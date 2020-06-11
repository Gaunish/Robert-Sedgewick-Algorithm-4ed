import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

class test_file
{
      public static void main(String[] args)
      {
            In in = new In(args[0]);
            int[] values = in.readAllInts();
            for(int i = 0; i < values.length; i++)
            {
                  System.out.println(values[i]);
            }
      }
}
