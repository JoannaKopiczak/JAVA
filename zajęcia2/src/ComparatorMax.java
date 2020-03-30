import  java.util.Comparator;
public class ComparatorMax implements Comparator<Item> {
    @Override
    public int compare(Item p1, Item p2)
    {
        return Integer.compare(p1.ilosc, p2.ilosc);
    }
}
