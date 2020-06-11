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

        return a[--n];

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
}
