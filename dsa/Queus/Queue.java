public class Queue {
  int queue[] = new int[5];
  int size;
  int front;
  int rear;

  public void enQueue(int data){
    queue[rear++] = data;
    size++;
  }

  public int deQueue(){
    int data = queue[front];
    front = front+1;
    size = size-1;
    return data;
  }

  public void show(){
    for(int i=0; i<size; i++){
      System.out.print(queue[front+i] + " ");
    }
    System.out.println();
  }
}
