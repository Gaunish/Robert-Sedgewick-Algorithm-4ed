import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import stop.stopwatch;
import java.awt.*;
import java.util.concurrent.TimeUnit;
import shell.shellsort;

public class plotalgo
{
      private static int x_hi = 0;
      private static double y_hi = 0;
      private static int[] x_points = new int[20];
      private static double[] y_points = new double[20];
      private static int curr = 0;

      public static void drawalgo()
      {
            StdDraw.setCanvasSize(1024, 2048);
            StdDraw.setPenRadius(0.005);
            Font font = new Font("TimesRoman", Font.PLAIN, 10);
            StdDraw.setFont(font);
            Integer[] arr;
            x_points[0] = 0;
            y_points[0] = 0.0;
            curr++;


            for(int i = 1000; true; i*= 2)
            {
                  arr = new Integer[i];
                  for(int j = 0; j < i; j++)
                  {
                        arr[j] = StdRandom.uniform(-100, 100);
                  }

                  stopwatch one = new stopwatch();
                  shellsort.shellsort(arr);
                  double timing = one.elapsedTime();

                  curr++;
                  x_points[curr] = i;
                  y_points[curr] = timing * 1000.0;
                  System.out.println(i + " " + timing);
                  drawcanvas(i, 1000.0 * timing);
            }
      }

      public static void drawcanvas(int i, double timing)
      {
            if(i > x_hi || timing > y_hi)
            {
                  StdDraw.clear();
                  double x_lo = -0.2 * i;
                  x_hi = 10 * i;
                  double y_lo = -100.0 * timing;
                  y_hi = 200.0 * timing;
                  if(timing == 0.0)
                  {
                      y_lo = -100.0 * (timing + 1);
                      y_hi = 200.0 * (timing + 1);
                  }
                  StdDraw.setXscale(x_lo, x_hi);
                  StdDraw.setYscale(y_lo, y_hi);

                  StdDraw.setPenColor(StdDraw.BLACK);
                  StdDraw.line(x_lo, 0, x_hi, 0);
                  StdDraw.line(0, y_lo, 0, y_hi);
                  double diff_x = (x_hi - x_lo) / 10;
                  double diff_y = (y_hi - y_lo) / 10;

                  for(double p = x_lo; p < x_hi; p += diff_x)
                  {
                        StdDraw.setPenColor(StdDraw.MAGENTA);
                        StdDraw.line(p, 5, p, -5);
                        String buf = String.valueOf(p);
                        StdDraw.text(p, -10, buf);
                  }

                  for(double j = y_lo; j < y_hi; j += diff_y)
                  {
                        StdDraw.setPenColor(StdDraw.MAGENTA);
                        StdDraw.line(5, j, -5, j);
                        String buf1 = String.valueOf(j);
                        StdDraw.text(-10, j, buf1);
                  }

                  StdDraw.setPenColor(StdDraw.BLUE);
                  for(int k = 1; k <= curr; k++)
                  {
                        try
                        {
                            Thread.sleep(100);
                        }
                        catch (InterruptedException ie)
                        {
                            Thread.currentThread().interrupt();
                        }
                        StdDraw.point(x_points[k], y_points[k]);
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.line(x_points[k - 1], y_points[k - 1], x_points[k], y_points[k]);
                        try
                        {
                            Thread.sleep(100);
                        }
                        catch (InterruptedException ie)
                        {
                            Thread.currentThread().interrupt();
                        }
                  }
            }
            else
            {
                  StdDraw.setPenColor(StdDraw.RED);
                  try
                  {
                      Thread.sleep(100);
                  }
                  catch (InterruptedException ie)
                  {
                      Thread.currentThread().interrupt();
                  }
                  StdDraw.point(i, timing);
                  StdDraw.line(x_points[curr - 1], y_points[curr - 1], i, timing);
                  try
                  {
                      Thread.sleep(100);
                  }
                  catch (InterruptedException ie)
                  {
                      Thread.currentThread().interrupt();
                  }
            }
      }

      public static void main(String[] args)
      {
            drawalgo();
      }

}
