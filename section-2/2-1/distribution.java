import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdRandom;
import stop.stopwatch;
import java.awt.*;
import java.util.concurrent.TimeUnit;
import shell.shellsort;

public class distribution
{
      public static int[] arr = new int[1];
      public static int size = 0;
      public static int[] freq = new int[1];

      public static void distri(int siz)
      {

            StdDraw.setCanvasSize(1024, 2048);
            StdDraw.setPenRadius(0.005);
            Font font = new Font("TimesRoman", Font.PLAIN, 10);
            StdDraw.setXscale(-10,10);
            StdDraw.setFont(font);
            Integer[] buff;
            int size = siz;
            StdDraw.line(-1, 0, 2, 0);
            StdDraw.setYscale(-40,40);
            StdDraw.line(0, 10, 0, 100);
            for(double p = -20; p < 20; p += 5)
            {
                  StdDraw.setPenColor(StdDraw.MAGENTA);
                  StdDraw.line(p, 5, p, -5);
                  String buf = String.valueOf(p);
                  StdDraw.text(p, -10, buf);
            }

            for(double j = -5; j < 5; j += 0.01)
            {
                  StdDraw.setPenColor(StdDraw.MAGENTA);
                  StdDraw.line(0.5, j, -0.5, j);
                  String buf1 = String.valueOf(j);
                  StdDraw.text(-1, j, buf1);
            }

            for(int i = 0; true; i++)
            {
                  buff = new Integer[size];
                  for(int j = 0; j < size; j++)
                  {
                        buff[j] = StdRandom.uniform(-size, size);
                  }
                  stopwatch one = new stopwatch();
                  shellsort.shellsort(buff);
                  double timings = one.elapsedTime();
                  plotdistri(timings);
            }
      }

      public static void resize(int max, int[] a)
      {
            int[] tester = new int[max];
            for(int j = 0; j < a.length; j++)
            {
                tester[j] = a[j];
            }
            a = tester;
      }

      public static void plotdistri(double timings)
      {

      }

      public static void main(String[] args)
      {
            int size = Integer.parseInt(args[0]);
            distri(size);
      }
}
