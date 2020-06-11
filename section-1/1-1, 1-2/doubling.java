import edu.princeton.cs.algs4.*;
import java.util.*;
import java.lang.Math;

class doubling
{
    private static ArrayList<Point2D> N_values;
    private static ArrayList<Point2D> logN_values;
    private static int Xscale;
    private static int Yscale;

    public static double timeTrial(int N)
    { // Time ThreeSum.count() for N random 6-digit ints.
      int MAX = 1000000;
      int[] a = new int[N];

      for (int i = 0; i < N; i++)
      {
        a[i] = StdRandom.uniform(-MAX, MAX);
      }
      Stopwatch timer = new Stopwatch();
      int cnt = ThreeSum.count(a);
      return timer.elapsedTime();

    }

    public static void main(String[] args)
    { // Print table of running times.
      Yscale = 15;
      Xscale = 300;
      N_values = new ArrayList<>(5);
      logN_values = new ArrayList<>(5);
      intialise_canvas(Xscale, Yscale);
      drawaxes();

      for (int N = 250; true; N += N)
      { // Print time for problem size N.
          double time = timeTrial(N);
          conditional_rescale(N, time);
          double double_n = (double)N;
          drawcurve(double_n, time, N_values, false, false);
          drawcurve(double_n, Math.log(time), logN_values, false, true);

          StdOut.printf("%7d %5.1f\n", N, time);
      }

    }

    private static void intialise_canvas(int x, int y)
    {
        StdDraw.setCanvasSize(800, 800);
        StdDraw.setXscale(-20, x + 20);
        StdDraw.setYscale(-20, y);
        StdDraw.setPenRadius(0.001);
    }

    private static void conditional_rescale(int n, double time)
    {
          if(Xscale <= n || Yscale <= time)
          {
              if(Xscale <= n)
              {
                  if(2 * Xscale <= n)
                  {
                      Xscale *= 2;
                  }
                  else
                  {
                      Xscale *= 1.5;
                  }
              }
              if(Yscale <= n)
              {
                    Yscale *= 1.5;
              }
              rescale(n, time);
          }
    }

    private static void rescale(int n, double time)
    {
        StdDraw.clear();
        StdDraw.setXscale(-20, Xscale + 20);
        StdDraw.setYscale(-20, Yscale);
        drawaxes();

        for(int i = 0; i < N_values.size(); i++)
        {
            drawcurve(N_values.get(i).x(), N_values.get(i).y(), N_values, true, false);
            drawcurve(logN_values.get(i).x(), logN_values.get(i).y(), logN_values, true, true);
        }

    }

    private static void drawaxes()
    {
        StdDraw.setPenColor(0, 0, 0);
        StdDraw.line(0, 0, Xscale, 0);
        StdDraw.line(0, 0, 0, Yscale);
        for(double i = (Xscale / 8); i <= Xscale; i += i)
        {
            double roundOff = (double) Math.round(i * 100) / 100;
            String x = Double.toString(roundOff);
            StdDraw.line(0, -0.01, 0, 0.01);
            StdDraw.text(i, -1, x);
        }

        for(double j = (Yscale / 4); j <= Yscale; j += j)
        {
            double round = (double) Math.round(Math.log(j) * 100) / 100;

            String z = Double.toString(round);
            StdDraw.line(-0.01, 0, 0.01, 0);

            StdDraw.text(-70, j, z);
        }
    }

    private static void drawcurve(double n, double time, ArrayList<Point2D> points, boolean rescale, boolean logorstd)
    {
        if (n == Double.NEGATIVE_INFINITY) {
            n = 0.0;
        }

        if(logorstd == false)
        {
            StdDraw.setPenColor(0, 0, 255);
        }
        else
        {
            StdDraw.setPenColor(255, 0, 0);
        }
        Point2D sample = new Point2D(n, time);
        if(rescale == false)
        {
            points.add(sample);
        }

        if(points.size() > 1)
        {
            Point2D prev_point = points.get(points.size() - 2);
            StdDraw.line(prev_point.x(), prev_point.y(), n, time);
        }

        StdDraw.point(n, time);

    }
}
