import one.stack.one;
import fixed.fixedstack;
import stop.stopwatch;

class thirty7
{
      public static void timetrial(int n)
      {
            one<Integer> a = new one<Integer>(n);
            fixedstack b = new fixedstack(n);

            stopwatch one = new stopwatch();
            for(int i = 0; i < n; i++)
            {
                  b.push(1);
            }
            double e = one.elapsedTime();

            stopwatch two = new stopwatch();
            for(int i = 0; i < n; i++)
            {
                  a.push(1);
            }
            double f = two.elapsedTime();

            stopwatch three = new stopwatch();
            for(int i = 0; i < n; i++)
            {
                  int x = b.pop();
            }
            double g = three.elapsedTime();

            stopwatch four = new stopwatch();
            for(int i = 0; i < n; i++)
            {
                  Integer y = a.pop();
            }
            double h = four.elapsedTime();

            System.out.println("a b c d" + e + " " + f + " " + g + " " + h);
      }

      public static void main(String[] args)
      {
            for(int j = 10000000; j <= 30000000; j += 10000000)
            {
                  timetrial(j);
            }
      }
}
