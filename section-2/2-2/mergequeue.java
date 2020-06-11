import java.util.Arrays;
import template.sorttemplate;
import mergeque.queuecompare;

public class mergequeue
{
      public static queuecompare mergeque(queuecompare a, queuecompare b)
      {
            int len_a = a.size();
            int len_b = b.size();
            int len = len_a + len_b;

            queuecompare c = new queuecompare();

            int left = 0;
            int right = 0;
            while(left < len_a && right < len_b)
            {
                    if(a.compareTo(b) < 0)
                    {
                        c.enqueue(a.dequeue());
                        left++;

                    }
                    else
                    {
                        c.enqueue(b.dequeue());
                        right++;

                    }
            }

            while(left < len_a)
            {
                c.enqueue(a.dequeue());
                left++;

            }

            while(right < len_b)
            {
                c.enqueue(b.dequeue());
                right++;

            }
            return c;
      }

      public static void main(String[] args)
      {
            queuecompare one = new queuecompare();
            queuecompare two = new queuecompare();
            queuecompare three = new queuecompare();
            for(int i = 1; i <  5; i++)
            {
                  one.enqueue((2 * i) - 3);
                  two.enqueue((2 * i) - 2);
            }
            three = mergeque(one, two);
            three.show();
      }

}
