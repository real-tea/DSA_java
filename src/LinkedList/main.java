package LinkedList;

public class main {
    public static void main(String[] args) {

        LL list1 = new LL();
        list1.insertFirst(6);
        list1.insertFirst(9);
        list1.insertFirst(7);
        list1.insertFirst(34);
        list1.insertFirst(18);
        list1.insertLast(12);
        list1.insertPos(4,2);
        list1.DeleteFirst();
        list1.Display();
    }
}
