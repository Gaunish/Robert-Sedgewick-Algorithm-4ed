package four;
import java.util.*;

public class nineteen<Item> implements Iterable<Item>
{
      private class Node
      {
            Item content;
            Node next;
      }

      private int size = 0;
      private Node first;

      public boolean isEmpty()
      {
            return size == 0;
      }

      public int size()
      {
            return size;
      }

      public Node createNode(Item item)
      {
            Node lex = new Node();
            lex.content = item;
            return lex;
      }

      public void addnode(Item item)
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
                  Node pointr;
                  for(pointr = first; pointr.next != null; pointr = pointr.next);
                  pointr.next = buff;
            }
            size++;
      }

      public void removeAfter(Node tex)
      {
            if(tex == null)
            {
                 return;
            }
            else
            {
                  Node pentr;
                  for(pentr = first; pentr.next != null; pentr = pentr.next)
                  {
                        if(pentr.content == tex.content)
                        {
                              if(pentr.next != null)
                              {
                                    pentr.next = pentr.next.next;
                                    size--;
                              }
                              break;
                        }
                  }
            }
      }

      public void insertAfter(Node fir, Node second)
      {
            if(first == null || second == null)
            {
                  return;
            }

                  Node peontr;
                  for(peontr = first; peontr != null; peontr = peontr.next)
                  {
                        if(peontr.content == fir.content)
                        {
                              second.next  = peontr.next;
                              peontr.next = second;
                              size++;
                        }
                  }


      }

      public void delete(int l)
      {
            if(!isEmpty())
            {
                if(l > size)
                {
                    return;
                }
                else
                {
                      if(l == 1)
                      {
                            first = null;
                      }
                      Node ptr = first;
                      for(int k = 0; k < l - 2; k++)
                      {
                            ptr = ptr.next;
                      }
                      if(ptr.next != null)
                      {
                            ptr.next = ptr.next.next;
                      }

               }
           }
            size--;
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
            nineteen<String> yo =  new nineteen<String>();
            yo.addnode("hi");
            yo.addnode("hello");
            yo.addnode("how");
            yo.addnode("are");
            yo.addnode("you");
            yo.addnode("remr");
            yo.addnode("mad");
            nineteen<String>.Node are = yo.createNode("are");
            nineteen<String>.Node dns = yo.createNode("fwejfi");
            yo.insertAfter(are, dns);
            for(String s : yo)
            {
                System.out.print(" " +  s + " -> ");
            }

      }

}
