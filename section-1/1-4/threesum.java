package threesumpack;

import binary.binarysearch;
import java.util.Arrays;

public class threesum
{
      public static int threesumnaive(int[] a)
      {
            int cnt = 0;
            int N = a.length;
            for (int i = 0; i < N; i++)
            {
                    for (int j = i + 1; j < N; j++)
                    {
                        for (int k = j + 1; k < N; k++)
                        {
                              if (i < j && j < k)
                              {
                                  if (a[i] + a[j] + a[k] == 0)
                                  {
                                      cnt++;
                                  }
                              }
                        }
                    }
            }
            return cnt;
      }

      public static int threesumfast(int[] a)
      {
            int cnt = 0;
            int n = a.length;
            for(int i = 0; i < n; i++)
            {
                  for(int j = i + 1; j < n; j++)
                  {
                        if(binarysearch.rank(a, - a[i] - a[j]) > j)
                        {
                              cnt++;
                        }
                  }
            }
            return cnt;
      }

      public static void main(String[] args)
      {
            int[] arr = {-10, -9, -8, -3, -1, 0 ,1, 2, 4, 6, 8, 10};
            int cnt = threesumnaive(arr);
            System.out.println("cnt : " + cnt);
      }
}
