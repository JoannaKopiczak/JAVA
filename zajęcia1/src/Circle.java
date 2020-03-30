public class Circle extends Figure implements Print {

    private double r;

    Circle(double r){
        this.r=r;
    }

    public double calculateArea(){
        return Math.PI*(r*r);
    }

    public double calculatePerimeter(){
        return 2*Math.PI*r;
    }

    public void print(){
        System.out.println("Wyniki dla koła");
        System.out.println("Promien="+r);
        System.out.println("Pole="+calculateArea());
        System.out.println("Obwod="+calculatePerimeter());
    }

}


