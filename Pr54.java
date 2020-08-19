public class Pr54
{
    public static void main(String args[])
    {
        double sum = 0;
        double numerator   = 1;
        double denominator = 1;
        double increment   = 1;
        double term = 0;

        for (int i = 1; i <= 100; i++)
        {
            term = numerator/denominator;
            sum = sum + term;

            increment = increment + 2;
            numerator = numerator * i;
            denominator = denominator * increment;

        }
        IBIO.output( "Pi is " + (sum * 2) );

    }
}
// Pi is 3.1415926535897922


