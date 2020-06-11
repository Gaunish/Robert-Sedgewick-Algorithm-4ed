import three.fourteen;
import java.util.*;

public class forty1<Item> implements Iterable<Item>
{
        private int no = 0;
        fourteen<Item> baba;
        public forty1(fourteen<Item> buff)
        {
              no = buff.size();
              baba = new fourteen<>();
              for(int i = 0; i < no; i++)
              {
                    Item x = buff.dequeue();
                    baba.enqueue(x);
                    buff.enqueue(x);
              }
        }

        public void enque(Item item)
        {
              baba.enqueue(item);
              no++;
        }

        public Item deque()
        {
              no--;
              Item n = baba.dequeue();
              return n;
        }

        public Iterator<Item> iterator()
        {
              return new fortyiter();
        }

        private class fortyiter implements Iterator<Item>
        {
              private int i = 0;
              public boolean hasNext()
              {
                    return i < no;
              }
              public Item next()
              {
                    Item yo = baba.dequeue();
                    i++;
                    return yo;
              }
              public void remove(){ }
        }

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

              forty1<String> haha = new forty1<String>(yo);
              haha.enque("tada");
              String too = haha.deque();
              for(String s : yo)
              {
                    System.out.println(s);
              }
        }

}
