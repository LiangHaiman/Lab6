package lab6;

public class LinearEquation {
	private double a, b, c, d, e, f;
	public LinearEquation (double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // getter
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getD() {
        return d;
    }
    public double getE() {
        return e;
    }
    public double getF() {
        return f;
    }

    // isSolvable·½·¨
    public boolean isSolvable(){
        boolean bool = false;
        if (a * d - b * c != 0){
            bool = true;
        }
        return bool;
    }

    // getXºÍgetY
    public double getX(){
        return (e * d - b * f) / (a * d - b * c);
    }
    public double getY(){
        return (a * f - e * c) / (a * d - b * c);
    }
}