import three.fourteen;
import java.util.Iterator;

public class thirty9<Item> implements Iterable<Item>
{
      private int first;
      private int last;
      private int size = 0;
      private int n = 0;
      private int datacount = 0;
      private Item[] arr;
      private fourteen<Item> que_test;

      public thirty9(int cap)
      {
            arr = (Item[]) new Object[cap];
            que_test = new fourteen<>();
            first = -1;
            last = -1;
            n = cap;
      }

      public int size()
      {
            return size;
      }

      public boolean isEmpty()
      {
            return size == 0;
      }

      public void produce(Item item)
      {
            if(datacount > 0)
            {
                  consumedata(item);
                  datacount--;
            }
            else
            {
                  if(isEmpty())
                  {
                        arr[0] = item;
                        first = 0;
                        last = 0;
                        size++;
                  }
                  else
                  {
                        if(size == n)
                        {
                              que_test.enqueue(item);
                        }
                        else
                        {
                            if(last == n - 1)
                            {
                                  last = 0;
                            }
                            else
                            {
                                  last++;
                            }
                            arr[last] = item;
                            size++;
                        }
                  }
            }
      }

      private void consumedata(Item item)
      {
            System.out.println(" " + item);
      }

      public void consume()
      {
            if(isEmpty())
            {
                  datacount++;
            }
            else
            {
                  consumedata(arr[first]);
                  arr[first] = null;
                  if(first == n - 1)
                  {
                        first = 0;
                  }
                  else
                  {
                        first++;
                  }
                  size--;
            }
            if(!que_test.isEmpty())
            {
                  produce(que_test.dequeue());
            }
      }

      public Iterator<Item> iterator()
      {
            return new ringiter();
      }

      private class ringiter implements Iterator<Item>
      {
            private int curr = first;
            private int count = 0;

            public boolean hasNext()
            {
                  return count < size;
            }

            public Item next()
            {
                  Item item = arr[curr];
                  if(curr == n - 1)
                  {
                        curr = 0;
                  }
                  else
                  {
                        curr++;
                  }
                  count++;
                  return item;
            }
            public void remove(){ }
      }

      public static void main(String[] args)
      {
            thirty9<Integer> tester = new thirty9<>(4);
            tester.produce(1);
            tester.produce(2);
            tester.produce(3);
            tester.produce(4);
            tester.produce(5);
            tester.produce(2);
            tester.produce(3);
            tester.produce(4);
            tester.produce(5);
            tester.consume();
            tester.consume();
            tester.consume();
            tester.consume();
      }
}
