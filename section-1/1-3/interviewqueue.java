import two.twelve;
import java.util.*;
import java.lang.*;

class interviewqueue<Item>
{
      twelve<Item> one = new twelve<Item>();
      twelve<Item> two = new twelve<Item>();
      private int n = 0;


      public int siz()
      {
            return n;
      }

      public boolean isEmpt()
      {
            return n == 0;
      }

      public void enqueue(Item item)
      {
            if(n == 0)
            {
                  one.push(item);
            }
            else
            {
                while(!one.isEmpty())
                {
                      Item noo = one.pop();
                      two.push(noo);
                }
                one.push(item);
                while(!two.isEmpty())
                {
                      Item noo = two.pop();
                      one.push(noo);
                }
            }
            n++;
      }

      public Item dequeue()
      {
            Item yoo = null;
            if(n != 0)
            {
                yoo = one.pop();
            }
                n--;
                return yoo;

      }

      public static void main(String[] args)
      {
            interviewqueue<String> tester = new interviewqueue<String>();
            tester.enqueue("hi");
            tester.enqueue("1");
            tester.enqueue("2");
            tester.enqueue("3");
            tester.enqueue("4");
            String haha = tester.dequeue();
            String lo = tester.dequeue();
            String hit = tester.dequeue();
            System.out.println("ff : " + haha + " " + hit);
      }
}
