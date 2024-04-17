import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestPrimeChecker {
    PrimeChecker primeChecker = new PrimeChecker();

    @Test
    public void testPrimeNumber() {
        assertEquals("2 là số nguyên tố.", primeChecker.checkPrime(2));
        assertEquals("3 là số nguyên tố.", primeChecker.checkPrime(3));
        assertEquals("5 là số nguyên tố.", primeChecker.checkPrime(5));
        assertEquals("7 là số nguyên tố.", primeChecker.checkPrime(7));
        assertEquals("11 là số nguyên tố.", primeChecker.checkPrime(11));
        assertEquals("13 là số nguyên tố.", primeChecker.checkPrime(13));
    }

    @Test
    public void testNonPrimeNumber() {
        assertEquals("1 không là số nguyên tố.", primeChecker.checkPrime(1));
        assertEquals("4 không là số nguyên tố.", primeChecker.checkPrime(4));
        assertEquals("6 không là số nguyên tố.", primeChecker.checkPrime(6));
        assertEquals("8 không là số nguyên tố.", primeChecker.checkPrime(8));
        assertEquals("9 không là số nguyên tố.", primeChecker.checkPrime(9));
        assertEquals("10 không là số nguyên tố.", primeChecker.checkPrime(10));
    }

    @Test
    public void testEdgeCases() {
        assertEquals("0 không là số nguyên tố.", primeChecker.checkPrime(0));
        assertEquals("-1 không là số nguyên tố.", primeChecker.checkPrime(-1));
        assertEquals("-2 không là số nguyên tố.", primeChecker.checkPrime(-2));
    }
}
