import java.util.*;
import java.lang.*;
import two.twelve;

class twelveclient
{
      public static twelve<String> copy(twelve<String> buff)
      {
            twelve<String> test = new twelve<String>();
            twelve<String> tester = new twelve<String>();
            for(String s : buff)
            {
                test.push(s);
            }
            for(String x : test)
            {
                  tester.push(x);
            }
            return tester;
      }

      //test twelveclient
      public static void main(String[] args)
      {
              twelve<String> bufl = new twelve<String>();
              bufl.push("hi");
              bufl.push("yo");
              bufl.push("col");
              bufl.push("trt");
              bufl.push("gsd");
              twelve<String> gon = copy(bufl);
              for(String l : bufl)
              {
                  System.out.println(l);
              }
      }

}
