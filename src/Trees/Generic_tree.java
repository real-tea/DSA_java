package Trees;
import java.util.ArrayList;
import java.util.Scanner;

public class Generic_tree {
    public class Node{
        ArrayList<Node> children;
        int data;
        Node(int data)
        {
            this.data = data;
            this.children = new ArrayList<>();
        }
    }
    private Node root;
    private int size;

    Generic_tree(){
        Scanner s = new Scanner(System.in);
        this.root = takeInput(s , null , 0);
    }

    private Node takeInput(Scanner s , Node parent , int ithdata ){
        if(this.root == null){
            System.out.println("Enter data for root Node");
        }else{
            System.out.println("Enter data for "+ithdata+"th Child");
        }

        int nodedata = s.nextInt();
        Node node = new Node(nodedata);
        this.size++;

        System.out.println("Enter children for "+ithdata+" ");
        int children = s.nextInt();

        for (int i = 0; i < children; i++) {
            Node child = this.takeInput(s , node, i);
            node.children.add(child);
        }

        return node;
    }

}
