import  java.util.Comparator;
public class ComparatorAmount implements Comparator<Item> {

    @Override
    public int compare(Item item, Item t1) {
        return Integer.compare(item.ilosc, t1.ilosc);
    }
}
