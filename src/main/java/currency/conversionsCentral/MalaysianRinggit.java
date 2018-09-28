package currency.conversionsCentral;

public class MalaysianRinggit extends CurrencyRates {

    /**
     * Converts Malaysian Ringgit into every other currency
     */

    public MalaysianRinggit() {
    }

    public static double malaysianRinggitToUSD(double MYR) {
        return getRateOfUSD() * (getRateOfMalaysianRinggit() * MYR);
    }

    public static double malaysianRinggitToEuro(double MYR) {
        return getRateOfEuro() * (getRateOfMalaysianRinggit() * MYR);
    }

    public static double malaysianRinggitToBritishPound(double MYR) {
        return getRateOfBritishPound() * (getRateOfMalaysianRinggit() * MYR);
    }

    public static double malaysianRinggitToIndianRupee(double MYR) {
        return getRateOfIndianRupee() * (getRateOfMalaysianRinggit() * MYR);
    }

    public static double malaysianRinggitToAustralianDollar(double MYR) {
        return getRateOfAustralianDollar() * (getRateOfMalaysianRinggit() * MYR);
    }

    public static double malaysianRinggitToCanadianDollar(double MYR) {
        return getRateOfCanadianDollar() * (getRateOfMalaysianRinggit() * MYR);
    }

    public static double malaysianRinggitToSingaporeDollar(double MYR) {
        return getRateOfSingaporeDollar() * (getRateOfMalaysianRinggit() * MYR);
    }

    public static double malaysianRinggitToSwissFranc(double MYR) {
        return getRateOfSwissFranc() * (getRateOfMalaysianRinggit() * MYR);
    }

    public static double malaysianRinggitToJapaneseYen(double MYR) {
        return getRateOfJapaneseYen() * (getRateOfMalaysianRinggit() * MYR);
    }

    public static double swissFrancToChineseYuanRenminbi(double MYR) {
        return getRateOfChineseYuanRenminbi() * (getRateOfMalaysianRinggit() * MYR);
    }

    /*
    select variable to change then
    ctrl f //highlighted blue
    ctrl alt shift j selects everything to change at once
     */

}
