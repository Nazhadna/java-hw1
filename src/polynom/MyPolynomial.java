package polynom;

import bookclass.Author;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        String str = new String();

        for (int i = coeffs.length - 1; i > 1; i--) {
            str += coeffs[i] + "x^" + i + "+";
        }

        str += coeffs[1] + "x+" + coeffs[0];

        return str;
    }

    public double evaluate(double x) {
        double res = 0;
        for (int i = coeffs.length - 1; i >= 0; i--) {
            res += coeffs[i] * Math.pow(x, i);
        }
        return res;
    }

    public MyPolynomial add(MyPolynomial right) {

        int smallDegree, bigDegree;
        if (this.getDegree() > right.getDegree()) {
            smallDegree = right.getDegree();
            bigDegree = this.getDegree();
        } else {
            smallDegree = this.getDegree();
            bigDegree = right.getDegree();
        }

        smallDegree++;
        bigDegree++;

        double[] sumCoeffs = new double[bigDegree];

        for (int i = 0; i < smallDegree; i++)
            sumCoeffs[i] = this.coeffs[i] + right.coeffs[i];

        if (this.getDegree() > right.getDegree()) {
            for (int i = smallDegree; i < bigDegree; i++)
                sumCoeffs[i] = this.coeffs[i];
        } else {
            for (int i = smallDegree; i < bigDegree; i++)
                sumCoeffs[i] = right.coeffs[i];
        }

        return new MyPolynomial(sumCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial right) {

        int mulDegree = this.getDegree() + right.getDegree() + 1;
        double[] mulCoeffs = new double[mulDegree];

        for (int i = 0; i < mulDegree; i++)
            mulCoeffs[i] = 0;


        for (int i = 0; i < getDegree() + 1; i++) {
            for (int j = 0; j < right.getDegree() + 1; j++)
                mulCoeffs[i + j] += coeffs[i] * right.coeffs[j];
        }

        return new MyPolynomial(mulCoeffs);
    }
}
