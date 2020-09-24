package sept2020;

import contracts.AbstractList;

public class LinkedListSaif extends AbstractList {
  class Node {
    int val;
    Node next;
    Node(int val) {
      this.val = val;
    }
  }
  private Node head;
  private Node tail;
  private int size = 0;
  public LinkedListSaif() {
    head = new Node(Integer.MIN_VALUE);
    tail = head;
    size = 0;
  }

  @Override
  public void append(int val) {
    Node node = new Node(val);
    tail.next = node;
    tail = node;
    size += 1;
  }

  @Override
  public void addToFront(int val) {
    Node node = new Node(val);
    node.next = head.next;
    head.next = node;
    if(node.next == null) {
      tail = node;
    }
    size = size + 1;
  }

  @Override
  public int get(int index) {
    if(index >= size || index < 0) {
      throw new IllegalStateException("cannot have index < 0 or index > size");
    }
    Node front = head.next;
    for(int i = 0; i < index; i++) {
      front = front.next;
    }
    return front.val;
  }

  @Override
  public void deleteAt(int index) {
    if(index >= size || index < 0) {
      throw new IllegalStateException("cannot have index < 0 or index > size");
    }
    Node front = head;
    for(int i = 0; i < index; i++) {
      front = front.next;
    }
    front.next = front.next.next;
    if(index == size - 1) {
      tail = front;
    }
    size--;
  }

  @Override
  public void delete(int val) {
    Node front = head;
    boolean found = false;
    for(int i = 0; i < size; i++) {
      if(front.next.val == val){
        found = true;
        break;
      }
      front = front.next;
    }
    if(found) {
      front.next = front.next.next;
      if (front.next == null) {
        tail = front;
      }
      size--;
    }
  }

  @Override
  public int search(int val) {
    return 0;
  }

  @Override
  public boolean contains(int val) {
    return false;
  }

  @Override
  public int size() {
    return size;
  }
}
