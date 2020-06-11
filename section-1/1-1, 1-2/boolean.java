class booleanarray32
{
      public static void main(String[] args)
      {
            boolean[][] a = new boolean[4][4];
            a = check_arr(a);
            for(int i = 0; i < 4; i++)
            {
                for(int j = 0; j < 4; j++)
                {
                    System.out.print(" " + a[i][j]);
                }

                System.out.println();
            }
      }

      public static boolean[][] check_arr(boolean[][] a)
      {
            int smallest = 0;
            for(int i = 0; i < 4; i++)
            {
                  for(int j = 0; j < 4; j++)
                  {
                      if(i == j || (i == 1 && j != 0) || (j == 1 && i!= 0)  || (i == 0 && j != 1) || (j == 0 && i != 1))
                      {
                          a[i][j] = false;
                          continue;
                      }

                      else if ((i == 0 && j == 1) || (j == 0 && i == 1))
                      {
                          a[i][j] = true;
                          continue;
                      }
                      else if(gcd(i, j) == 1)
                      {
                          a[i][j] = true;
                          continue;
                      }
                      a[i][j] = true;

                  }
            }
            return a;
      }

      public static int gcd(int k, int l)
      {
          if(l == 0)
          {
              return k;
          }
          else
          {
              return gcd(k, k % l);
          }
      }

}
