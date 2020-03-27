import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        FulfillmentCenter sklep = new FulfillmentCenter("ciuchy",new ArrayList<Item>(),100);
//zad 1
        sklep.addProduct(new Item("p1",ItemCondition.NEW,3,6));
        sklep.addProduct(new Item("p2",ItemCondition.REFURBISHED,8,2));
        sklep.addProduct(new Item("d3",ItemCondition.USED,10,4));
//zad 2
     /*
        Item usun=new Item("p2",ItemCondition.REFURBISHED,8,4);
        sklep.getProduct(usun);
        sklep.getProduct(usun);
        sklep.getProduct(usun);
        sklep.getProduct(usun);
        sklep.getProduct(usun);
     */
//zad 3
/*
        Item usun=new Item("p2",ItemCondition.REFURBISHED,8,4);
        sklep.removeProduct(usun);
        sklep.removeProduct(usun);
*/
//zad 4
        /*
        Item a=sklep.search("p2");
        System.out.println(a.nazwa);
        */
//zad 5
   /*     List<Item> nowa2 = new ArrayList<Item>();
       nowa2= sklep.searchPartial("p");
        for(int i=0;i<nowa2.size();i++) {
            System.out.println(nowa2.get(i).nazwa);
        }

    */
//zad 6
     /*   int ile=sklep.countByCondition(ItemCondition.REFURBISHED);
         System.out.println(ile);
    */
//zad 7
     /*
        sklep.summary();
     */
//zad 8
       /*
        List<Item> a = new ArrayList<Item>();
        a=sklep.sortByName();
        for(int i=0;i<a.size();i++) {
            System.out.println(a.get(i).nazwa);
        }

        */
//zad 9
      /*
        List<Item> a = new ArrayList<Item>();
        a=sklep.sortByAmount();
        for(int i=0;i<a.size();i++) {
            System.out.println(a.get(i).nazwa);
        }
    */
//zad 10
    /*
        Item najwiekszailosc=sklep.max();
        System.out.println(najwiekszailosc.nazwa);
    */
// zad Obiekt FulfillmentContainer
        /*
        FulfillmentCenterContainer fcc=new FulfillmentCenterContainer();
        fcc.addCenter("k1",5);  //dodawanie
        fcc.addCenter("k2",10);
        fcc.addCenter("k3",20);
        fcc.addCenter("k4",100);
        fcc.summary();
        System.out.println();
        // scanner.nextLine();
        fcc.removeCenter("k2"); //usuwanie
        fcc.summary();
        //ze względu na to że tworzymy nowe ffc każdy wynik będzie równy 0%
    */
    }
}
