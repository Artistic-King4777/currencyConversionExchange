package currency.conversionsCentral;

public class IndianRupee extends CurrencyRates {

    /**
     * Converts Indian Rupee into every other currency
     */

    public IndianRupee() {
    }

    public static double indianRupeeToUSD(double INR) {
        return getRateOfUSD() * (getRateOfIndianRupee() * INR);
    }

    public static double indianRupeeToEuro(double INR) {
        return getRateOfEuro() * (getRateOfIndianRupee() * INR);
    }

    public static double indianRupeeToBritishPound(double INR) {
        return getRateOfBritishPound() * (getRateOfIndianRupee() * INR);
    }

    public static double indianRupeeToAustralianDollar(double INR) {
        return getRateOfAustralianDollar() * (getRateOfIndianRupee() * INR);
    }

    public static double indianRupeeToCanadianDollar(double INR) {
        return getRateOfCanadianDollar() * (getRateOfIndianRupee() * INR);
    }

    public static double indianRupeeToSingaporeDollar(double INR) {
        return getRateOfSingaporeDollar() * (getRateOfIndianRupee() * INR);
    }

    public static double indianRupeeToSwissFranc(double INR) {
        return getRateOfSwissFranc() * (getRateOfIndianRupee() * INR);
    }

    public static double indianRupeeToMalaysianRinggit(double INR) {
        return getRateOfMalaysianRinggit() * (getRateOfBritishPound() * INR);
    }

    public static double indianRupeeToJapaneseYen(double INR) {
        return getRateOfJapaneseYen() * (getRateOfBritishPound() * INR);
    }

    public static double indianRupeeToChineseYuanReminbi(double INR) {
        return getRateOfChineseYuanRenminbi() * (getRateOfIndianRupee() * INR);
    }

}
