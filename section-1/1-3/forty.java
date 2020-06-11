import java.util.*;

class forty<Item> implements Iterable<Item>
{

      private class Node
      {
            Item content;
            Node next;
      }

      private int size = 0;
      private Node first;
      private int del = 0;

      public boolean isEmpty()
      {
            return size == 0;
      }

      public int size()
      {
            return size;
      }

      public void insert(Item a)
      {
              del = 0;
              if(size == 0)
              {
                    first = new Node();
                    first.content = a;
              }
              else if(size == 1)
              {
                    if(first.content == a)
                    {
                    }
                    else
                    {
                          Node la = new Node();
                          la.content = a;
                          first.next = la;
                    }
              }
              else
              {
                    Node ptr = new Node();
                    for(ptr = first; ptr.next != null; ptr = ptr.next)
                    {
                          if(ptr.next.content == a)
                          {
                                ptr.next = ptr.next.next;
                                del = 1;
                                break;
                          }
                    }
                    Node ha = new Node();
                    ha.content = a;
                    if(del == 1)
                    {
                        ha.next = first;
                        first = ha;
                    }
                    else
                    {
                          for(ptr = first; ptr.next != null; ptr = ptr.next);
                          ptr.next = ha;
                    }

              }
              size++;
      }

      public Iterator<Item> iterator()
      {
            return new linkfx();
      }

      private class linkfx implements Iterator<Item>
      {
            private Node k = first;
            public boolean hasNext()
            {
                return k != null;
            }
            public Item next()
            {
                Item nay = k.content;
                k = k.next;
                return nay;

            }
            public void remove(){ }
      }

      //test client
      public static void main(String[] args)
      {
            forty<String> yo =  new forty<>();
            yo.insert("h");
            yo.insert("i");
            yo.insert("h");
            yo.insert("e");
            yo.insert("l");
            yo.insert("l");
            yo.insert("o");


            for(String s : yo)
            {
                System.out.print(" " +  s + " -> ");
            }

      }

}
