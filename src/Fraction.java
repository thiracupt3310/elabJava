//elab-source: Fraction.java ====> normal class

/**
 * Created by 708 on 9/13/2018.
 */
public class Fraction {
    private int numerator;
    private int deminator;

    public Fraction(int numerator, int deminator) {
        this.numerator = numerator;
        this.deminator = deminator;
    }

    public Fraction add(Fraction other){
        int q = this.deminator * other.deminator;
        int p = this.numerator * other.deminator + this.deminator * other.numerator;
        return new Fraction(p, q);
    }

    public String toString(){
        return this.numerator + "/" + this.deminator;
    }
}
