class union_find
{
        private int[] id;
        private int[] sz;

        public union_find(int n)
        {
            id = new int[n];
            sz = new int[n];
            for(int i = 0; i < n; i++)
            {
                id[i] = i;
                sz[i] = 1;
            }
        }

        public void union(int p, int q)
        {
            p_id = root(p);
            q_id = root(q);
            if(p_id == q_id)
            {
                return;
            }
            else
            {
                if(sz[p] >= sz[q])
                {
                    id[q] = id[p];
                    sz[p] += sz[q];
                }
                else if(sz[p] < sz[q])
                {
                    id[p] = id[q];
                    sz[q] += sz[p];
                }
            }

        }

        public boolean connected(int p, int q)
        {
            if(id[p] == id[q])
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        public int root(int i)
        {
            int j = i;
            while(id[j] != j)
            {
                j = id[j];
            }
            return j;
        }

        public int find(int i)
        {
            int max = i;
            int j = i;
            while(id[j] != j)
            {
                j = id[j];
                if(max < id[j])
                {
                    max = id[j];
                }
            }
            return max;
        }
}
