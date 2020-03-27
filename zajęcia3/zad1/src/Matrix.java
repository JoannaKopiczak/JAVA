import java.lang.reflect.Array;
import java.util.Iterator;

public class Matrix<T> implements Iterable<T>{
    Class<T> type;
    T[][] matrix;
    int N;
    int M;


    public Matrix(Class<T> type,int a, int b, T[][] tab) {
        this.type=type;
        this.N=a;
        this.M=b;
        this.matrix = this.getMatrix();
        for(int i=0;i<this.N;i++){
                for(int j=0;j<this.M;j++) {
                    this.matrix[i][j]=tab[i][j];
                }
            }
    }

    public T[][] getMatrix() {
        return (T[][])java.lang.reflect.Array.newInstance(type,N,M);
    }

    public Matrix add(Matrix m1, Class<T> type2)
    {
        
        Matrix newm=new Matrix(type2,m1.N,m1.M,m1.matrix);
        for(int i=0;i<this.N;i++){
            for(int j=0;j<this.M;j++) {


                    if(Integer.class.isAssignableFrom(type2)) {
                        newm.matrix[i][j]=(Integer)this.matrix[i][j]+ (Integer)m1.matrix[i][j];

                    }else if(String.class.isAssignableFrom(type)){
                        newm.matrix[i][j]=(String)this.matrix[i][j]+ (String)m1.matrix[i][j];

                    }else if(Double.class.isAssignableFrom(type)){
                        newm.matrix[i][j]=(Double)this.matrix[i][j]+ (Double)m1.matrix[i][j];

                    }else if(Float.class.isAssignableFrom(type)){
                        newm.matrix[i][j]=(Float)this.matrix[i][j]+ (Float)m1.matrix[i][j];

                    }else if(Character.class.isAssignableFrom(type)){
                        newm.matrix[i][j]=(Character)this.matrix[i][j]+ (Character)m1.matrix[i][j];

                    }
            }
        }
        return newm;
    }

    @Override
    public Iterator<T> iterator() {

        return null;
    }
}
