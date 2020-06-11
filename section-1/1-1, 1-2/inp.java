import java.util.Scanner;

class input
{
    public static void main(String[] args)
    {
        System.out.print("Enter something : ");
        String name = System.console().readLine();
        System.out.println(name);
        System.out.print("enter again");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] split = s.split("\\s+");
        int first = Integer.parseInt(split[1]);
        System.out.println("string : " + split[0] + "no is : " + first + "alt : " + split[2]);
    }
}
