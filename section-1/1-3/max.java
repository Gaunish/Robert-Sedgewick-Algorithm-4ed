import two.twelve;
import java.util.*;
import java.lang.*;

class max
{
      twelve<Integer> one = new twelve<Integer>();
      twelve<Integer> two = new twelve<Integer>();
      private int n = 0;

      public int size()
      {
            return n;
      }
      public boolean isEmpty()
      {
            return n == 0;
      }

      public void maxpush(Integer item)
      {
            if(n == 0)
            {
                  one.push(item);
                  two.push(item);
            }
            else
            {
                  Integer prev = peek(two);
                  if(prev > item)
                  {
                      two.push(prev);
                  }
                  else
                  {
                      two.push(item);
                  }
                  one.push(item);
            }
            n++;

      }

      public Integer peek(twelve<Integer> tester)
      {
            Integer nah = tester.pop();
            tester.push(nah);
            return nah;
      }

      public Integer maxpop()
      {
            n--;
            Integer top = one.pop();
            Integer max = two.pop();
            return top;
      }

      public Integer maxpeek()
      {
            Integer max_no = peek(two);
            return max_no;
      }

      public static void main(String[] args)
      {
            max tester = new max();
            tester.maxpush(4);
            tester.maxpush(2);
            tester.maxpush(6);
            tester.maxpush(3);
            tester.maxpush(1);
            tester.maxpush(9);
            tester.maxpush(7);
            tester.maxpush(5);
            Integer hi = tester.maxpop();
            Integer maxi = tester.maxpeek();
            System.out.println("yoo : " + hi + " " + maxi);
      }

}
