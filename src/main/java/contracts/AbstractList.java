package contracts;

public abstract class AbstractList {
  public abstract void append(int val);
  public abstract void addToFront(int val);
  public abstract int get(int index);
  public abstract void deleteAt(int index);
  public abstract boolean contains(int val);
  /**
   * delete the first occurrence of val
   * @param val
   */
  public abstract void delete(int val);
  /**
   * returns the index of first occurrence of the val. return -1 if does not exist in this list.
   * @param val
   * @return
   */
  public abstract int search(int val);
  public abstract int size();
}
