import java.util.Arrays;

public class MathUtils {
    public static int additionner(int a,int b){
        return a+b;
    }

    public static int additionner(int[] nombres){
        return  Arrays.stream(nombres).sum();
    }

    public static int soustraire(int a,int b){
        return a-b;
    }

    public static int multiplier(int a,int b){
        return a*b;
    }


    public static int multiplier(int[] nombres){
        return  Arrays.stream(nombres).reduce(1,(a,b)->a*b);
    }
}
