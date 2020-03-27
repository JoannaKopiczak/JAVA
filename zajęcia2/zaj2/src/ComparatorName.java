import  java.util.Comparator;
public class ComparatorName implements Comparator<Item> {


   @Override
   public int compare(Item item, Item t1) {
       return item.nazwa.compareTo( t1.nazwa);
   }
}

