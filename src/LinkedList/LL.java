package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size ++;
    }

    public void insertLast(int val){
        if(tail == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size ++;
    }

    public void insertPos(int val , int pos)
    {
        if(pos == 0)
        {
            insertFirst(val);
            return;
        }
        if(pos == size)
        {
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1;i < pos;i++)
        {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    public void DeleteFirst()
    {
        System.out.println(head.value + " Deleted");
        head = head.next;
        if(head == null)
        {
            tail = null;
        }
        size--;
    }

    public void Display(){
        Node temp = head;
        System.out.print("[ ");
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("Null ");
        System.out.println("]");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value , Node next){
            this.value = value;
            this.next = next;
        }
    }
}
