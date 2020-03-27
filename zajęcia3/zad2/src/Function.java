import java.util.ArrayList;
import java.util.List;

public class Function {

    public static int solution(List<Integer> a)
    {
        if(a.size()>1E5) throw new IllegalArgumentException("Zbyt wielka lista!");
        if(a.isEmpty()) throw new IllegalArgumentException("Lista jest pusta!");

        int search = 1;
        for (int i = 0; i < a.size(); i++) {
            if (search == a.get(i)) {
                i = 0;
                search++;
            }
        }
        return search;
    }
}
