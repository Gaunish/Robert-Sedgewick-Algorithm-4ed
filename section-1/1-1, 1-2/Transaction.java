import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Date;

class Transaction
{
    private String who;
    private Date when;
    private Double amount;

    public Transaction(String who, Date when, Double amount)
    {
          this.who = who;
          this.when = when;
          this.amount = amount;
    }

    public String who()
    {
          return who;
    }

    public Date when()
    {
          return when;
    }

    public Double amount()
    {
          return amount;
    }

    public String toString()
    {
          return (who() + " Transacted " + amount() + " on " + when());
    }

    public boolean equals(Object x)
    {
      		if (this == x)
          {
      			   return true;
      		}
      		if (x == null)
          {
      			   return false;
      		}
      		if (this.getClass() != x.getClass())
          {
      			   return false;
      		}

      		Transaction that = (Transaction) x;
      		if (!this.who.equals(that.who))
          {
      			   return false;
      		}
      		if (!this.when.equals(that.when))
          {
      			   return false;
      		}
      		if (this.amount != that.amount)
          {
      			   return false;
      		}

      		return true;
	}




    public static void main(String[] args)
    {
          Date x = new Date(10, 10, 2000);
          Transaction t1 = new Transaction("Rajeev", x, 500.0);
          Transaction t2 = new Transaction("Rajeev", x, 500.0);
          boolean out = t1.equals(t1);
          String a = t1.toString();
          StdOut.println("out : " + out);
          StdOut.println("a : " + a);

    }

}
