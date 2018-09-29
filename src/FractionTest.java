public class FractionTest {
    public static void main(String[] args) {

        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction(1, 2);

        System.out.println(fraction1.toString()+", "+fraction2.toString());

        fraction1.setNumerator(5);
        fraction1.setDenominator(10);

        System.out.println(fraction1.toString()+" + "+fraction2.toString()+" = "+Fraction.addFraction(fraction1, fraction2));
        System.out.println(fraction1.toString()+" - "+fraction2.toString()+" = "+Fraction.subtractFraction(fraction1, fraction2));
        System.out.println(fraction1.toString()+" * "+fraction2.toString()+" = "+Fraction.multiplyFraction(fraction1, fraction2));
        System.out.println(fraction1.toString()+" / "+fraction2.toString()+" = "+Fraction.divideFraction(fraction1, fraction2));
    }
}
