package currency.conversionsCentral;

public class Euro extends CurrencyRates {



    /**
     * Converts Euro into every other currency
     */

    public Euro() {
    }

    public static double euroToUSD(double EUR) {
        return getRateOfUSD() * (getRateOfEuro() * EUR);
    }

    public static double euroToBritishPound(double EUR) {
        return getRateOfBritishPound() * (getRateOfEuro() * EUR);
    }

    public static double euroToIndianRupee(double EUR) {
        return getRateOfIndianRupee() * (getRateOfEuro() * EUR);
    }

    public static double euroToAustralianDollar(double EUR) {
        return getRateOfAustralianDollar() * (getRateOfEuro() * EUR);
    }

    public static double euroToCanadianDollar(double EUR) {
        return getRateOfCanadianDollar() * (getRateOfEuro() * EUR);
    }

    public static double euroToSingaporeDollar(double EUR) {
        return getRateOfSingaporeDollar() * (getRateOfEuro() * EUR);
    }

    public static double euroToSwissFranc(double EUR) {
        return getRateOfSwissFranc() * (getRateOfEuro() * EUR);
    }

    public static double euroToMalaysianRinggit(double EUR) {
        return getRateOfMalaysianRinggit() * (getRateOfEuro() * EUR);
    }

    public static double euroToChineseYuanRenminbi(double EUR) {
        return getRateOfChineseYuanRenminbi() * (getRateOfEuro() * EUR);
    }

}
