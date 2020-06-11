class problem11
{
    public static void main(String[] args)
    {
        boolean[][] arr = {{true, false, true} , {false, true, false}};
        printarr(arr);
    }

    public static void printarr(boolean[][] arra)
    {
        for(int i = 0; i < arra.length; i++)
        {
            for(int j = 0; j < arra[i].length; j++)
            {
                if(arra[i][j])
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("/ ");
                }
            }
            System.out.println();
        }
    }




}
