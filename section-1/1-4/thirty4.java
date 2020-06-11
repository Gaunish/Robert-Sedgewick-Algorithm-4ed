import java.util.Arrays;
import java.lang.Math;

class thirty4
{
      public static int checker(int n, int pos)
      {
            int mid = n/2;
            int buff = guesser(1,n,pos,mid);
            return buff;
      }

      public static int guesser(int lo, int hi, int pos,int mid)
      {
            if(lo <= hi)
            {
                    if(mid == pos)
                    {
                        return mid;
                    }
                    int new_mid = mid + (hi - mid) / 2;
                    System.out.println("mid " + new_mid + " " + lo + " " + hi + " " + mid);

                    if(new_mid == pos)
                    {
                          return new_mid;
                    }
                    if(isitHotter(new_mid, mid, pos) == true)
                    {
                          return guesser(mid, hi, pos, new_mid);
                    }
                    else
                    {
                          int new_id = lo + (mid - lo) / 2;
                          if(new_id == pos)
                          {
                                return new_mid;
                          }
                          if(isitHotter(new_id, mid, pos) == true)
                          {

                                return guesser(lo, mid, pos, new_id);
                          }
                          else
                          {
                                return guesser(mid, hi, pos, new_id);
                          }
                    }
            }
            System.out.println("mid "  + " " + lo + " " + hi + " " + mid);
            return -1;
      }

      public static boolean isitHotter(int curr, int prev, int pos)
      {
              if(Math.abs(curr - pos) < Math.abs(prev - pos))
              {
                    return true;
              }
              else
              {
                    return false;
              }
      }

      public static void main(String[] args)
      {
            int out = checker(40, 1);
            System.out.println(" out :- " + out);
      }
}
