class prob23
{
    public static void main(String[] args)
    {
          int[] no = {1,2,3,4,5,6};
          int[] arr = {4,5,6,7,8,9};
          String option = args[0];
          System.out.println("Numbers required :  ");
          binary_search(no, arr, option);

    }

    public static void binary_search(int[] a, int[] b, String c)
    {
          int no = 0;
          for(int i = 0; i < a.length; i++)
          {
              int found = rank(a[i], b, 0, (b.length - 1));

              if(c.equals("+") && found != -1)
              {
                    if(no != 0)
                    {
                          System.out.print(" , ");
                    }

                    System.out.print(a[i]);
                    no++;
              }

              else if(c.equals("-") && found == -1)
              {
                    if(no != 0)
                    {
                          System.out.print(" , ");
                    }

                    System.out.print(a[i]);
                    no++;
              }
         }
    }

    public static int rank(int a, int[] b, int lo, int hi)
    {
        int mid = (hi + lo) / 2;

        if(lo > hi)
        {
            return -1;
        }

        if(a < b[mid])
        {
            return rank(a, b, lo, mid - 1);
        }
        else if(a > b[mid])
        {
            return rank(a, b, mid + 1, hi);
        }
        else if(a == b[mid])
        {
            return mid;
        }
        else
        {
            return -1;
        }
    }

}
