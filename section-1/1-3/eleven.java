import one.stack.one;
import java.util.*;
import java.lang.*;

class eleven
{
      public static String intopost(String inp)
      {
            one<String> operator = new one<String>(inp.length() + 10);
            one<String> operand = new one<String>(inp.length() + 10);

            for(int i = 0; i < inp.length(); i++)
            {
                    Character test = inp.charAt(i);
                    String buff = String.valueOf(test);

                    if(buff.equals(" "))
                    {
                          continue;
                    }
                    else if(buff.equals("*") || buff.equals("/") || buff.equals("+") || buff.equals("-"))
                    {
                          String operand2 = operand.pop();
                          String operand1 = operand.pop();
                          Integer second = Integer.valueOf(operand2);
                          Integer first = Integer.valueOf(operand1);
                          Integer out = 0;
                          if(buff.equals("*"))
                          {
                               out = second * first;
                          }
                          else if(buff.equals("/"))
                          {
                               out = first / second;
                          }
                          else if(buff.equals("+"))
                          {
                               out = second + first;
                          }
                          else
                          {
                               out = first - second;
                          }
                          String outer = String.valueOf(out);
                          operand.push(outer);

                    }
                    else
                    {
                          operand.push(buff);
                    }
            }
            return operand.pop();
      }

      //test client
      public static void main(String[] args)
      {
            String input = "4572+-*";
            String out = intopost(input);
            System.out.println("out : " + out);
      }
}
