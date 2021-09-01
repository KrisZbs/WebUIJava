package Lesson4;

public class Triangle {
    int a;
    int b;
    int c;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int TriangleSqr() {
       int HalfP = (getA()+getB()+getC())/2;

        return (int) Math.sqrt(HalfP * (HalfP - a) * (HalfP - b) * (HalfP - c));

    }


}






