import java.util.Random;

public class Exercision {
    public static void start()
    {
        //////////Integer
        Random random = new Random();
        Integer[][] macierz1=new Integer[4][4];
        Integer[][] macierz2=new Integer[4][4];
        for(int i =0; i<4; i++)
        {
            for(int j=0; j<4;j++)
            {
                macierz1[i][j]=random.nextInt()%10;
                macierz2[i][j]=random.nextInt()%10;
            }
        }
        Matrix<Integer> generic1=new Matrix<Integer>(Integer.class, 4,4,macierz1);
        Matrix<Integer> generic2=new Matrix<Integer>(Integer.class,4,4,macierz2);
        System.out.println("składnik: "+ generic1.matrix[2][2]  + " składnik: " + generic2.matrix[2][2]);

        Matrix<Integer> nowa1=generic1.add( generic2,Integer.class);
        Integer spr=macierz1[2][2]+macierz2[2][2];
        System.out.println("wynik: "+ nowa1.matrix[2][2]  + " sprawdzenie: " + spr );

        ////////////////String
        String[][] macierz3=new String[4][4];
        String[][] macierz4=new String[4][4];
        for(int i =0; i<4; i++)
        {
            for(int j=0; j<4;j++)
            {
                macierz3[i][j]="a";
                macierz4[i][j]="b";
            }
        }
        Matrix<String> generic3=new Matrix<String>(String.class, 4,4,macierz3);
        Matrix<String> generic4=new Matrix<String>(String.class,4,4,macierz4);
        System.out.println("składnik: " + generic3.matrix[2][2]  + "  składnik: " + generic4.matrix[2][2] );

        Matrix<String> nowa2=generic3.add( generic4,String.class);
        String spr2=macierz3[2][2]+macierz4[2][2];
        System.out.println("wynik: " + nowa2.matrix[2][2]  + "  sprawdzenie: " +  spr2 );

        //System.out.println(generic3.iterator());
    }
}
