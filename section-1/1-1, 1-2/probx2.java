import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Interval1D;
import java.lang.*;

class probx2
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        draw_interval(N);
    }

    public static void draw_interval(int n)
    {
        StdDraw.setCanvasSize(1024, 1024);
        StdDraw.setScale(-100000.0, 100000.0);
        StdDraw.setPenRadius(0.01);

        double lo = 0.0;
        double hi = 0.0;
        Interval1D[] intervals = new Interval1D[n];

        for(int i = 0; i < n; i++)
        {
            lo = StdRandom.uniform(-100000.0, 100000.0);
            hi = StdRandom.uniform(lo, 100000.0);
            Interval1D interval = new Interval1D(lo, hi);
            intervals[i] = interval;
            StdDraw.line(lo,0,hi,0);
        }
        intersect_interval(intervals, n);
    }

    public static void intersect_interval(Interval1D[] x, int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = (i + 1); j < n; j++)
            {
                  if(x[i].intersects(x[j]))
                  {
                      StdOut.println("( " + x[i] + ", " + x[j] + ")");
                  }
            }
        }
    }
}
