package Backtracking;

public class Queen_permutations {

    static int count = 0;//counter variable to count number of ways queen will be arranged in different boxes

    public static void main(String[] args) {
        QueenPermutation(new boolean[4],0,2,"");

    }
    public static void QueenPermutation(boolean[] boxes,int qpsf, int tq, String ans)//qpsf -> total queens placed
                                                                                        //so far,tq -> total queens
    {
        for (int i = 0; i < boxes.length; i++) {

            if(qpsf == tq){

                count ++;
                System.out.println(count + ". "+ans);
                return;
            }

            if(!boxes[i]){
                boxes[i] = true; //change the value of box to be true if it already has a queen placed in it
                QueenPermutation(boxes, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + ", ");
                boxes[i] = false; //undoing your changes for the queen to be placed in other boxes i.e. Backtracking
            }
        }
    }
}
