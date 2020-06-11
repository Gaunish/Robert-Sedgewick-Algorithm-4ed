class local_min2
{
      private static int Not_found = -9999;

      public static int minima(int[][] arr)
      {
          int n = arr[0].length;
          if(n != arr.length)
          {
              System.out.println("Invalid Matrix");
              return Not_found;
          }
          if(n == 0)
          {
              return Not_found;
          }
          if(n == 1)
          {
              return arr[0][0];
          }

          if(n == 2)
          {
              if(arr[0][0] < arr[0][1] && arr[0][0] < arr[1][0])
              {
                  return arr[0][0];
              }
              else if(arr[0][1] < arr[0][0] && arr[0][1] < arr[1][1])
              {
                  return arr[0][1];
              }
              else if(arr[1][0] < arr[0][0] && arr[1][0] < arr[1][1])
              {
                  return arr[1][0];
              }
              else if(arr[1][1] < arr[0][1] && arr[1][1] < arr[1][0])
              {
                  return arr[1][1];
              }
              else
              {
                  return Not_found;
              }
        }

        int loc_row = local_minima(arr, (n / 2), n);
        int result = recur_minima(arr,loc_row, (n / 2), n);
        return result;

     }

     public static int local_minima(int[][] arr, int col, int no)
     {
              int row = 0;

              for(int i = 0; i < (no - 1); i++)
              {
                    if(arr[i + 1][col] < arr[i][col])
                    {
                        row ++;
                    }
              }

              return row;
     }

     public static int recur_minima(int[][] arr,int row, int col, int no)
     {

              if(col != 0 && col != (no - 1))
              {
                  if(arr[row][col] < arr[row][col - 1] && arr[row][col] < arr[row][col + 1])
                  {
                      if(col == (no / 2))
                      {
                          return arr[row][col];
                      }
                      else
                      {
                          int loc = local_minima(arr, col, no);
                          return arr[loc][col];
                      }
                  }
                  else if(arr[row][col] > arr[row][col - 1])
                  {
                      col--;
                      return recur_minima(arr, row, col, no);
                  }
                  else if(arr[row][col] > arr[row][col + 1])
                  {
                      col++;
                      return recur_minima(arr, row, col, no);
                  }
              }
              else if(col == 0)
              {
                    if(arr[row][col] < arr[row][col + 1])
                    {
                        int loc = local_minima(arr, col, no);
                        return arr[loc][col];
                    }
                    else
                    {
                        return Not_found;
                    }
              }
              else if(col == (no - 1))
              {
                    if(arr[row][col] < arr[row][col - 1])
                    {
                        int loc = local_minima(arr, col, no);
                        return arr[loc][col];
                    }
                    else
                    {
                        return Not_found;
                    }
              }
              return Not_found;
     }

     //test client
     public static void main(String[] args)
     {
          int[][] test_arr = {{4, 5, 9}, {9, 4, 1}, {9, 3, 2}};
          int out = minima(test_arr);
          System.out.println("local minimum : " + out);
     }
}
