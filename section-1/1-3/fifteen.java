
import java.util.*;
import three.fourteen;

class fifteen
{
      public static void posn(fourteen<String> buff)
      {
            int in = 2;
            int i = 0;
            int n = buff.size();
            for(String s : buff)
            {
                if(i == (n - in - 1))
                {
                    System.out.println(s);
                    break;
                }
                else
                {
                    i++;
                    continue;
                }
            }
      }

      //test client
      public static void main(String[] args)
      {
          fourteen<String> neo = new fourteen<String>();
          neo.enqueue("one");
          neo.enqueue("two");
          neo.enqueue("three");
          neo.enqueue("four");
          neo.enqueue("five");
          neo.enqueue("six");
          posn(neo);
      }
}
