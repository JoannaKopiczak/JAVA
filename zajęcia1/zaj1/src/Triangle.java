public class Triangle {
    private double a; //podstawa
    private double b; //bok1
    private double c; //bok2


    public Triangle(double a, double b, double c){ //konstruktor
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double calculateArea() {
        double p=0.5*(a+b+c);
        double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }

    public double calculatePerimeter(){
        return a+b+c;
    }

    public void print(){
        System.out.println();
        System.out.println("Wyniki dla trojkata:");
        System.out.println("Bok 1="+a);
        System.out.println("Bok 2="+b);
        System.out.println("Bok 3="+c);
        System.out.println("Pole wynosi="+calculateArea());
        System.out.println("Obwod wynosi="+calculatePerimeter());
    }
}
