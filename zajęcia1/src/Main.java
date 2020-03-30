import com.sun.jdi.connect.Connector;

import java.util.Scanner; //zaimportowanie

public class Main {
    static Scanner scanner = new Scanner(System.in); //do wpisywania danych

    public static void main(String[] args) {
        double a, b, c;
        int choice; //wybrana liczba do switcha

        while(true){
            System.out.println("Kalkulator pól i obwodów:");
            System.out.println("1.Trojkat");
            System.out.println("2.Kwadrat");
            System.out.println("3.Kolo");
            System.out.println("4.Zamknij kalkulator");



            choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    System.out.print("Podaj bok1 trojkata:");
                    a = scanner.nextDouble();

                    System.out.print("Podaj bok2 trojkata:");
                    b = scanner.nextDouble();

                    System.out.print("Podaj bok3 trojkata:");
                    c = scanner.nextDouble();


                    try {
                        if (a + b < c || a + c < b || b + c < a || a <= 0 || b <= 0 || c <= 0)
                            throw new Exception();

                        Triangle Tr = new Triangle(a, b, c);
                        Tr.print();
                        System.out.println();

                    }catch(Exception e){
                        System.err.println("Dane nie moga być mniejsze od zera!");
                    }

                    break;

                case 2:
                    System.out.println("Podaj bok kwadratu:");
                    a = scanner.nextDouble();
                    try{
                        if(a<=0)
                            throw new Exception();

                        Square Sq = new Square(a);
                        Sq.print();
                        System.out.println();

                    }catch(Exception e) {
                            System.err.println("Dane nie moga być mniejsze od zera!");
                    }
                    break;

                case 3:
                    System.out.println("Podaj promień:");
                    a = scanner.nextDouble();
                    try {
                        if (a <= 0)
                            throw new Exception();

                        Circle Ci = new Circle(a);
                        Ci.print();
                        System.out.println();


                    }catch(Exception e){
                            System.err.println("Dane nie moga być mniejsze od zera!");
                    }
                    break;
                case 4:
                    System.exit(0);

            }
        }
    }
}
