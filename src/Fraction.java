public class Fraction {
    private int numerator, denominator;

    public Fraction()
    {
        numerator=0;
        denominator=1;
    }

    public Fraction(int numerator, int denominator)
    {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public String toString()
    {
        return numerator+"/"+denominator;
    }

    public static Fraction addFraction(Fraction fraction1, Fraction fraction2)
    {
        int tempDenominator=fraction1.getDenominator()*fraction2.getDenominator();
        int tempNumerator1, tempNumerator2;

        tempNumerator1=(tempDenominator/fraction1.getDenominator())*fraction1.getNumerator();
        tempNumerator2=(tempDenominator/fraction2.getDenominator())*fraction2.getNumerator();

        Fraction addResult = new Fraction(tempNumerator1+tempNumerator2,tempDenominator);

        return addResult;
    }

    public static Fraction subtractFraction(Fraction fraction1, Fraction fraction2)
    {
        int tempDenominator=fraction1.getDenominator()*fraction2.getDenominator();
        int tempNumerator1, tempNumerator2;

        tempNumerator1=(tempDenominator/fraction1.getDenominator())*fraction1.getNumerator();
        tempNumerator2=(tempDenominator/fraction2.getDenominator())*fraction2.getNumerator();

        Fraction subtractResult = new Fraction(tempNumerator1-tempNumerator2,tempDenominator);

        return subtractResult;
    }

    public static Fraction multiplyFraction(Fraction fraction1, Fraction fraction2)
    {
        Fraction multiplyResult = new Fraction(fraction1.getNumerator()*fraction2.getNumerator(), fraction1.getDenominator()*fraction2.getDenominator());

        return multiplyResult;
    }

    public static Fraction divideFraction(Fraction fraction1, Fraction fraction2)
    {
        Fraction divideResult = new Fraction(fraction1.getNumerator()*fraction2.getDenominator(), fraction1.getDenominator()*fraction2.getNumerator());

        return divideResult;
    }

    public void setNumerator(int numerator)
    {
        this.numerator=numerator;
    }

    public int getNumerator()
    {
        return numerator;
    }

    public void setDenominator(int denominator)
    {
        this.denominator=denominator;
    }

    public int getDenominator()
    {
        return denominator;
    }
}
