import one.stack.one;
import java.util.*;
import java.lang.*;

class test
{
      public static String intopost(String inp)
      {
            one<String> operator = new one<String>(inp.length() + 10);
            one<String> operand = new one<String>(inp.length() + 10);

            for(int i = 0; i < inp.length(); i++)
            {
                    Character test = inp.charAt(i);
                    String buff = String.valueOf(test);

                    if(buff.equals(" ") || buff.equals("("))
                    {
                          continue;
                    }
                    else if(buff.equals("*") || buff.equals("/") || buff.equals("+") || buff.equals("-"))
                    {
                          operator.push(buff);
                    }
                    else if(buff.equals(")"))
                    {
                          String operand2 = operand.pop();
                          String operand1 = operand.pop();
                          String operat = operator.pop();
                          String str = operand1 + " " + operand2 + " " + operat;
                          System.out.println("bif ff : " + str);
                          operand.push(str);
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
            String input = "((1 + 2 ) * (((3 - 4 ) * (5 - 6)) * (3 + 4) / (5 - 6)) ) ";
            String out = intopost(input);
            System.out.println("out : " + out);
      }
}
