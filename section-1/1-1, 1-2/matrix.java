public class matrix
{
    public static void main(String[] args)
    {
        //taking test values
        double[] x = {1,2,3};
        double[] y = {1,2,3};
        double[][] a = {{1,2,3}, {1,2,3}, {1,2,3}};
        double[][] b = {{1,2,3}, {1,2,3}, {1,2,3}};

        //testing methods
        double[][] z = transpose(a);
        int row = z.length;
        int col = z[0].length;

        for(int i = 0; i < col; i++)
        {
            for(int j = 0; j < row; j++)
            {
              System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }




    }

    public static double dot(double[] x, double[] y)
    {
        // Assuming the length of x, y is equal
        int n = x.length;
        double result = 0;
        for(int i = 0; i < n; i++)
        {
            result += x[i] * y[i];
        }

        return result;

    }

    public static double[][] mult(double[][] a, double[][] b)
    {
        int row = a.length;
        int col = a[0].length;
        double[][] c = new double[row][col];


        for(int i = 0; i < col; i++)
        {
            for(int k = 0; k < row; k++)
            {
                c[i][k] = 0.0;
                for(int j = 0; j < row; j++)
                {
                    c[i][k] += a[i][j] * b[j][k];
                }
            }
        }
        return c;
    }

    public static double[][] transpose(double[][] a)
    {
        int row = a.length;
        int col = a[0].length;
        double[][] b = new double[row][col];
        for(int i = 0; i < col; i++)
        {
            for(int j = 0; j < row; j++)
            {
                b[j][i] = a[i][j];
            }
        }
        return b;
    }

    public static double[] mult(double[][] a, double[] b)
    {
        int row = a.length;
        int col = a[0].length;
        double[] c = new double[col];
        for(int i = 0; i < col; i++)
        {
            c[i] = 0.0;
            for(int j = 0; j < row; j++)
            {
                c[i] += a[i][j] * b[j];
            }
        }

        return c;
    }

    public static double[] mult(double[] a, double[][] b)
    {
        int row = b.length;
        int col = b[0].length;
        double[] c = new double[col];
        for(int i = 0; i < col; i++)
        {
            c[i] = 0.0;
            for(int j = 0; j < row; j++)
            {
                c[i] += a[j] * b[i][j];
            }
        }

        return c;
    }

}
