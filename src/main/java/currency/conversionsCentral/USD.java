package currency.conversionsCentral;

public class USD extends CurrencyRates {

    /**
     * This will convert USD to every other currency
     * COMPLETE
     */


    public USD() {
    }

    // didnt do rateOfEuro * (rateOfUSD * USD) cuz rat of USD is 1
    public static double dollarToEuro(double USD) {
        return USD * getRateOfEuro();
    }

    public static double dollarToBritishPound(double USD) {
        return USD * getRateOfBritishPound();
    }

    public static double dollarToIndianRupee(double USD) {
        return USD * getRateOfIndianRupee();
    }

    public static double dollarToAustralianDollar(double USD) {
        return USD * getRateOfAustralianDollar();
    }

    public static double USDtoCandaianDollar(double USD) {
        return USD * getRateOfCanadianDollar();
    }

    public static double dollarToSingaporeDollar(double USD) {
        return USD * getRateOfSingaporeDollar();
    }

    public static double USDtoSwissFranc(double USD) {
        return USD * getRateOfSwissFranc();
    }

    public static double dollarToMalaysianRinggit(double USD) {
        return USD * getRateOfMalaysianRinggit();
    }

    public static double dollarToJapaneseYen(double USD) {
        return USD * getRateOfJapaneseYen();
    }

    public static double dollarToChineseYuanRenminbi(double USD) {
        return USD * getRateOfChineseYuanRenminbi();
    }



}
