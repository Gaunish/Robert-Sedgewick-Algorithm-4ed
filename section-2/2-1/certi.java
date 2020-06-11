import java.util.Arrays;
import insertion.insertionsort;

public class certi
{
      public static boolean sixteen(Integer[] arr)
      {
            int len = arr.length;
            Integer[] tetris = new Integer[len];
            for(int i = 0; i < len; i++)
            {   tetris[i] = arr[i];}
            insertionsort.insertionsort(arr);
            Arrays.sort(tetris);
            for(int k = 0; k < len; k++)
            {
                    if(arr[k] != tetris[k])
                    {
                          return false;
                    }
            }
            return true;
      }

      public static void main(String[] args)
      {
              Integer[] tester = {3, 2, 5, 7, 2, 9, 4, -1, 32, 43, 2, 1, 0, 4, 21,  45 ,24, 43 , 34};
              boolean outo = sixteen(tester);
              System.out.println(outo);
      }
}
