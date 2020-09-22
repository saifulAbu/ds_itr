package contracts;

public abstract class AbstractList {
  public abstract void append(int val);
  public abstract void addToFront(int val);
  public abstract int get(int index);
  public abstract void delete(int val);
  public abstract void deleteAt(int index);
  public abstract boolean search(int val);
  public abstract int size();
}
