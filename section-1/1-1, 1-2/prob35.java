import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;

class prob35
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        if(n < 0)
        {
            StdOut.println("Invalid args");
        }

        double[] actual = new double[13];

        for(int i = 0; i < 12; i++)
        {
            actual[i] = 0.0;
        }

        for(int i = 0; i < n; i++)
        {
            int random = StdRandom.uniform(1, 7);
            int random1 = StdRandom.uniform(1, 7);
            int no = random + random1;
            actual[no] += 1;

        }

        for(int i = 2; i <= 12; i++)
        {
            actual[i] /= n;
            StdOut.println("Actual " + i + "'s : " + actual[i]);
        }
        dice_probab();
    }

    public static void dice_probab()
    {
        int SIDES = 6;
        double[] dist = new double[2*SIDES+1];

        for(int i = 1; i <= SIDES; i++)
        {
            for(int j = 1; j <= SIDES; j++)
            {
                dist[i+j] += 1.0;
            }
        }

        for(int k = 2; k <= 2 * SIDES; k++)
        {
            dist[k] /= 36.0;
        }

        for(int l = 2; l <= 12; l++)
        {
            StdOut.println("expected " + l + "'s : " +  dist[l]);
        }

    }
}
