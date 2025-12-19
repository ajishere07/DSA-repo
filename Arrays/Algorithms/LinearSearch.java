public class Main {
    public static void main(String[] args) {
      int[] arr = {3,5,6,7,2};
      
      int num_for_best_case = 3; 
      int num_for_worst_case = 2;
      
      for(int i = 0; i<arr.length; i++){
        if(arr[i] == num_for_best_case) {
          System.out.print("at index "+i + "\n");
          break;
        }
      }
      
  
      for(int i = 0; i<arr.length; i++){
        if(arr[i] == num_for_worst_case) {
          System.out.print("at index "+i);
          break;
        }
      }
  }
}


/*---------------------------------------------------Linked list --------------------------------------------------*/

  public class LinkedList{
    Node head;
    
    public LinkedList(){
      this.head= null;
    }
    
    void addNode(Node newNode){
      
      if(head == null){
        head = newNode;
        return;
      }
      Node current = head;
      while(current.next!=null){
         current = current.next ;
      }
      
      current.next  = newNode;
    }
    
    boolean linearSearch(int target){
      if(head == null){
        return false;
      }
      Node current = head;
      
      while(current!=null){
        if(current.val == target){
          return true;
        }
        current = current.next;
      }
      
      return false;
    }
}

public class Node{
  int val;
  Node next;
  
  public Node(int val){
    this.val = val;
    this.next = null;
  }
} 

public class Main {
    public static void main(String[] args) {
       Node n1 = new Node(3);
         Node n2 = new Node(5);
           Node n3 = new Node(7);
           
           
           LinkedList list =  new LinkedList();
           list.addNode(n1);
           list.addNode(n2);
           list.addNode(n3);
           Node current = list.head;
           while(current!= null){
             System.out.print(current.val + " ");
             current = current.next;
           }
           
           System.out.print(list.linearSearch(7));
  }
}



