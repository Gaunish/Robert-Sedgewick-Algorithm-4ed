class prob20
{
    public static void main(String[] args)
    {
        int n = 1000;
        double a = relog(n);
        System.out.println("The value of log(n!) : " + a);
    }

    public static double relog(int a)
    {
       if(a == 1)
       {
         return 0.0;
       }
       return (relog(a - 1) + Math.log(a));

    }




}
