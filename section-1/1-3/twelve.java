package two;
import java.util.Iterator;
import java.util.*;
import java.lang.*;

public class twelve<Item> implements Iterable<Item>
{
      private int N = 0;
      private Item[] a = (Item[]) new Object[1];

      public int size() { return N;}
      public Boolean isEmpty() { return N == 0;}

      public void resize(int max)
      {
          Item[] temp = (Item[]) new Object[max];
          for(int i = 0; i < N; i++)
          {
                temp[i] = a[i];
          }
          a = temp;
      }

      public void push(Item item)
      {
            if(N == (a.length))
            {
                  resize(2 * N);
            }
            a[N++] = item;
      }

      public Item pop()
      {
            Item item = a[--N];
            a[N] = null;
            if(N == (a.length / 4))
            {
                  resize(a.length / 2);
            }
            return item;
      }

      public Iterator<Item> iterator()
      {
            return new Fixedst();
      }

      private class Fixedst implements Iterator<Item>
      {
            private int i = N;
            public boolean hasNext(){ return i > 0; }
            public Item next(){ return a[--i];}
            public void remove() { }
      }

      //test client
      public static void main(String[] args)
      {
          twelve<String> tester = new twelve<String>();
          tester.push("Hi");
          tester.push("Hello");
          tester.push("How");
          tester.push("are");
          tester.push("You");
          int n = tester.size();
          System.out.println(" x : " + n);
          for (String s : tester)
          {
                System.out.println("yo" + s);
          }

      }

}
