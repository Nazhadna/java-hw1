package complex;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        if (imag < 0)
            return  "(" + real + imag + "i)";
        else return  "(" + real + "+" + imag + "i)";
    }

    public boolean isReal() {
        if (imag == 0) return true;
        else return false;
    }

    public boolean isImaginary() {
        if (real == 0) return true;
        else return false;
    }

    public boolean equals(double real, double imag) {
        if (this.real==real && this.imag==imag)
            return true;
        else return false;
    }

    public boolean equals(MyComplex myComplex) {
        if (this.real==myComplex.real && this.imag==myComplex.imag)
            return true;
        else return false;
    }

    public  double magnitude() {
        return Math.sqrt(Math.pow(real, 2)+ Math.pow(imag,2));
    }

    public double argument() {
        return Math.atan(real/imag);
    }

    public MyComplex add(MyComplex right) {
        real+=right.real;
        imag+=right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(real+right.real, imag+right.imag);
    }

    public MyComplex subtract(MyComplex right) {
        real-=right.real;
        imag-=right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(real-right.real, imag-right.imag);
    }

    public MyComplex multiply(MyComplex right) {
        real= real*right.real - imag*right.imag;
        imag=real*right.imag + imag*right.real;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        real= (real*right.real + imag*right.imag)/(Math.pow(right.real,2)+Math.pow(right.imag,2));
        imag=(imag*right.real - real*right.imag)/(Math.pow(right.real,2)+Math.pow(right.imag,2));
        return this;
    }

    public MyComplex conjugate() {
        imag = -imag;
        return this;
    }
}
