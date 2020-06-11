package one.stack;

public class one<Item>
{
    private Item[] a;
    private int n = 0;
    private int capacity = 0;

    public one(int cap)
    {

        capacity = cap;
        a = (Item[]) new Object[capacity];
    }

    public void push(Item item)
    {
        a[n++] = item;
    }

    public Item pop()
    {

        Item item =  a[--n];
        a[n] = null;
        return item;

    }

    public int size()
    {
        return n;
    }

    public Boolean isEmpty()
    {
        return (n == 0);
    }

    public Item peek()
    {
        return a[n - 1];
    }

    //test client
    public static void main(String[] args)
    {
        one<String> test = new one<String>(5);
        test.push("hi");
        test.push("hello");
        Boolean first = test.isEmpty();
        test.push("you");
        test.push("haha");
        test.push("hoho");
        Boolean second = test.isEmpty();
        test.pop();
        test.pop();
        String top = test.peek();
        test.pop();
        String out = test.pop();
        System.out.println(" output : " + top + " " + second + " " + out + " ");
    }
}
