import java.util.Arrays;
import java.lang.Math;

class twenty4
{
      public static int determineinlogf(int[] arr)
      {
            int level = 0;
            int lo = 0;
            int hi = arr.length - 1;
            int out = determineinlogf(arr, lo, hi, level);
            return out;
      }

      public static int determineinlogf(int[] arr, int lo, int hi, int level)
      {

            if(lo <= hi)
            {
                int key;

                if(level == 0)
                {
                      key = 1;
                }
                else
                {
                      key = 2 * level;
                }

                if(arr[key] < 1)
                {
                      return determineinlogf(arr, key + 1, hi, ++level);
                }
                else
                {
                      int indexsearch = key / 2;
                      int pos = binsearch(arr, indexsearch, key - 1);

                      if(pos == -1)
                      {
                            return key;
                      }
                      else
                      {
                            return pos;
                      }
                }
            }
            return -1;
      }

      public static int binsearch(int[] arr, int lo, int hi)
      {
            if(lo <= hi)
            {
                  int middle = lo + (hi - lo) / 2;
                  if(arr[middle] < 1)
                  {
                        return binsearch(arr, middle + 1, hi);
                  }
                  else
                  {
                        int posn = binsearch(arr, lo, middle - 1);

                        if(posn == -1)
                        {
                              return middle;
                        }
                        else
                        {
                              return posn;
                        }
                  }
            }
            return -1;
      }

      public static void main(String[] args)
      {
            int[] arr = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1};
            int[] arr1 = {1, 1, 1};
            int out = determineinlogf(arr);
            int out1 = determineinlogf(arr1);
            System.out.println("out : " + out + " " + out1);
      }
}
