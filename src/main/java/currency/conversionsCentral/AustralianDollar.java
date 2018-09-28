package currency.conversionsCentral;

public class AustralianDollar extends CurrencyRates {

    /**
     * Converts Australian Dollar into every other currency
     */

    public AustralianDollar() {
    }

    public static double australianDollarToUSD(double AUD) {
        return getRateOfUSD() * (getRateOfAustralianDollar() * AUD);
    }

    public static double australianDollarToEuro(double AUD) {
        return getRateOfEuro() * (getRateOfAustralianDollar() * AUD);
    }

    public static double australianDollarToBritishPound(double AUD) {
        return getRateOfBritishPound() * (getRateOfAustralianDollar() * AUD);
    }

    public static double australianDollarToIndianRupee(double AUD) {
        return getRateOfIndianRupee() * (getRateOfAustralianDollar() * AUD);
    }

    public static double australianDollarToCanadianDollar(double AUD) {
        return getRateOfCanadianDollar() * (getRateOfAustralianDollar() * AUD);
    }

    public static double australianDollarToSingaporeDollar(double AUD) {
        return getRateOfSingaporeDollar() * (getRateOfAustralianDollar() * AUD);
    }

    public static double australianDollarToSwissFranc(double AUD) {
        return getRateOfSwissFranc() * (getRateOfAustralianDollar() * AUD);
    }

    public static double australianDollarToMalaysianRinggit(double AUD) {
        return getRateOfMalaysianRinggit() * (getRateOfAustralianDollar() * AUD);
    }

    public static double australianDollarToJapaneseYen(double AUD) {
        return getRateOfJapaneseYen() * (getRateOfAustralianDollar() * AUD);
    }

    public static double australianDollarToChineseYuanRenminbi(double AUD) {
        return getRateOfChineseYuanRenminbi() * (getRateOfAustralianDollar() * AUD);
    }

}
