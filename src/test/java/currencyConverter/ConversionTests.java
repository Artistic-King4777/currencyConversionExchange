package currencyConverter;

import currency.conversionsCentral.*;
import org.junit.Assert;
import org.junit.Test;


public class ConversionTests {

    @Test
    public void unitedStateDollarToEuroTest() {

        //GIVEN
        double usd = 700;
        double expected = usd * CurrencyRates.getRateOfEuro();
        System.out.println(expected);

        //WHEN
        double actual = USD.dollarToEuro(700.00);
        System.out.println(actual);

        //THEN
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void euroToDollarTest() {

        //GIVEN
        double eur = 700;
        double expected = CurrencyRates.getRateOfUSD() * (CurrencyRates.getRateOfEuro() * eur);
        System.out.println(expected);

        //WHEN
        double actual = Euro.euroToUSD(700.00);
        System.out.println(actual);

        //THEN
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void euroToBritishPoundTest() {

        //GIVEN
        double eur = 700;
        double expected = CurrencyRates.getRateOfBritishPound() * (CurrencyRates.getRateOfEuro() * eur);
        System.out.println(expected);

        //WHEN
        double actual = Euro.euroToBritishPound(700.00);
        System.out.println(actual);

        //THEN
        Assert.assertEquals(expected, actual, 0);
    } // TODO - DONE ALL ABOVE THIS LINE

    @Test
    public void britishPoundToIndianRupeeTest() {

        //GIVEN
        double gbp = 700;
        double expected = CurrencyRates.getRateOfIndianRupee() * (CurrencyRates.getRateOfBritishPound() * gbp);
        System.out.println(expected);

        //WHEN
        double actual = BritishPound.britishPoundToIndianRupee(700.00);
        System.out.println(actual);

        //THEN
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void indianRupeeToCanadianDollarTest() {

        //GIVEN
        double eur = 700;
        double expected = CurrencyRates.getRateOfBritishPound() * (CurrencyRates.getRateOfEuro() * eur);
        System.out.println(expected);

        //WHEN
        double actual = Euro.euroToBritishPound(700.00);
        System.out.println(actual);

        //THEN
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void canadianDollarToSingaporeDollarTest() {

        //GIVEN
        double cad = 700;
        double expected = CurrencyRates.getRateOfSingaporeDollar() * (CurrencyRates.getRateOfCanadianDollar() * cad);
        System.out.println(expected);

        //WHEN
        double actual = CanadianDollar.canadianDollarToSingaporeDollar(700.00);
        System.out.println(actual);

        //THEN
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void singaporeDollarToSwissFrancTest() {

        //GIVEN
        double sgd = 700;
        double expected = CurrencyRates.getRateOfSwissFranc() * (CurrencyRates.getRateOfSingaporeDollar() * sgd);
        System.out.println(expected);

        //WHEN
        double actual = SingaporeDollar.singaporeDollarToSwissFranc(700.00);
        System.out.println(actual);

        //THEN
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void swissFrancToMalaysianRinggitTest() {

        //GIVEN
        double chf = 700;
        double expected = CurrencyRates.getRateOfMalaysianRinggit() * (CurrencyRates.getRateOfSwissFranc() * chf);
        System.out.println(expected);

        //WHEN
        double actual = SwissFranc.swissFrancToMalaysianRinggit(700.00);
        System.out.println(actual);

        //THEN
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void malaysianRinggitToJapaneseYenTest() {

        //GIVEN
        double myr = 700;
        double expected = CurrencyRates.getRateOfJapaneseYen() * (CurrencyRates.getRateOfMalaysianRinggit() * myr);
        System.out.println(expected);

        //WHEN
        double actual = MalaysianRinggit.malaysianRinggitToJapaneseYen(700.00);
        System.out.println(actual);

        //THEN
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void japaneseYenToChineseYuanRenminbiTest() {

        //GIVEN
        double jpy = 700;
        double expected = CurrencyRates.getRateOfChineseYuanRenminbi() * (CurrencyRates.getRateOfJapaneseYen() * jpy);
        System.out.println(expected);

        //WHEN
        double actual = JapaneseYen.japaneseYenToChineseYuanRenminbi(700.00);
        System.out.println(actual);

        //THEN
        Assert.assertEquals(expected, actual, 0);
    }


}
