import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;

public class quickfind {
    private int[] id;
    private int count = 0;
    private int access = 0;

    public quickfind(int n) {
        id = new int[n];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    public int size() {
        return count;
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public int find(int p) {
        return id[p];
    }

    public void union(int p, int q) {
        if (connected(p, q)) {
            return;
        }
        access = 0;
        int id_p = id[p];
        int id_q = id[q];
        access += 2;

        for (int i = 0; i < id.length; i++) {
            access++;
            if (id[i] == id_p) {
                id[i] = id_q;
                access++;
            }
            count++;
        }
    }

    public int noofaccess() {
        return access;
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

        quickfind one = new quickfind(100);
        StdDraw.setPenRadius(0.01);
        for (int i = 1; i <= 200; i++) {
            int x = StdRandom.uniform(100);
            int y = StdRandom.uniform(100);
            if (one.connected(x, y)) {
                continue;
            }
            one.union(x, y);
            int acc = one.noofaccess();
            total += acc;
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.point(i, acc);
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.point(i, (total / i));
        }

    }
}

