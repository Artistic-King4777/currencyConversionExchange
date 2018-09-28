package currency.conversionsCentral;

public class SingaporeDollar extends CurrencyRates{

    /**
     * Converts Singapore Dollar into every other currency
     */

    public SingaporeDollar() {
    }

    public static double singaporeDollarToUSD(double SGD) {
        return getRateOfUSD() * (getRateOfSingaporeDollar() * SGD);
    }

    public static double singaporeDollarToEuro(double SGD) {
        return getRateOfEuro() * (getRateOfSingaporeDollar() * SGD);
    }

    public static double singaporeDollarToBritishPound(double SGD) {
        return getRateOfBritishPound() * (getRateOfSingaporeDollar() * SGD);
    }

    public static double singaporeDollarToIndianRupee(double SGD) {
        return getRateOfIndianRupee() * (getRateOfSingaporeDollar() * SGD);
    }

    public static double singaporeDollarToAustralianDollar(double SGD) {
        return getRateOfAustralianDollar() * (getRateOfSingaporeDollar() * SGD);
    }

    public static double singaporeDollarToCanadianDollar(double SGD) {
        return getRateOfCanadianDollar() * (getRateOfSingaporeDollar() * SGD);
    }

    public static double singaporeDollarToSwissFranc(double SGD) {
        return getRateOfSwissFranc() * (getRateOfSingaporeDollar() * SGD);
    }

    public static double singaporeDollarToMalaysianRinggit(double SGD) {
        return getRateOfMalaysianRinggit() * (getRateOfSingaporeDollar() * SGD);
    }

    public static double singaporeDollarToJapaneseYen(double SGD) {
        return getRateOfJapaneseYen() * (getRateOfSingaporeDollar() * SGD);
    }

    public static double singaporeDollarToChineseYuanRenminbi(double SGD) {
        return getRateOfChineseYuanRenminbi() * (getRateOfSingaporeDollar() * SGD);
    }




}
