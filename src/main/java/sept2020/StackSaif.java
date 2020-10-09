package sept2020;

import contracts.AbstractStack;

public class StackSaif extends AbstractStack {
  int initialCapacity = 2;
  int[] data;
  int nextPointer = 0;
  int curSize = 0;

  public StackSaif() {
    data = new int[initialCapacity];
  }

  @Override
  public void push(int input) {
    if(curSize == data.length) {
      int nextSize = 2 * data.length;
      int[] newData = new int[nextSize];
      copy(data, newData);
      data = newData;
    }
    data[nextPointer] = input;
    nextPointer++;
    curSize++;
  }

  @Override
  public int pop() {
    if(curSize == 0) {
      throw new IllegalStateException("stack underflow");
    }
    nextPointer--;
    curSize--;
    return data[nextPointer];
  }

  @Override
  public int size() {
    return curSize;
  }

  private void copy(int[] oldData, int[] newData) {
    for(int i = 0; i < oldData.length; i++) {
      newData[i] = oldData[i];
    }
  }
}
