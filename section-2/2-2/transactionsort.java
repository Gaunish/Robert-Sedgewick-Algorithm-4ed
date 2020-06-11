import bottom.bottomup;
import template.sorttemplate;
import transac.Transaction;


public class transactionsort
{
      public static void main(String[] args)
      {
            Transaction[] transactions = new Transaction[4];
            Transaction x = new Transaction(2000.0);
            Transaction y = new Transaction(200.0);
            Transaction z = new Transaction(100.0);
            Transaction w = new Transaction(30.0);
            transactions[0] = x;
            transactions[1] = y;
            transactions[2] = z;
            transactions[3] = w;
            bottomup.bottomupsort(transactions);
            for(int i = 0; i < 4; i++)
            {
                    System.out.print(transactions[i].amount + " +> ");
            }
      }
}
