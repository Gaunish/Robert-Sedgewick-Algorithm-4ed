import java.lang.*;
import java.util.*;
import three.fourteen;
import java.io.File;
import java.util.Arrays;

class forty3
{
      private fourteen<String> buff;
      public forty3()
      {
            buff = new fourteen<>();
      }

      public void listfile(File file, int depth)
      {
            if(!file.exists())
            {
                  return;
            }
            pushfile(file, depth);

            File[] tester = file.listFiles();

            if (tester != null)
            {
                for(File fileitem : tester)
                {
                    if(fileitem.isFile())
                    {
                          listfile(fileitem, depth + 1);
                    }
                    else if(fileitem.isDirectory())
                    {
                          listfile(fileitem, depth + 1);
                    }
                }
            }
      }

      private void pushfile(File file, int depth)
      {
              StringBuilder str = new StringBuilder();
              for(int i = 0; i < depth; i++)
              {
                    str.append("---");
              }
              str.append(file.getName());
              buff.enqueue(str.toString());
      }

       public static void main(String[] args)
       {
            forty3 tester = new forty3();
            File folder = new File("C:/Users/dell/desktop/java/1-3");
            tester.listfile(folder, 0);
            for(String s : tester.buff)
            {
                  System.out.println(s);
            }
      }
}
