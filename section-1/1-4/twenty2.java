import java.util.Arrays;

class twenty2
{

      public static int fibsearch(int[] arr, int key)
      {
            int aux = 0;
            int fibbef = 0;
            int fibk = 1;
            while(fibk < arr.length - 1)
            {
                  aux = fibbef;
                  fibbef = fibk;
                  fibk = fibbef + aux;
            }
            int lo = 0;
            int hi = arr.length - 1;

            while(lo <= hi)
            {
                      while(fibbef > 0 && fibk >= (hi - lo))
                      {
                          aux = fibbef;
                          fibbef = fibk - aux;
                          fibk = aux;
                      }
                      int k = lo + fibbef;
                      if(arr[k] == key)
                      {
                            return k;
                      }
                      else if(arr[k] > key)
                      {
                            hi = k - 1;
                      }
                      else if(arr[k] < key)
                      {
                            lo = k + 1;
                      }

            }
            return -9999;
      }

      public static void main(String[] args)
      {
              int[] alopalo = {1, 2, 3, 5, 9, 11, 15, 19, 23, 39, 51, 59, 63, 66, 78, 79, 84, 89, 94, 99, 100};
              int key = 84;
              int key2 = 65;
              int ho = fibsearch(alopalo, key);
              int doo = fibsearch(alopalo, key2);
              System.out.println("ho do" + ho + " " + doo);
      }
}
