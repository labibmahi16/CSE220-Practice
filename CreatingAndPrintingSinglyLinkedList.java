public class CreatingAndPrintingSinglyLinkedList{

  public static void main(String[] args) {

        Node n1 = new Node(68);
    
        Node n2 = new Node(28);
    
        Node n3 = new Node(16);
    
        Node n4 = new Node(123);
    
        Node n5 = new Node(71);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Node current = n1;
        while (current != null) {
            System.out.print(current.elem + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

class Node{

    Object elem;
    Node next;

    public Node(Object elem, Node next){
        this.elem = elem;
        this.next = next;
    }
    
    //Overloading
    public Node(Object elem){
        this.elem = elem;
        this.next = null;
    }
}
