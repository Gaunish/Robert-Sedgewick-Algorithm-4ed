package link;

public class linkedlist
{
      public class Node
      {
            int value;
            Node next;
      }

      int size = 0;
      Node ptr;
      public void insert(int x)
      {
            if(size == 0)
            {
                  ptr = new Node();
                  ptr.value = x;
            }
            else if(size == 1)
            {
                  Node xo = new Node();
                  xo.value = x;
                  ptr.next = xo;
            }
            else
            {
                  Node di;
                  for(di = ptr; di.next != null; di = di.next);
                  Node xoo = new Node();
                  xoo.value = x;
                  di.next = xoo;
            }
            size++;
      }

      public int sz()
      {
            return size;
      }

      public Node peek()
      {
            return ptr;
      }

      public int remove()
      {
            if(size == 0)
            {
                  return -99999;
            }
            else if(size == 1)
            {
                  int youza = ptr.value;
                  size--;
                  ptr = null;
                  return youza;
            }
            else
            {
                Node y;
                for(y = ptr; y.next.next != null; y = y.next);
                int dozs = y.next.value;
                y.next = null;
                size--;
                return dozs;
            }
      }

      public void show()
      {
            System.out.println();
            for(Node first = ptr; first != null; first = first.next)
            {
                  System.out.print(first.value + " => ");
            }
            System.out.println();
      }


      public static void main(String[] args)
      {
            linkedlist x = new linkedlist();
            x.insert(2);
            x.insert(1);
            x.insert(5);
            x.insert(6);
            x.insert(1);
            x.remove();
            x.insert(4);
            x.insert(10);
            x.insert(8);
            x.show();
      }
}
