import java.util.Arrays;
import java.lang.Math;

class twenty5
{
      public static int findinrootn(int[] arr)
      {
            int lo = 0;
            int hi = arr.length - 1;
            int lala = findinrootn(arr ,lo ,hi, 0);
            return lala;
      }

      public static int findinrootn(int[] arr, int lo, int hi, int search)
      {
            if(lo <= hi)
            {
                  int root = (int) Math.sqrt(arr.length);
                  int elem = root * search;

                  if(elem >= arr.length)
                  {
                        elem = arr.length - 1;
                  }

                  if(arr[elem] < 1)
                  {
                        return findinrootn(arr, elem + 1, hi, ++search);
                  }
                  else
                  {
                        int prev = (int)(elem - root);
                        for(int i = prev; i < hi; i++)
                        {
                              if(arr[i] == 1)
                              {
                                    return i;
                              }
                        }
                  }
            }
            return -1;
      }

      public static int findinrootf(int[] arr)
      {
            int lo = 0;
            int hi = arr.length - 1;
            int tada = findinrootf(arr, lo, hi, 0, 0);
            return tada;
      }

      public static int findinrootf(int[] arr, int lo, int hi, int level, int elem)
      {
             if(lo <= hi)
             {
                    elem = elem + level;
                    if(elem >= arr.length)
                    {
                          elem = arr.length - 1;
                    }

                    if(arr[elem] < 1)
                    {
                          return findinrootf(arr, elem + 1, hi, ++level, elem);
                    }
                    else
                    {
                          int prev = elem - level;
                          for(int i = prev; i <= elem; i++)
                          {
                                if(arr[i] == 1)
                                {
                                      return i;
                                }
                          }
                    }
             }
             return -1;
      }

      public static void main(String[] args)
      {
            int[] arr = {0, 0,0 ,0 , 0, 1, 1,1,1};
            int out = findinrootf(arr);
            System.out.println("out : " + out);
      }

}
