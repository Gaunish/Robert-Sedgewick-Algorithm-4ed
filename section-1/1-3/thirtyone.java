package five;
import java.util.*;

public class thirtyone<Item> implements Iterable<Item>
{
      private class Node
      {
            Item content;
            Node prev;
            Node next;
      }

      private Node first;
      private int n = 0;

      public boolean isEmpty()
      {
              return n == 0;
      }

      public int size()
      {
            return n;
      }

      public void addbeg(Item item)
      {
            if(isEmpty())
            {
                  first = new Node();
                  first.content = item;
            }
            else
            {
                  Node buff = new Node();
                  buff.content = item;
                  buff.next = first;
                  first.prev = buff;
                  first = buff;
            }
            n++;
      }

      public void addend(Item item)
      {
            if(isEmpty())
            {
                  first = new Node();
                  first.content = item;
            }
            else
            {
                  Node buff = new Node();
                  buff.content = item;
                  Node ptr = new Node();
                  for(ptr = first; ptr.next != null; ptr = ptr.next);
                  ptr.next = buff;
                  buff.prev = ptr;
            }
            n++;
      }

      public Item rembeg()
      {
            Item yo;
            if(isEmpty())
            {
                  return null;
            }
            else if (n == 1)
            {
                  yo = first.content;
                  first = null;
            }
            else
            {
                  yo = first.content;
                  first = first.next;
            }
            n--;
            return yo;

      }

      public Item remend()
      {
            if(isEmpty())
            {
                  return null;
            }
            else if(n == 1)
            {
                  Item x = first.content;
                  first = null;
                  n--;
                  return x;
            }
            else
            {
                  Node ptr = new Node();
                  for(ptr = first; ptr.next.next != null; ptr = ptr.next);
                  Item x = ptr.next.content;
                  ptr.next = null;
                  n--;
                  return x;
            }
      }

      public void remposn(int k)
      {

            if(k > n)
            {
                  return;
            }
            else
            {
                  Node ptr = new Node();
                  ptr = first;
                  for(int i = 0; i < k - 2; i++)
                  {
                        ptr = ptr.next;
                  }
                  ptr.next = ptr.next.next;
                  ptr.next.prev = ptr;
            }
            n--;

      }

      public void addafter(Item item, int k)
      {
            if(k > n)
            {
                  return;
            }
            else
            {
                  Node ptr = first;
                  for(int i = 0; i < k - 1; i++)
                  {
                        ptr = ptr.next;
                  }
                  Node buff = new Node();
                  buff.content = item;

                  buff.next = ptr.next;
                  ptr.next = buff;
                  buff.prev = ptr;
                  buff.next.prev = buff;

            }
            n++;
      }

      public void addbefore(Item item, int k)
      {
            if(k > n)
            {
                  return;
            }
            else
            {
                  Node ptr = first;
                  for(int i = 0; i < k - 2; i++)
                  {
                        ptr = ptr.next;
                  }
                  Node buff = new Node();
                  buff.content = item;
                  buff.next = ptr.next;
                  ptr.next = buff;
                  buff.prev = ptr;
                  buff.next.prev = buff;

            }
            n++;
      }

      public Iterator<Item> iterator()
      {
            return new doubleiter();
      }

      private class doubleiter implements Iterator<Item>
      {
            private Node pointr = first;

            public boolean hasNext()
            { return pointr != null; }

            public Item next()
            {
                  Item haha = pointr.content;
                  pointr = pointr.next;
                  return haha;
            }

            public void remove(){ throw new UnsupportedOperationException(); }
      }

      //test client
      public static void main(String[] args)
      {
            thirtyone<String> tester = new thirtyone<String>();
            tester.addbeg("one");
            tester.addbeg("two");
            tester.addend("three");
            tester.addafter("four", 2);
            tester.addafter("five", 2);
            tester.addbefore("six", 2);
            tester.remposn(4);

            for(String s : tester)
            {
                  System.out.print(s + " ->");
            }

      }


}
