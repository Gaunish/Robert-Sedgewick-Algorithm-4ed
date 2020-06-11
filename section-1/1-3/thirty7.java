import three.fourteen;
import java.util.*;
import java.lang.*;

class thirty7
{

      public static void calculate(int m, int n)
      {
            fourteen<Integer> tester = new fourteen<Integer>();
            for(int i = 0; i < m; i++)
            {
                  tester.enqueue(i);
            }
            while(m > 0)
            {
                  for(int j = 1; j < n; j++)
                  {
                        tester.enqueue(tester.dequeue());
                  }
                  System.out.print(" " + tester.dequeue() + " ->");
                  m--;
            }
      }

      public static void main(String[] args)
      {
            calculate(7, 2);

      }

}
