public class LinkedLists {
  public static void main(String[] args) {
    
    LinkedList list = new LinkedList();

    list.insert(4);
    list.insert(6);
    list.insert(7);
    list.insert(3);
    list.insertAtStart(5);
    list.insertAt(0, 33);

    list.show();
  }
}
