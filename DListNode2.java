/* DListNode2.java */

/**
 *  A DListNode2 is a node in a DList2 (doubly-linked list).
 */

public class DListNode2 {

  /**
   *  item references the item stored in the current node.
   *  prev references the previous node in the DList.
   *  next references the next node in the DList.
   *
   *  DO NOT CHANGE THE FOLLOWING FIELD DECLARATIONS.
   */

  public int[] color;
  public int numruns;
  public DListNode2 prev;
  public DListNode2 next;

  /**
   *  DListNode2() constructor.
   */
  DListNode2() {
    short red = 0;
    short green = 0;
    short blue = 0;
    numruns = 0;
    
    color = new int[3];
    color[0] = red;
    color[1] = green;
    color[2] = blue;
    
    prev = null;
    next = null;
  }
  
  DListNode2(int numpixels) {
    short red = 0;
    short green = 0;
    short blue = 0;
    numruns = numpixels;
    
    color = new int[3];
    color[0] = red;
    color[1] = green;
    color[2] = blue;
    
    prev = null;
    next = null;
  }

  DListNode2(int[] i, int a) {
    color = i;
    this.numruns = a;
    prev = null;
    next = null;
  }

}
