import five.thirtyone;

class forty4
{
      thirtyone<String> buffer;
      thirtyone<String> buff;
      private int n = 0;
      private int ptr = 0;
      public forty4()
      {
            buffer = new thirtyone<>();
            buff = new thirtyone<>();
      }

      public void insert(String c)
      {
            buffer.addend(c);
            ptr++;
            n++;
      }

      public String delete()
      {
            String x = buffer.remend();
            ptr--;
            n--;
            return x;
      }

      public int size()
      {
            return n;
      }

      public void left(int k)
      {
            if(n < k)
            {
                  return;
            }
            else
            {
                    ptr = ptr - k;
                    for(int i = 0; i < k; i++)
                    {
                          buff.addend(buffer.remend());
                    }

            }
      }

      public void right(int k)
      {
            if(buff.size() < k)
            {
                  return;
            }
            else
            {
                  ptr = ptr + k;
                  for(int i = 0; i < k; i++)
                  {
                        buffer.addend(buff.remend());
                  }
            }
      }

      public static void main(String[] args)
      {
            forty4 tester = new forty4();
            tester.insert("a");
            tester.insert("b");
            tester.insert("c");
            tester.insert("d");
            tester.insert("e");
            tester.insert("f");
            tester.insert("g");
            tester.left(4);
            tester.delete();
            tester.right(2);
            tester.delete();
            tester.right(2);
            for(String x : tester.buffer)
            {
                  System.out.print(x + " -> ");
            }

      }
}
