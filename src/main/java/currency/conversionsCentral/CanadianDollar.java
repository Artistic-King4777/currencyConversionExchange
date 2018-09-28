package currency.conversionsCentral;

public class CanadianDollar extends CurrencyRates{

    /**
     * Converts Canadian Dollar into every other currency
     */

    public CanadianDollar() {
    }

    public static double candianDollarToUSD(double CAD) {
        return getRateOfUSD() * (getRateOfCanadianDollar() * CAD);
    }

    public static double candianDollarToEuro(double CAD) {
        return getRateOfEuro() * (getRateOfCanadianDollar() * CAD);
    }

    public static double canadianDollarToBritishPound(double CAD) {
        return getRateOfBritishPound() * (getRateOfAustralianDollar() * CAD);
    }

    public static double canadianDollarToIndianRupee(double CAD) {
        return getRateOfIndianRupee() * (getRateOfCanadianDollar() * CAD);
    }

    public static double canadianDollarToAustralianDollar(double CAD) {
        return getRateOfAustralianDollar() * (getRateOfCanadianDollar() * CAD);
    }

    public static double canadianDollarToSingaporeDollar(double CAD) {
        return getRateOfSingaporeDollar() * (getRateOfCanadianDollar() * CAD);
    }

    public static double canadianDollarToSwissFranc(double CAD) {
        return getRateOfSwissFranc() * (getRateOfCanadianDollar() * CAD);
    }

    public static double canadianDollarToMalaysianRinggit(double CAD) {
        return getRateOfMalaysianRinggit() * (getRateOfCanadianDollar() * CAD);
    }

    public static double canadianDollarToJapaneseYen(double CAD) {
        return getRateOfJapaneseYen() * (getRateOfCanadianDollar() * CAD);
    }

    public static double canadianDollarToChineseYuanRenminbi(double CAD) {
        return getRateOfChineseYuanRenminbi() * (getRateOfAustralianDollar() * CAD);
    }



}
