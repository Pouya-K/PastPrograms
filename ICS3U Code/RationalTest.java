public class RationalTest {
    public static void main (String[] args)
    {
        Rational r = new Rational();
        r.setNumerator(2);
        r.setDenominator(3);
        System.out.println("Numerator: " + r.getNumerator());
        System.out.println("Denominator: " + r.getDenominator());
    }
}
