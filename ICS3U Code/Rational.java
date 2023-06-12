public class Rational {
    private int numerator;
    private int denominator;
    public void setNumerator (int numerator)
    {
        this.numerator = numerator;
    }
    public void setDenominator (int denominator)
    {
        this.denominator = denominator;
    }
    public int getNumerator ()
    {
        return this.numerator;
    }
    public int getDenominator ()
    {
        return this.denominator;
    }
    //constructors
    public Rational()
    {
        this.numerator = 0;
        this.denominator = 1;
    }
    public Rational(int n, int d)
    {
        numerator = n;
        denominator = d;
    }
    public Rational(float f)
    {
        this.numerator = (int)(f*1000);
        this.denominator = 1000;
    }
    //useful methods
    public String tostring() {
        return this.getNumerator()+" / "+this.getDenominator();}
    public void simplify() {
        int min = Math.min(Math.abs(numerator),Math.abs(denominator));
        boolean simplified = false;
        while (!simplified)
        {
            simplified = true;
            for (int i = 2; i<=min;i++)
                if (numerator%i==0 && denominator%i==0)
                {
                    simplified = false;
                    numerator/=i;
                    denominator/=i;
                }
        }
    }
    //negateThis() changes the sign of the rational number
    public void negateThis()
    {
        this.numerator = - this.numerator;
    }
    //oppositeOf() returns the opposite of a given rational number
    public static Rational oppositeOf(Rational r)
    {
        return new Rational(-r.getNumerator(),r.getDenominator());
    }
    //flip() flips the rational number
    public void flipThis()
    {
        int temp = this.denominator;
        this.denominator = this.numerator;
        this.numerator = temp;
    }
    //reciprocalOf() returns the reciprocal of a given rational number
    public static Rational reciprocalOf(Rational r)
    {
        return new Rational(r.getDenominator(),r.getNumerator());
    }
    //addToThis() add r to this rational number
    public void addToThis(Rational r)
    {
        this.setNumerator(this.numerator*r.getDenominator()+this.denominator*r.getNumerator());
        this.setDenominator(this.denominator*r.getDenominator());
        this.simplify();
    }
    //add() returns the sum of two given rational numbers
    public static Rational add(Rational r1, Rational r2)
    {
        Rational result = new Rational();
        result.setNumerator(r1.getNumerator()*r2.getDenominator()+r2.getNumerator()*r1.getDenominator());
        result.setDenominator(r1.getDenominator()*r2.getDenominator());
        result.simplify();
        return result;
    }
}
