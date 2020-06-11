import link.linkedlist;

public class sortlinkedlist
{
        public void sort()
        {
              Node lo = ptr;
              Node mid = null;
              Node high = null;
              Node hi = new Node();
              while(hi = first; hi.next != null; hi = hi.next);

              boolean opti = false;
              while(lo = ptr; lo.next != null; lo = lo.next)
              {
                    if(lo.value > lo.next.value)
                    {
                        if(opti == false)
                        {
                              mid = lo;
                              opti = true;
                        }
                        else
                        {
                              high = lo;
                              merge(lo, mid, high);
                              mid = lo;
                        }
                    }
              }
              if(hi != high)
              {
                    merge(lo, mid, high);
              }
        }

        public

        public Node middled()
        {
              Node ptr1 = ptr;
              Node ptr2 = ptr;
              while(ptr1.next != null)
              {
                    ptr1 = ptr1.next.next;
                    ptr2 = ptr2.next;
              }
              return ptr2;
        }

      public static void main(String[] args)
      {
            sortlinkedlist x = new sortlinkedlist();
            x.insert(2);
            x.insert(1);
            x.insert(5);
            x.insert(6);
            x.insert(1);
            x.insert(4);
            x.insert(10);
            x.insert(8);
            x.sort();
      }
}
