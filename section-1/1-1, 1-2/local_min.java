class local_min
{
      private static int Not_found = -9999;

      public static int local_minima(int[] arr)
      {
          int lo = 0;
          int hi = arr.length - 1;

          if(hi == 0)
          {
              return arr[hi];
          }
          if(hi == 1)
          {
              if(arr[hi] > arr[hi - 1])
              {
                  return arr[hi - 1];
              }
              else
              {
                  return arr[hi];
              }
          }


          while(lo <= hi)
          {
              int mid = lo + (hi - lo) / 2;

              System.out.println("mid : " + mid + " " + lo + " " + hi);
              //Corner Cases
              if(mid == 0)
              {
                  if(arr[mid] < arr[mid + 1])
                  {
                      return arr[mid];
                  }
                  else
                  {
                      return Not_found;
                  }
              }


              if(mid == arr.length - 1)
              {
                  if(arr[mid - 1] > arr[mid])
                  {
                      return arr[mid];
                  }
                  else
                  {
                      return Not_found;
                  }
              }

              if(arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1])
              {
                  return arr[mid];
              }
              else if(arr[mid - 1] < arr[mid])
              {
                  hi = mid - 1;
              }
              else if(arr[mid + 1] < arr[mid])
              {
                  lo = mid + 1;
              }
          }

          return Not_found;
      }

      public static void main(String[] args)
      {
          int[] arr = {3, 2, 5, 6, 7, 16 ,13, 4, 23, 44 ,7, 9 ,11, 12};
          int out = local_minima(arr);
          System.out.println(out);
      }

}
