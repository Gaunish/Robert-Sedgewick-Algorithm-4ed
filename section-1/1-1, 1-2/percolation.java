import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;


public class percolation {
    //arbitary we consider '0' for node to be closed,'1' for node to be open and '2' for node to be full
    private int[][] grid;
    private int[] list;
    private int[] sz;
    private int[] flow;
    private int no_of_opensites = 0;
    private boolean opened = false;
    private int n;

    public percolation(int k) {
        n = k;
        union_find();
        //Initially all the sites are blocked
        grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = 0;
            }
        }
    }

    public void open(int row, int col) {
        union_check(row, col);
        if (grid[col][row] == 0) {
            grid[col][row] = 1;
            no_of_opensites++;
            return;
        }
        return;
    }

    public boolean isOpen(int row, int col) {
        if (grid[col][row] == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isFull(int row, int col) {
        if (grid[col][row] == 2) {
            return true;
        } else {
            return false;
        }
    }

    public int numberOfOpenSites() {
        return no_of_opensites;
    }

    public boolean percolates() {
        return opened;
    }

    //we create a list where the root of each element is always the topmost element
    private void union_find() {
        int l = n * n;
        sz = new int[l];
        flow = new int[l];
        list = new int[l];
        for (int i = 0; i < l; i++) {
            flow[i] = 0;
            list[i] = i;
            sz[i] = 1;
        }
    }

    private void union_check(int row, int col)
    {
        int q = (n * col) + row;

        if (row != (n - 1)) {
            if (grid[col][row + 1] == 1 || grid[col][row + 1] == 2) {
                union_do(q, (q + 1), row, col);
            }
        }
        if (col != (n - 1)) {
            if (grid[col + 1][row] == 1 || grid[col + 1][row] == 2) {
                union_do(q, (q + n), row, col);
            }
        }
        if (q != 0 && col != 0) {
            if (grid[col - 1][row] == 1 || grid[col - 1][row] == 2) {
                union_do(q, (q - n), row, col);
            }
        }
        if (q != 0 && row != 0) {
            if (grid[col][row - 1] == 1 || grid[col][row - 1] == 2) {
                union_do(q, (q - 1), row, col);
            }
        }
        flowing(row, col, q);
    }

    private void union_do(int p, int q,int row, int col)
    {
        int max_id = 0;
        int p_id = find(p);
        int q_id = find(q);

        if (p_id == q_id)
        {
            max_id = p_id;
        }
        else
        {
            if (sz[p_id] >= sz[q_id])
            {
                max_id = p_id;
                list[q_id] = p;
                sz[p_id] += sz[q_id];
            }
            else
            {
                max_id = q_id;
                list[p_id] = q;
                sz[q_id] += sz[p_id];
            }
        }

        if ((p >= 0 && p <= (n - 1)) || (q >= 0 && q <= (n - 1)) || grid[col][row] == 2)
        {
            flow[max_id] = 1;
        }
    }

    private int find ( int x)
    {
            int k = x;
            while (list[k] != k) {
                 k = list[k];
            }
            return k;
    }

    private void flowing ( int row, int col, int y)
    {
            int y_id = find(y);

            if (flow[y_id] == 1 || row == 0) {
                grid[col][row] = 2;
                if (col == (n - 1)) {
                    opened = true;
                }
            }
    }

    public static void main (String[]args)
    {
            percolation x = new percolation(5);
            x.open(1, 0);
            x.open(1, 1);
            x.open(2, 1);
            x.open(2, 2);
            x.open(3, 2);
            x.open(3, 3);
            x.open(3, 4);
            boolean hold = x.isFull(3, 3);

            StdOut.println("hold : " + hold);
            StdOut.println("Percolated : " + x.percolates());
    }
}
