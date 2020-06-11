import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;

class prob36
{
    public static void main(String[] args)
    {
         int m = Integer.parseInt(args[0]);
         int n = Integer.parseInt(args[1]);

         shuffle_test(m, n);
    }

    public static void shuffle(double[] a, double[][] b)
    {
         int N = a.length;
         for (int i = 0; i < N; i++)
         {
              // Exchange a[i] with random element in a[i..N-1]
             int r = StdRandom.uniform(N-1);
             double temp = a[i];
             a[i] = a[r];
             a[r] = temp;
         }
         double k = 0.0;
         int i = 0;
         for (int j = 0; j < N; j++)
         {
             k = a[j];
             i = (int)k;
             b[i][j] += 1.0;
         }
    }

    public static void shuffle_test(int m, int n)
    {
        double[] a = new double[m];
        double[][] output = new double[m][m];

        for(int i = 0;i < m; i++)
        {
            for(int j = 0;j < m; j++)
            {
                output[i][j] = 0.0;
            }
        }



        for(int i = 0; i < n; i++)
        {
            for(int j = 0;j < m; j++)
            {
                a[j] = j;
            }
            shuffle(a, output);
        }

        for(int x = 0; x < m; x++)
        {
            for(int y = 0; y < m; y++)
            {
                StdOut.print(output[x][y] + " ");
            }
            StdOut.println();
        }
    }
}
