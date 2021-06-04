package exercise_3;

public class QuadraticEquation {
    //private fields for A, B and C
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return (Math.pow(b,2)-(4*a*c));
    }
    public double getRoot1(){
        //if statement to prevent imaginary answers
        if (getDiscriminant()>0) {
            //getting the positive result of the quadratic equation
            return (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        }
        else return 0;
    }
    public double getRoot2(){
        if (getDiscriminant()>0) {
            //getting the positive result of the quadratic equation
            return (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        }
        else return 0;
    }
}
