public class LinkedList {

  Node head;

  public void insert(int data){
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;

    if(head == null){
      head = newNode;
    }
    else{
      Node n = head;
      while(n.next != null){
        n = n.next;
      }
      n.next = newNode;
    }
  }

  public void show(){
    Node node = head;

    while (node != null) {
      System.out.println(node.data + " ");
      node = node.next;
    }
  }

  public void insertAtStart(int data){
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = head;
    head = newNode;
  }

  public void insertAt(int index, int data){
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;

    if(index == 0){
      insertAtStart(data);
      return;
    }

    Node n = head;
    for(int i=0; i<index; i++){
      n = n.next;
    }

    newNode.next = n.next;
    n.next = newNode;
  }
}
