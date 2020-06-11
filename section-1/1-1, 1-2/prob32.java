import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.StdOut;

class prob32
{
    public static void main(String[] args)
    {
        // taking input as args
        double l = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        int n = Integer.parseInt(args[2]);
        double[] number = {10.3 , 1.5 ,5.6 ,3.6, 2.4 ,9.6, 8.3 , 7.3 , 6.5, 10.3 , 1.5 ,5.6 ,3.6, 7.4 ,8.6, 4.3 , 13.3 , 12.5};

        draw_histogram(l,r,n, number);
    }

    public static void draw_histogram(double l, double r, int N, double[] number)
    {
        //computing no of interval
        double no_of_intervals = (r - l) / N;
        int[] num_posn = new int[N];
        num_posn = histogram_value(l, r, N, no_of_intervals, number);

        double minX = l - 2.0;
        double minY = -2.0;
        double maxX = r + 2.0;
        double max = StdStats.max(num_posn);
        double maxY = max + 2.0;

        double middleX = minX + (maxX - minX) / 2;
        double middleY = minY + (maxY - minY) / 2;

        // Labels
        StdDraw.text(middleX, maxY - 0.5, "Numbers in intervals");
        StdDraw.text(minX + 0.25, middleY, "Numbers", 90);
        StdDraw.text(middleX, -1.2, "Intervals");


        StdDraw.setCanvasSize(1024,512);
        StdDraw.setXscale(minX, maxX);
        StdDraw.setYscale(minY, maxY);


        for(int i = 0; i < N; i++)
        {
            double minValue = l + (no_of_intervals * i);
            String intervalDescription = String.format("[%.2f]", minValue);
            StdDraw.text(l + (i + 0.5) * no_of_intervals, -0.25, intervalDescription);
        }

        for(int y = 0; y < maxY; y++) {
            StdDraw.text(minX + 0.7, y, String.valueOf(y));
        }

        StdDraw.setPenRadius();
        double rw,rh,x,y;
        for(int k = 0; k < N; k++)
        {
            rw = no_of_intervals / 3.0;
            rh = num_posn[k] * 0.5;
            x = l + (k + 0.5) * no_of_intervals;
            y = num_posn[k] * 0.5;

            StdDraw.rectangle(x, y, rw, rh);

        }
    }

    public static int[] histogram_value(double l, double r, int N, double no, double[] number)
    {
        //intialising num_posn to 0
        int[] num_posn = new int[N];
        for(int i = 0; i < N; i++)
        {
            num_posn[i] = 0;
        }

        double quotient;
        int pos;

        int numbers = number.length;

        for(int j = 0; j < numbers; j++)
        {
            quotient = number[j];
            for(int k = 0; k < N; k++)
            {
                if(quotient > (k * no) && quotient < (k + 1) * no)
                {
                    num_posn[k]++;
                }
            }
        }

        return num_posn;
    }
}
