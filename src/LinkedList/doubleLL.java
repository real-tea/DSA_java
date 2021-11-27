package LinkedList;

public class doubleLL {
    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null)head.prev = node;
        head = node;
    }

    public void Display(){
        Node node = head;
        Node last = null;
        System.out.print("[");
        while(node!=null){
            System.out.print(node.val + " ->");
            last = node;
            node = node.next;
        }
        System.out.print(" Null ]");

        System.out.println("Reversing a linked list : ");
        System.out.println("[");
        while(last != null)
        {
            System.out.println(last.val + "-> ");
            last = last.prev;
        }
        System.out.println(" Null ]");
    }

    private static class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node(int val,Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }


}
