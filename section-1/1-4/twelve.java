import java.util.Arrays;

class twelve
{
      public static void common(int[] one, int[] two)
      {
            int one_index = 0;
            int two_index = 0;

            while(one_index < one.length && two_index < two.length)
            {
                  if(one_index < one.length && two_index < two.length)
                  {
                      while(one[one_index] < two[two_index] && one_index < one.length - 1)
                      {
                            one_index++;
                      }
                  }

                  if(one[one_index] == two[two_index])
                  {
                        System.out.println("out : " + one[one_index]);
                            one_index++;
                            two_index++;

                  }

                  if(one_index != 0 && two_index != 0 && one_index < one.length && two_index < two.length)
                  {
                      while(one[one_index - 1] == one[one_index]  && one_index < one.length - 1)
                      {
                            one_index++;
                      }
                      while(two[two_index - 1] == two[two_index] && two_index < two.length - 1)
                      {
                            two_index++;
                      }
                  }

                  if(one_index < one.length && two_index < two.length)
                  {
                      while(one[one_index] > two[two_index] && two_index < two.length - 1)
                      {
                            two_index++;
                      }
                  }
            }
      }

      public static void main(String[] args)
      {
            int[] a = {0, 1 ,2 ,3, 6, 7, 9, 11, 19, 32, 34};
            int[] b = {4, 5 , 6, 11, 15, 19, 34};
            common(a, b);
      }
}
