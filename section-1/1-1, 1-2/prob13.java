class prob13
{
    public static void main(String[] args)
    {
        int[][] arr = {{0, 1, 2} , {3, 4, 5}};
        trans(arr);
    }

    public static void trans(int[][] arra)
    {
        for(int i = 0; i < arra[0].length; i++)
        {
            for(int j = 0; j < arra.length; j++)
            {
                  System.out.print(arra[j][i] + " ");
            }
            System.out.println();
        }
    }

}
