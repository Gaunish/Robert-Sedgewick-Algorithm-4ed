import java.util.Arrays;

class twenty
{
      private int[] id;
      private int[] sz;
      private int count = 0;
      private int ptr = 1;

      public twenty()
      {
            id = new int[1];
            sz = new int[1];
      }

      public boolean connected(int p, int q)
      {   return find(p) == find(q);}

      public int find(int p)
      {
            if(p >= id.length)
            {
                return -1;
            }
            while(id[p] != p)
            {
                 p = id[p];
            }
            return p;
      }

      public int count()
      {   return count; }

      public void resize(int n)
      {
            int[] tester = new int[n];
            int[] tester2 = new int[n];
            for(int i = 0; i < id.length; i++)
            {
                  tester[i] = id[i];
                  tester2[i] = sz[i];
            }
            for(int i = id.length; i < n - id.length; i++)
            {
                  tester[i] = i;
                  tester2[i] = 1;
            }
            sz = tester2;
            id = tester;
      }

      public void nana(int p, int q)
      {
            int len = id.length;
            if(p > q)
            {
                  if(p >= len - 1)
                  { resize(2 * p);}
                  ptr = p;
            }
            else
            {
                  if(q >= len - q)
                  { resize(2 * q);}
                  ptr = q;
            }
      }

      public void union(int p, int q)
      {
            nana(p, q);
            if(connected(p, q))
            {
                  return;
            }

            int id_p = find(p);
            int id_q = find(q);

            if (sz[id_p] > sz[id_q]) {
                sz[id_p] += sz[id_q];
                id[id_q] = id_p;
            } else {
                sz[id_q] += sz[id_p];
                id[id_p] = id_q;
            }
            count++;
      }

      public int newsite()
      {
            return ptr;
      }

      public static void main(String[] args)
      {
            twenty one = new twenty();
            one.union(1, 4);
            one.union(2 , 3);
            one.union(4 , 8);
            int go = one.newsite();
            System.out.println(go);
      }
}
