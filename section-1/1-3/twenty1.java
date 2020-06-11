import java.util.*;
import four.nineteen;

class twenty1
{
      public static boolean find(nineteen<String> list, String key)
      {
            for(String s : list)
            {
                  if (s == key)
                  {
                        return true;
                  }
            }
            return false;
      }

      public static void main(String[] args)
      {
            nineteen<String> yo = new nineteen<String>();
            yo.addnode("hi");
            yo.addnode("hello");
            yo.addnode("how");
            yo.addnode("are");
            yo.addnode("you");
            yo.addnode("remr");
            yo.addnode("mad");
            boolean nay = find(yo, "are");
            System.out.println("result : " + nay);
      }
}
