import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Point2D;
import java.lang.*;

class probx1
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        draw_sq(N);
    }

    public static void draw_sq(int n)
    {
        StdDraw.setCanvasSize(1024, 1024);
        StdDraw.setScale(-4.0, 4.0);
        StdDraw.square(0.0, 0.0, 2.0);
        StdDraw.setPenRadius(0.015);
        double x = 0.0;
        double y = 0.0;
        Point2D[] points = new Point2D[n];
        for(int i = 0; i < n; i++)
        {
              x = StdRandom.uniform(-2.0, 2.0);
              y = StdRandom.uniform(-2.0, 2.0);
              Point2D p = new Point2D(x, y);
              points[i] = p;
              p.draw();
        }
        min_dist(points, n);
    }

    public static void min_dist(Point2D[] x, int n)
    {
        double min_dist = 0.0;
        double dist = 0.0;
        min_dist = x[0].distanceTo(x[1]);
        for(int i = 0; i < n; i++)
        {
              for(int j = (i + 1); j < n; j++)
              {
                  dist = x[i].distanceTo(x[j]);
                  if(dist < min_dist)
                  {
                      min_dist = dist;
                  }
              }
        }
        StdOut.println(min_dist);
    }
}
