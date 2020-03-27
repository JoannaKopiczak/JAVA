import java.util.Random;
import java.util.Scanner; //zaimportowanie
 public class Exercise {
    static Scanner scanner = new Scanner(System.in); //do wpisywania danych
    public static void start()
    {
        Function ex=new Function();
        Random random= new Random();
        int arr[]=new int[10000];
        for(int i=0;i<arr.length;i++){arr[i]=random.nextInt()%10;}
       System.out.println(" Działanie dla optymistycznego(wcisnij 1), pesymistycznego(wcisnij 2) i realistycznego przypadku(else int)");

            int number = scanner.nextInt();

                switch (number) {
                    case 1:
                        ex.sort1(arr);
                        break; // sortujemy którymkolwiek sposobem
                    case 2:
                        ex.pesymistic(arr);
                        break; //sortujemy odwrotnie
                }
                System.out.println("1 - bubblesort\n" +
                        "2 - selectionsort\n" +
                        "3 - combsort\n" +
                        "4 - quicksort\n" +
                        "5 - heapsort");

        int number1 = scanner.nextInt();
        switch (number1) {
            case 1:
                long tStart1 = System.currentTimeMillis();
                ex.sort1(arr);
                long tEnd1 = System.currentTimeMillis();
                long tDelta1 = tEnd1 - tStart1;
                double elapsedSeconds1 = tDelta1 / 1000.0;
                System.out.println("BubbleSort");
                System.out.println(elapsedSeconds1);
                break;
            case 2:
                long tStart2 = System.currentTimeMillis();
                ex.sort2(arr);
                long tEnd2 = System.currentTimeMillis();
                long tDelta2 = tEnd2 - tStart2;
                double elapsedSeconds2 = tDelta2 / 1000.0;
                System.out.println("SelectionSort");
                System.out.println(elapsedSeconds2);
                break;
            case 3:
                long tStart3 = System.currentTimeMillis();
                ex.sort3(arr);
                long tEnd3 = System.currentTimeMillis();
                long tDelta3 = tEnd3 - tStart3;
                double elapsedSeconds3 = tDelta3 / 1000.0;
                System.out.println("CombSort");
                System.out.println(elapsedSeconds3);
                break;
            case 4:
                long tStart4 = System.currentTimeMillis();
                ex.sort4(arr,0, arr.length-1);
                long tEnd4 = System.currentTimeMillis();
                long tDelta4 = tEnd4 - tStart4;
                double elapsedSeconds4 = tDelta4 / 1000.0;
                System.out.println("QuickSort");
                System.out.println(elapsedSeconds4);
                break;
            case 5:
                long tStart5 = System.currentTimeMillis();
                ex.sort5(arr);
                long tEnd5 = System.currentTimeMillis();
                long tDelta5 = tEnd5 - tStart5;
                double elapsedSeconds5 = tDelta5 / 1000.0;
                System.out.println("HeapSort");
                System.out.println(elapsedSeconds5);
                break;
        }

    }
}
