package fixed;
public class fixedstack
{
       private int[] a; // stack entries
       private int N; // size

       public fixedstack(int cap)
       { a = new int[cap]; }

       public boolean isEmpty() { return N == 0; }

       public int size() { return N; }

       public void push(int item)
       { a[N++] = item; }

       public int pop()
       { return a[--N]; }
}
