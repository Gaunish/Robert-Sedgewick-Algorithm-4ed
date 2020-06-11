import edu.princeton.cs.algs4.StdRandom;
import java.util.Arrays;
import binary.binarysearch;

class birthday
{

      public static void yo()
      {
            int[] arr = new int[100000];
            int i = 0;
            int n = 10;
            int x = 0;
            do
            {
                  x = StdRandom.uniform(n);
                  if(i == arr.length)
                  {
                        resize(arr);
                  }
                  i++;
            } while (duplicate(arr, x));
            System.out.println(i);
      }

      private static void resize(int[] arr)
      {
            int y = arr.length * 2;
            int[] arra = new int[y];
            for(int i = 0; i < arr.length; i++)
            {
                  arra[i] = arr[i];
            }
            arr = arra;
      }

      private static boolean duplicate(int[]arr, int x)
      {
            if(binarysearch.rank(arr, x) > 0)
            {
                return false;
            }
            else
            {
                return true;
            }
      }

      public static void main(String[] args)
      {
            yo();
      }
}
