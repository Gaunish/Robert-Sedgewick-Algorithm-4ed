import java.util.Arrays;

class bitonic
{
    private static int Not_found = -99999;
    public static int find_no(int[] arr, int key)
    {
        int lo = 0;
        int hi = arr.length - 1;

        while(lo <= hi)
        {

            int mid = lo + (hi - lo) / 2;

            if(arr[mid] == key)
            {
                return mid;
            }
            else if(arr[mid] < key)
            {
                if(arr[mid + 1] > arr[mid])
                {
                    lo = mid + 1;
                }
                else
                {
                    hi = mid - 1;
                }
            }
            else if(arr[mid] > key)
            {
                int left_side = bisearch(lo, mid - 1, arr, key, false);
                if(left_side != Not_found)
                {
                    return left_side;
                }

                int right_side = bisearch(mid + 1, hi, arr, key, true);
                if(right_side != Not_found)
                {
                    return right_side;
                }
            }
        }
        return Not_found;
    }

    private static int bisearch(int lo, int hi, int[] arr, int key, boolean side)
    {
          while(lo <= hi)
          {
              int mid = lo + (hi - lo) / 2;
              System.out.println("lo hi mid : " + lo + " " + hi + " " + mid);
              if(arr[mid] == key)
              {
                  return mid;
              }
              else if(arr[mid] > key)
              {
                  if(side == false)
                  {
                      hi = mid - 1;
                  }
                  else
                  {
                      lo = mid + 1;
                  }
              }
              else if(arr[mid] < key)
              {
                  if(side == true)
                  {
                      hi = mid - 1;
                  }
                  else
                  {
                      lo = mid + 1;
                  }
              }
          }
          return Not_found;
    }

    //test client
    public static void main(String[] args)
    {
        int[] test_Arr = {1, 2, 3, 4, 5, 6, 9, 4, 3, 0};
        int key = 0;
        int pos = find_no(test_Arr, key);
        System.out.println("output : " + pos);
    }
}
