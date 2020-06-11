package three;
import java.util.*;

public class fourteen<Item> implements Iterable<Item>
{
      private int n = 0;
      private Item[] a;

      public fourteen()
      {
            a = (Item[]) new Object[1];
      }

      private void resize(int max)
      {
            Item[] tester = (Item[]) new Object[max];
            for(int j = 0; j < n; j++)
            {
                tester[j] = a[j];
            }
            a = tester;
      }

      public void enqueue(Item item)
      {
            if(n == a.length)
            {
                  resize(2 * n);
            }
            a[n++] = item;
      }

      public Item dequeue()
      {
            Item x = a[0];
            for(int i = 1; i < n; i++)
            {
                a[i - 1] = a[i];
            }
            n--;
            if(n == (a.length / 4))
            {
                  resize(a.length / 2);
            }
            return x;
      }

      public int size()
      {
            return n;
      }

      public boolean isEmpty()
      {
            return n == 0;
      }

      public Iterator<Item> iterator()
      {
          return new queuestd();
      }

      private class queuestd implements Iterator<Item>
      {
            private int i = n;
            public boolean hasNext(){ return i > 0;}
            public Item next()
            {
                  Item x = a[0];
                  for(int j = 1; j < n; j++)
                  {
                      a[j - 1] = a[j];
                  }
                  i--;
                  return x;
            }
            public void remove() { }
      }

      //test client
      public static void main(String[] args)
      {
            fourteen<String> yo = new fourteen<String>();
            yo.enqueue("hi");
            yo.enqueue("hello");
            yo.enqueue("how");
            yo.enqueue("are");
            yo.enqueue("you");
            yo.enqueue("remr");
            yo.enqueue("mad");
            yo.enqueue("bam");
            for(String s : yo)
            {
                System.out.println(s);
            }
      }
}
