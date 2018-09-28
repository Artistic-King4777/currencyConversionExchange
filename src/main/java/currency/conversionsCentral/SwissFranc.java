package currency.conversionsCentral;

public class SwissFranc extends CurrencyRates {

    /**
     * Converts Swiss Franc into every other currency
     */

    public SwissFranc() {
    }

    public static double swissFrancToUSD(double CHF) {
        return getRateOfUSD() * (getRateOfSwissFranc() * CHF);
    }

    public static double swissFrancToEuro(double CHF) {
        return getRateOfEuro() * (getRateOfSwissFranc() * CHF);
    }

    public static double swissFrancToBritishPound(double CHF) {
        return getRateOfBritishPound() * (getRateOfSwissFranc() * CHF);
    }

    public static double swissFrancToIndianRupee(double CHF) {
        return getRateOfIndianRupee() * (getRateOfSwissFranc() * CHF);
    }

    public static double swissFrancToAustralianDollar(double CHF) {
        return getRateOfAustralianDollar() * (getRateOfSwissFranc() * CHF);
    }

    public static double swissFrancToCanadianDollar(double CHF) {
        return getRateOfCanadianDollar() * (getRateOfSwissFranc() * CHF);
    }

    public static double swissFrancToSingaporeDollar(double CHF) {
        return getRateOfSingaporeDollar() * (getRateOfSwissFranc() * CHF);
    }

    public static double swissFrancToMalaysianRinggit(double CHF) {
        return getRateOfMalaysianRinggit() * (getRateOfSwissFranc() * CHF);
    }

    public static double swissFrancToJapaneseYen(double CHF) {
        return getRateOfJapaneseYen() * (getRateOfSwissFranc() * CHF);
    }

    public static double swissFrancToChineseYuanRenminbi(double CHF) {
        return getRateOfChineseYuanRenminbi() * (getRateOfSwissFranc() * CHF);
    }
}
