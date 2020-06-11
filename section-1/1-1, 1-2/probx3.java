import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.Interval1D;



class probx3
{
    public static void main(String[] args)
    {
          int N = Integer.parseInt(args[0]);
          double min = Double.parseDouble(args[1]);
          double max = Double.parseDouble(args[2]);

          if(min < -1.0 || min > 1.0 || max < -1.0 || max > 1.0)
          {
              StdOut.println("invalid args");
          }

          draw_2dint(N, min, max);
    }

    public static void draw_2dint(int n, double min, double max)
    {
          StdDraw.setCanvasSize(1024, 1024);
          StdDraw.setScale(-2.0, 2.0);
          StdDraw.square(0.0, 0.0, 1.0);
          StdDraw.setPenRadius(0.015);

          Interval2D[] intervals = new Interval2D[n];
          double xlo,xhi,ylo,yhi = 0.0;

          for(int i = 0; i < n; i++)
          {
                xlo = StdRandom.uniform(min, max);
                xhi = StdRandom.uniform(xlo, max);
                ylo = StdRandom.uniform(min, max);
                yhi = StdRandom.uniform(ylo, max);
                Interval1D x = new Interval1D(xlo, xhi);
                Interval1D y = new Interval1D(ylo, yhi);
                Interval2D interval = new Interval2D(x, y);
                intervals[i] = interval;
                interval.draw();
          }

          interval_checker(intervals, n);

    }

    public static void interval_checker(Interval2D[] x, int n)
    {
          for(int i = 0; i < n; i++)
          {
               for(int j = (i + 1); j < n; j++)
               {
                    if(x[i].intersects(x[j]))
                    {
                        StdOut.println("intersects : (" + x[i] + ", " + x[j] + ") ");
                    }

               }
          }
    }
}
