public class Triangle {
    double a , b ,c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static double getArea(double a, double b,double c){
        double p=(a+b+c)/2;
        double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
        }
    }

