public class Item implements Comparable<Item> {

    public String nazwa;
    public ItemCondition stan;
    public double masa;
    public int ilosc;

    public Item(String a, ItemCondition b, double c, int d){
        this.nazwa=a;
        this.stan=b;
        this.masa=c;
        this.ilosc=d;
    }
    public Item(){
        this.nazwa="brak";
        this.stan=ItemCondition.NEW ;
        this.masa=0;
        this.ilosc=0;
    }

    public void print() {
        System.out.println("Nazwa: "+this.nazwa);
        System.out.println("Stan: "+this.stan);
        System.out.println("Masa: "+this.masa);
        System.out.println("Ilość: "+this.ilosc);
    }
    public int compareTo(Item i){
        return nazwa.compareTo(i.nazwa);
    }
}
