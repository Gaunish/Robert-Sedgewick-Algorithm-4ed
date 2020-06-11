import one.stack.one;
import java.util.*;
import java.lang.*;

class two
{
    public static Boolean parantheses(String input)
    {
          one <String> op = new one<String>(input.length());
          for(int i = 0; i < input.length(); i++)
          {
              String opener;
              Character buff = input.charAt(i);
              String buf = String.valueOf(buff);

              if(buf.equals("{") || buf.equals("(") || buf.equals("["))
              {
                  op.push(buf);
              }
              else if(buf.equals("}"))
              {
                  opener = op.pop();
                  if(!opener.equals("{"))
                  {
                        return false;
                  }

              }
              else if(buf.equals(")"))
              {
                  opener = op.pop();
                  if(!opener.equals("("))
                  {
                        return false;
                  }

              }
              else if(buf.equals("]"))
              {
                  opener = op.pop();
                  if(!opener.equals("["))
                  {
                        return false;
                  }

              }
              else
              {
                  continue;
              }
          }
          if(op.isEmpty())
          {
                return true;
          }
          else
          {
                return false;
          }

    }

    //test client
    public static void main(String[] args)
    {
        Boolean first = parantheses("[(9 + 5)]{}{[()% ^ 5(6 + 3)](5 + 9)}");
        Boolean second = parantheses("[({[{(}]})])");
        Boolean third = parantheses("[()]{}{[(3 + 2)()](})");
        System.out.println("first second third : " + first + " " + second + " " + third);
    }


}
