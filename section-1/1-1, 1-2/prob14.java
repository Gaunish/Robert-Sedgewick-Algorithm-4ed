import java.util.Scanner;

class prob14
{
    public static void main(String[] args)
    {
        int a = 10000;
        ran(a);
    }

    public static void ran(int n)
    {
      int i = 0, no = 2;
      while(n - no > 1)
      {
          no *= 2;
          i++;
      }
      System.out.print("Number is : " + (i - 1));
      Stddraw.filledsquare(1000, 1000, 1000);
    }
}
