package Parse.String.ToInt;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.*;

import java.math.BigInteger;

import static org.junit.Assert.*;

/**
 * @author Vyacheslav Balyk
 * @version 1.0
 */
public class NumberFormatterTest {

    private static final Logger LOG = LogManager.getLogger(NumberFormatterTest.class);

    /**
     * Private variable of class NumberFormatter
     */
    private NumberFormatter numberFormatter;

    @BeforeClass
    public static void beforeClass() {
        LOG.info("NumberFormatter testing started");
    }

    /**
     * Method initiate private variable numberFormatter before each test run
     */
    @Before
    public void init() {
        numberFormatter = new NumberFormatter();
    }

    @Test(timeout = 100)
    public void parseIntWithPlusSymbol() {
        //Можно было написать new BigInteger("250"), но я решил продемонстрировать сравнение именно c числом 250 типа Integer.
        LOG.info("Проверка метода перевода числа из строки \"+250\" в целочисленное число:");
        assertEquals(new BigInteger(Integer.toString(250)), numberFormatter.parseInt("+250"));
    }

    @Test(timeout = 100)
    public void parseIntWithoutSymbols() {
        LOG.info("Проверка метода перевода числа из строки \"100\" в целочисленное число:");
        assertEquals(new BigInteger(Integer.toString(100)), numberFormatter.parseInt("100"));
    }


    @Test(timeout = 100)
    public void parseIntWithMinusSymbol() {
        LOG.info("Проверка метода перевода числа из строки \"-1000\" в целочисленное число:");
        assertEquals(new BigInteger(Integer.toString(-1000)), numberFormatter.parseInt("-1000"));
    }

    @Test(timeout = 100)
    public void parseIntWith2In32Minus1WithSymbolPlus() {
        LOG.info("Проверка метода перевода числа из строки \"+250\" в целочисленное число:");
        assertEquals(new BigInteger("4294967295"), numberFormatter.parseInt("+4294967295"));
    }

    @Test(timeout = 100)
    public void parseIntWithout2In32Minus1WithSymbol() {
        LOG.info("Проверка метода перевода числа из строки \"-42949672954294967295\" в целочисленное число:");
        assertEquals(new BigInteger("-42949672954294967295"), numberFormatter.parseInt("-42949672954294967295"));
    }

    /**
     * <p>Method assigns to a variable numberFormat null,
     * <p>that sends signal to garbage collector to collect unnecessary variable, after each test
     */
    @After
    public void afterTests() {
        numberFormatter = null;
    }

    @AfterClass
    public static void afterClass() {
        LOG.info("NumberFormatter testing ended");
    }

}