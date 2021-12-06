package Problems;

public class RemoveNth_fromBack {
    public ListNode RemoveNthfromEnd(ListNode head , int n)
    {
        ListNode f = head;
        ListNode s = head;
        if(f.next == null){
            return null;
        }

        for(int i = 0; i < n; i++){
            f = f.next;
        }
        if(f == null)return head.next;
        while( f.next != null ){ f = f.next; s = s.next; }
        if(s.next.next != null ) s.next = s.next.next;
        else s.next = null;

        return head;

    }

    private class ListNode{
        ListNode next;
        int val;
        ListNode(){}
        ListNode(int val){this.val = val;}
        ListNode(int val,ListNode next){this.val = val; this.next = next;}


    }

}
