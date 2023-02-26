package baitap3;



public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }    
    public Fraction add(Fraction f){
        return f.numerator + f.denominator;
    }
    
    public Fraction sub(Fraction f){
        return f;        
    }
    public Fraction mul(Fraction f){
        return f;
    }
}