package transac;
import java.util.*;

public class Transaction implements Comparable<Transaction>
{
      public double amount;

      public Transaction(double amo)
      {
            amount = amo;
      }

      public int compareTo(Transaction that)
      {
            if(this.amount == that.amount)
            {
                  return 0;
            }
            else if(this.amount > that.amount)
            {
                  return 1;
            }
            else
            {
                  return -1;
            }
      }

      public static void main(String[] args)
      {
            Transaction mew = new Transaction(1.0);
            Transaction xo = new Transaction(1.0);
            int out = xo.compareTo(mew);
            System.out.println(out);
      }

}
