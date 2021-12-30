package Backtracking;

public class Queen_combinations {
    static int count = 0;

    public static void main(String[] args) {
        QueenCombinations(new boolean[4],0,2,"",-1);

    }

    public static void QueenCombinations(boolean [] boxes,int qpsf,int tq,String ans, int lastboxused) {
        if(tq == qpsf){
            System.out.println(count + ". "+ans);
            count++;
            return;
        }
        for (int i = lastboxused; i < boxes.length; i++) {
            if(!boxes[i]){
                boxes[i] = true;
                QueenCombinations(boxes,qpsf+ 1,tq,ans + "q" + qpsf + "b" + i + ",", i) ;
                boxes[i] = false;
            }
        }

    }
}
