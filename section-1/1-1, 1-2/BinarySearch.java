public class BinarySearch
{
  private int key;
  private int[] arr;

  public transaction(int key, int[] a)
  {
      key = key;
      arr = a;
  }

  public static int rank()
  {
      return rank(key, arr, 0, a.length - 1);
  }

  public static int rank(int lo, int hi)
  {
  // Index of key in a[], if present, is not smaller than lo
  // and not larger than hi.
      if(lo < 0 || hi > arr.length - 1)
      {
          System.out.println("invalid")
          return -1;
      }
      if (lo > hi)
          return -1;
      int mid = lo + (hi - lo) / 2;
      if (key < a[mid])
          return rank(key, a, lo, mid - 1);
      else if (key > a[mid])
          return rank(key, a, mid + 1, hi);
      else
          return mid;

  }
}
