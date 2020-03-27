import java.util.ArrayList;
import java.util.List;

public class Exercise {
    public static void start() {
        Function ex=new Function();
        List<Integer> a = new ArrayList<Integer>();
        a = List.of(1, 3, 6, 4, 1, 2);
        int b = ex.solution(a);
        System.out.println(b);
    }
}