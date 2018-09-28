package currency.conversionsCentral;

public class BritishPound extends CurrencyRates{

    /**
     * Converts British Pound into every other currency
     */

    public BritishPound() {
    }

    public static double britishPoundToUSD(double GBP) {
        return getRateOfUSD() * (getRateOfBritishPound() * GBP);
    }

    public static double britishPoundToEuro(double GBP) {
        return getRateOfEuro() * (getRateOfBritishPound() * GBP);
    }

    public static double britishPoundToIndianRupee(double GBP) {
        return getRateOfIndianRupee() * (getRateOfBritishPound() * GBP);
    }

    public static double britishPoundToAustralianDollar(double GBP) {
        return getRateOfAustralianDollar() * (getRateOfBritishPound() * GBP);
    }

    public static double britishPoundToCanadianDollar(double GBP) {
        return getRateOfCanadianDollar() * (getRateOfBritishPound() * GBP);
    }

    public static double britishPoundToSingaporeDollar(double GBP) {
        return getRateOfSingaporeDollar() * (getRateOfBritishPound() * GBP);
    }

    public static double britishPoundToSwissFranc(double GBP) {
        return getRateOfSwissFranc() * (getRateOfBritishPound() * GBP);
    }

    public static double britishPoundToMalaysianRinggit(double GBP) {
        return getRateOfMalaysianRinggit() * (getRateOfBritishPound() * GBP);
    }

    public static double britishPoundToJapaneseYen(double GBP) {
        return getRateOfJapaneseYen() * (getRateOfBritishPound() * GBP);
    }

    public static double britishPoundToChineseYuanRenminbi(double GBP) {
        return getRateOfChineseYuanRenminbi() * (getRateOfBritishPound() * GBP);
    }


}
