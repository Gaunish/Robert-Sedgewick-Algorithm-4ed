import java.util.*;
import five.thirtyone;

class thirty2<Item>
{
    thirtyone<Item> buff = new thirtyone<Item>();
    public void push(Item item)
    {
          buff.addbeg(item);
    }

    public void enqueue(Item item)
    {
          buff.addend(item);
    }

    public Item pop()
    {
          Item duh = buff.rembeg();
          return duh;
    }

    public void traverse()
    {
          for(Item h : buff)
          {
                System.out.print(h + " ->");
          }
    }


    //test client
    public static void main(String[] args)
    {
          thirty2<String> yo = new thirty2<String>();
          yo.push("hi");
          yo.push("hello");
          yo.enqueue("how");
          yo.enqueue("are");
          yo.enqueue("you");
          String hey = yo.pop();
          yo.traverse();
    }
}
