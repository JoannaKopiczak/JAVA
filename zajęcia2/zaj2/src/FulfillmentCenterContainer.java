import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;

public class FulfillmentCenterContainer {

    Map<String, FulfillmentCenter> mapa = new TreeMap<>();

    void addCenter(String nazwaMagazynuklucz, double max_masa) {


        FulfillmentCenter wartosc = new FulfillmentCenter(nazwaMagazynuklucz, new ArrayList<Item>(), max_masa);//tworzenie nowego magazynu

        mapa.put(nazwaMagazynuklucz, wartosc);//dodanie nowego magazynu do Containera

    }
    void removeCenter(String nazwaMagazynuklucz) {
        mapa.remove(nazwaMagazynuklucz);
    }
    void summary()
    {

        for(Map.Entry tempffc :mapa.entrySet()) // przechodzimy po rekordach mapy(po kolejnych klucz-wartosc)
        {
            if (mapa.get(tempffc.getKey()).lista.size() == 0) //jeżeli w naszym tymczasowym rekordzie w mapie rozmiar listy kluczy(klucz jest typu ffc) jest równy 0
            {
                System.out.println(tempffc.getKey() + ": 0%"); // brak Itemów w magazynie
            } else {
                double licznik = 0;

                for (Item item : mapa.get(tempffc.getKey()).lista) // przechodzimy po liscie liscie kluczy danego rekordu
                {
                    licznik += (item.masa * item.ilosc);
                }

                double licznik_procent = (licznik / mapa.get(tempffc.getKey()).max_masa) * 100;

                System.out.println(tempffc.getKey() + "-" + licznik_procent + "%");
            }
        }

    }
}
