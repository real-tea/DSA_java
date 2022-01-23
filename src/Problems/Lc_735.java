package Problems;

public class Lc_735 {
    public void main(String[] args) {
        int[] x = {5,10,-5};
        System.out.println(asteroidCollision(x));

    }
    public int[] asteroidCollision(int[] asteroids){
        int[] result = new int[asteroids.length];
        result[0] = asteroids[0];
        for (int i = 1; i < asteroids.length ; i++) {
            if(result[i-1]+asteroids[i]==0)continue;
            if(oppositeSign(result[i-1],asteroids[i]))
            {
                if(Math.abs(result[i-1])>Math.abs(asteroids[i]))
                    result[i - 1] = asteroids[i];
                else{

                }
            }
        }
        return result;
    }
    public boolean oppositeSign(int x, int y){
        return (x<0)?(y>=0):(y<0);
    }
}
