import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class FulfillmentCenter {
    public String nazwaMagazynu;
    public List<Item> lista = new ArrayList<>();
    public double max_masa;

    FulfillmentCenter(String a, List<Item> b, double c) {
        this.nazwaMagazynu = a;
        this.lista = b;
        this.max_masa = c;
    }
//11111111111111111111111111111111111111111
    void addProduct(Item produkt) {

        double masadodawanychproduktow = 0;
/*
        for (int i = 0; i < lista.size(); i++) { //zliczanie calej masy
            masadodawanychproduktow += (lista.get(i).masa * lista.get(i).ilosc);
        }
*/
        for (Item tymczasowy : lista) { //zliczanie calej masy
            masadodawanychproduktow += (tymczasowy.masa * tymczasowy.ilosc);
        }
        masadodawanychproduktow += (produkt.masa*produkt.ilosc);
        if (masadodawanychproduktow > max_masa) {
            System.err.println("W magazynie nie ma miejsca!");
            return;
        }
        int z = -1;
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).nazwa==produkt.nazwa){z=i;}
        }
        if (z == -1) {
            lista.add(produkt); //jesli takiego nie ma to dodaje
        } else {
            lista.get(z).ilosc += produkt.ilosc; //jesli taki jest to sumuje
        }
    }
//222222222222222222222222222222222222222222
    void getProduct(Item produkt) {  //zmniejsza ilosc o 1

        int z=-1;
        for (int i = 0; i < lista.size(); i++)  {
            if(lista.get(i).nazwa==produkt.nazwa){z=i;}
        }
        if (z == -1) {
                System.out.println("Nie ma takiego");
        } else {
            if (lista.get(z).ilosc > 1) {
                lista.get(z).ilosc -= 1;
                System.out.println("Zmniejszono ilosc produktu o 1");
                System.out.println(lista.get(z).ilosc);


            } else {
                lista.remove(z);
                System.out.println("Zmniejszono ilosc produktu o 1 (brak produktu)");
            }
        }
    }
//3333333333333333333333333333333333333
    void removeProduct(Item produkt){

        int z=-1;
        for (int i = 0; i < lista.size(); i++)  {
            if(lista.get(i).nazwa==produkt.nazwa){
                z=i;
            }
        }

        if(z==-1){
            System.out.println("BRAK TAKIEGO PRODUKTU");
        }else{
            lista.remove(z);
            System.out.println("USUNIĘTO!");
        }
    }
//44444444444444444444444444444444444444444
    Item search(String nazwa) {

        Item nowy=new Item();
        nowy.nazwa=nazwa;
        int id = Collections.binarySearch(lista,nowy,new ComparatorName());
        return lista.get(id);


    }
//555555555555555555555555555555555555555
    List<Item> searchPartial(String czescNazwy)
    {

        List<Item> nowa = new ArrayList<Item>();
        for (Item item1: lista)
        {
            if(item1.nazwa.contains(czescNazwy))
            {
                nowa.add(item1);
            }
        }

        return nowa;
    }
//66666666666666666666666666666666666
    int countByCondition(ItemCondition s) //ilosc produktow o danym stanie
    {
        int ile=0;
        for(Item i1:lista)
        {
            if(i1.stan==s)
            {
                ile+=i1.ilosc;
            }
        }
        return ile;
    }
//777777777777777777777777777777777777777
    void summary()
    {

        for(Item a:lista)
        {
            a.print();
        }
    }
//888888888888888888888888888888888888
    List<Item> sortByName()
    {
         List<Item> posortowane = new ArrayList<Item>();
         posortowane = lista;
         Collections.sort(posortowane);
         return posortowane;
    }
 //999999999999999999999999999999
    List<Item> sortByAmount() {
        List<Item> posortowana = new ArrayList<Item>();
        posortowana = lista;
        Collections.sort(posortowana, new ComparatorAmount());
        return posortowana;
    }
//101010101010101010101010
    Item max()
    {
        return Collections.max(lista, new ComparatorMax());
    }

}
