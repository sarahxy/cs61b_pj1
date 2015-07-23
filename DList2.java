/* DList2.java */

/**
 *  A DList2 is a mutable doubly-linked list.  Its implementation is
 *  circularly-linked and employs a sentinel (dummy) node at the head
 *  of the list.
 */

public class DList2 {

  /**
   *  head references the sentinel node.
   *
   *  DO NOT CHANGE THE FOLLOWING FIELD DECLARATIONS.
   */

  protected DListNode2 head;
  protected long size;

  /* DList2 invariants:
   *  1)  head != null.
   *  2)  For any DListNode2 x in a DList2, x.next != null.
   *  3)  For any DListNode2 x in a DList2, x.prev != null.
   *  4)  For any DListNode2 x in a DList2, if x.next == y, then y.prev == x.
   *  5)  For any DListNode2 x in a DList2, if x.prev == y, then y.next == x.
   *  6)  size is the number of DListNode2s, NOT COUNTING the sentinel
   *      (denoted by "head"), that can be accessed from the sentinel by
   *      a sequence of "next" references.
   */

  /**
   *  DList2() constructor for an empty DList2.
   */
  public DList2() {
    head = new DListNode2();
    head.color[0] = Short.MIN_VALUE;
    head.color[1] = Short.MIN_VALUE;
    head.color[2] = Short.MIN_VALUE;
    head.numruns = 0;
    head.next = head;
    head.prev = head;
    size = 0;
  }

  /**
   *  DList2() constructor for a one-node DList2.
   */
  
  public DList2(int[] a, int b) {
    head = new DListNode2();
    head.color[0] = Short.MIN_VALUE;
    head.color[1] = Short.MIN_VALUE;
    head.color[2] = Short.MIN_VALUE;
    head.numruns = 0;
    head.next = new DListNode2();
    head.next.color = a;
    head.next.numruns = b;
    head.prev = head.next;
    head.next.prev = head;
    head.prev.next = head;
    size = 1;
  }
  
  /**
   *  insertEnd() inserts an item at the end of a DList2.
   */
  public void insertEnd(int[] i, int j) {
    // Your solution here.
      DListNode2 old;
      old = head.prev;
      head.prev = new DListNode2(i, j);
      head.prev.next = head;
      head.prev.prev = old;
      old.next = head.prev;
      size++;
  }
  
  
  /**
   *  insertFront() inserts an item at the front of a DList2.
   */
  public void insertFront(int[] i, int j) {
    // Your solution here.
      DListNode2 old;
      old = head.next;
      head.next = new DListNode2(i, j);
      head.next.next = old;
      head.next.prev = head;
      head.next.next.prev = head.next;
      size++;
  }
 
  /**
   *  removeFront() removes the first item (and first non-sentinel node) from
   *  a DList2.  If the list is empty, do nothing.
   */
  public void removeFront() {
    // Your solution here.
      if (size != 0) {
          DListNode2 ref;
          ref = head.next.next;
          ref.prev = head;
          head.next = ref;
          size--;
      }
  }

  /**
   *  toString() returns a String representation of this DList.
   *
   *  DO NOT CHANGE THIS METHOD.
   *
   *  @return a String representation of this DList.
   */
  public String toString() {
    String result = "[  ";
    DListNode2 current = head.next;
    while (current != head) {
      result = result + current.color + "  ";
      current = current.next;
    }
    return result + "]";
  }

}
