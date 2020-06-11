import one.stack.one;

import java.util.*;
import java.lang.*;

class nine
{
      public static String parantheses_compelete(String inp)
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
                          operator.push(buff);
                    }
                    else if(buff.equals(")"))
                    {
                        String operat = operator.pop();
                        String operand1 = operand.pop();
                        String operand2 = operand.pop();
                        String str = "(" + operand2 + " " + operat + " " + operand1 + ")";
                        System.out.println("buff : " + str);
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
            String input = "1 + 2 ) * 3 - 4 ) * 5 - 6) / 6 -4) ) ) )";
            String out = parantheses_compelete(input);
            System.out.println("out : " + out);
      }
}
