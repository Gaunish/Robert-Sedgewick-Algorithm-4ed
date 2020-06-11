package six;
import java.util.*;
import java.lang.*;

public class twentynine<Item> implements Iterable<Item>
{
      private class Node
      {
            Item content;
            Node fwd;
      }

      private Node last;
      private int n = 0;

      public boolean isEmpty()
      {
            return n == 0;
      }

      public int size()
      {
            return n;
      }

      public void addNode(Item item)
      {
            if(isEmpty())
            {
                  last = new Node();
                  last.content = item;
                  last.fwd = last;
            }
            else
            {
                  Node buff = new Node();
                  buff.content = item;
                  buff.fwd = last.fwd;
                  last.fwd = buff;
                  last = buff;
            }
            n++;
      }

      public Item removeNode()
      {
            Item nah;
            if(n == 0)
            {
                  return null;
            }
            else if(n == 1)
            {
                  nah = last.content;
                  last = null;
            }
            else
            {
                  nah = last.fwd.content;
                  last.fwd = last.fwd.fwd;
            }
            n--;
            return nah;
      }

      public Iterator<Item> iterator()
      {
            return new circqueue();
      }

      private class circqueue implements Iterator<Item>
      {
            private Node doh = last.fwd;
            private int i = 0;
            public boolean hasNext()
            {
                  return i < n;
            }
            public Item next()
            {
                  i++;
                  Item ran = doh.content;
                  doh = doh.fwd;
                  return ran;
            }
            public void remove() { throw new UnsupportedOperationException();}
      }

      //test client
      public static void main(String[] args)
      {
            twentynine<String> tester = new twentynine<String>();
            tester.addNode("hi");
            tester.addNode("hello");
            tester.addNode("how");
            tester.addNode("are");
            tester.addNode("you");
            String nooo = tester.removeNode();
            String nop = tester.removeNode();
            for(String s : tester)
            {
                  System.out.print(s + " ->");
            }

      }
}
