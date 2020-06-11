package chap2;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import java.lang.*;


public class VisualCounter
{
    private int n;
    private int max;

    private int counter;
    private int no_of_operations;

    public VisualCounter(int n, int max)
    {
        this.n = n;
        this.max = Math.abs(max);
        StdDraw.setCanvasSize(1024, 1024);
        StdDraw.setYscale((-max - 3), (max + 3));
        StdDraw.setXscale(0, (n + 1));
    }

    public void increment()
    {
         if(counter > (max - 1))
         {
              StdOut.println("Max limit of counter reached");
         }
         else
         {
              counter++;
         }

         if(no_of_operations > (max - 1))
         {
              StdOut.println("Max limit of no. of operations reached");
         }
         else
         {
              no_of_operations++;
         }
         StdDraw.line(no_of_operations, 0.0, no_of_operations, counter);
    }

    public void decrement()
    {
         if(Math.abs(counter) > (max - 1))
         {
              StdOut.println("Min limit of counter reached");
         }
         else
         {
              counter--;
         }

         if(no_of_operations > (max - 1))
         {
              StdOut.println("Max limit of no. of operations reached");
         }
         else
         {
              no_of_operations++;
         }
         StdDraw.line(no_of_operations, 0, no_of_operations, counter);
    }

}
