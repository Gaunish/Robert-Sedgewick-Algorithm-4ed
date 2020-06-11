import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;


public class weightedquickunion {
    private int[] id;
    private int[] sz;
    private int count = 0;
    private int accord = 0;

    public weightedquickunion(int n) {
        id = new int[n];
        sz = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    public boolean connected(int p, int q) {
        int id_p = find(p);
        int id_q = find(q);
        return id_p == id_q;
    }

    public int size() {
        return count;
    }

    public int find(int p) {
        if (id[p] == p) {
            return p;
        }
        return id[p] = find(id[p]);
    }

    public void union(int p, int q) {
        accord = 0;
        if (connected(p, q)) {
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
        accord += 4;
    }

    public int noofconnected(int p) {
        return sz[p];
    }

    public int noocess() {
        return accord;
    }

    public static void main(String[] args) {
        int total = 0;

        StdDraw.setCanvasSize(1024, 1024);
        StdDraw.setPenRadius(0.005);
        StdDraw.setXscale(-80, 300);
        StdDraw.setYscale(-80, 200);

        StdDraw.line(-10, 0, 200, 0);
        Font font = new Font("TimesRoman", Font.PLAIN, 10);
        StdDraw.setFont(font);
        StdDraw.line(0, -10, 0, 200);
        for (int i = -10; i <= 200; i += 40) {
            StdDraw.setPenColor(StdDraw.MAGENTA);
            StdDraw.line(i, -2, i, 2);
            String yo = String.valueOf(i);
            StdDraw.text(i, -10, yo);
        }

        for (int i = -10; i <= 200; i += 40) {
            StdDraw.setPenColor(StdDraw.MAGENTA);
            StdDraw.line(-2, i, 2, i);
            String yo = String.valueOf(i);
            StdDraw.text(-5, i, yo);
        }

        weightedquickunion one = new weightedquickunion(100);
        StdDraw.setPenRadius(0.01);
        for (int i = 1; i <= 100; i++) {
            int x = StdRandom.uniform(100);
            int y = StdRandom.uniform(100);
            if (one.connected(x, y)) {
                continue;
            }
            one.union(x, y);
            int acc = 0;
            acc = one.noocess();
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.point(i, acc);
            total += acc;
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.point(i, (total / i));
        }

    }
}
