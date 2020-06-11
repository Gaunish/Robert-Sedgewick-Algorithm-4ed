package stop;
import java.lang.*;

public class stopwatch
{
    private final long start;

    public stopwatch()
    { start = System.currentTimeMillis(); }

    public double elapsedTime()
    {
          long now = System.currentTimeMillis();
          return (now - start) / 1000.0;
    }
}
