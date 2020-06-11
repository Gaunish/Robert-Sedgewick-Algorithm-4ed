import java.util.Arrays;
import java.awt.*;
import insertion.insertionsort;
import selection.selectionsort;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class anima
{
      public static void seventeen(Integer[] arr, boolean oh)
      {
            StdDraw.setCanvasSize(1024, 1024);
            StdDraw.setScale(-50, 150);
            StdDraw.setPenRadius(0.005);
            Font font = new Font("TimesRoman", Font.PLAIN, 10);
            StdDraw.setFont(font);
            StdDraw.line(-20, 0, 100, 0);
            StdDraw.line(0, -20, 0, 100);
            for(int i = -1; i < 5; i++)
            {
                    StdDraw.setPenColor(StdDraw.MAGENTA);
                    int x = i * 20;
                    StdDraw.line(x, 2, x, -2);
                    String yo = String.valueOf(x);
                    StdDraw.text(x, -10, yo);
            }
            for(int i = -1; i < 5; i++)
            {
                    StdDraw.setPenColor(StdDraw.MAGENTA);
                    int x = i * 20;
                    StdDraw.line(-2, x, 2, x);
                    String yo = String.valueOf(x);
                    StdDraw.text(-10, x, yo);
            }
            if(oh == true)
            {
                selection_anima(arr);
            }
            else
            {
            }
      }

      public static void selection_anima(Integer[] arr)
      {
            StdDraw.setPenColor(StdDraw.BLACK);
            for(int i = 0; i< arr.length; i++)
            {
                  StdDraw.filledRectangle((2 * i) + 1, arr[i] / 2, 0.7, arr[i] / 2);
            }

            selectionsort.selectionsort(arr);
      }

      public static void main(String[] args)
      {
              Integer[] tester = {3, 2, 5, 7, 2, 9, 4, 2, 1, 80, 4, 21,  45 ,24, 43 , 34};
              seventeen(tester , true);
      }
}
