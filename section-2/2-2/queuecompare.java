package mergeque;
import java.util.Arrays;

public class queuecompare implements Comparable<queuecompare>
{
      private class Node
      {
            int value;
            Node next;
      }

      private int sz = 0;
      private Node first;

      public int size()
      {
            return sz;
      }

      public boolean isEmpty()
      {
            return sz == 0;
      }

      public void enqueue(int it)
      {
            if(isEmpty())
            {
                  first = new Node();
                  first.value = it;
            }
            else
            {
                  Node x = new Node();
                  for(x = first; x.next != null; x = x.next);
                  Node soi = new Node();
                  soi.value = it;
                  x.next = soi;
            }
            sz++;
      }

      public int peek()
      {
            int o = first.value;
            return o;
      }

      public int dequeue()
      {
            if(isEmpty())
            {
                return -99999999;
            }
            else if(sz == 1)
            {
                  int yx = first.value;
                  first = null;
                  sz--;
                  return yx;
            }
            else
            {
                  int xd = first.value;
                  first = first.next;
                  sz--;
                  return xd;
            }
      }

      public void show()
      {
            Node ptx = new Node();
            System.out.println();
            for(ptx = first; ptx != null; ptx = ptx.next)
            {
                  System.out.print(ptx.value + " => ");
            }
            System.out.println();
      }

      public int compareTo(queuecompare that)
      {
            int x = this.peek();
            int y = that.peek();
            if(x > y) { return 1;}
            else if(x < y) { return -1;}
            else { return 0; }

      }

      public static void main(String[] args)
      {
            queuecompare one = new queuecompare();
            queuecompare two = new queuecompare();
            for(int i = 0; i < 2; i++)
            {
                  int y = i * 2;
                  one.enqueue(y);
                  two.enqueue(2 * y);
            }
            one.show();
            int out = one.compareTo(two);
            one.show();
            System.out.println(out);
      }
}
