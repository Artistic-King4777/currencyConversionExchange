package currency.conversionsCentral;

public class CurrencyRates {

    private static double rateOfUSD = 1.00;    //
    private static double rateOfEuro = 0.94;   //
    private static double rateOfBritishPound = 0.82;
    private static double rateOfIndianRupee = 68.32;
    private static double rateOfAustralianDollar = 1.35;
    private static double rateOfCanadianDollar = 1.32;
    private static double rateOfSingaporeDollar = 1.43;
    private static double rateOfSwissFranc = 1.01;
    private static double rateOfMalaysianRinggit = 4.47;
    private static double rateOfJapaneseYen = 115.84;
    private static double rateOfChineseYuanRenminbi = 6.92;


    // TODO - if Cur 1 is .82 and Curr 2 = 1.00
    // TODO - lets say cur 1 is pounds and curr 2 is usd
    // TODO - if curr 2 = $2.00 then cur 1 = 1.64

    //  Conversion Methods:
    //    Method 1:  Cur 2 * (Curr 1 / $input amount) = ur conversion
    //    Method 2: (Cur 2 / Curr 1) * $ input amount) = ur conversion

    public CurrencyRates() {
    }



    public static double getRateOfUSD() {
        return rateOfUSD;
    }

    public static double getRateOfEuro() {
        return rateOfEuro;
    }

    public static double getRateOfBritishPound() {
        return rateOfBritishPound;
    }

    public static double getRateOfIndianRupee() {
        return rateOfIndianRupee;
    }

    public static double getRateOfAustralianDollar() {
        return rateOfAustralianDollar;
    }

    public static double getRateOfCanadianDollar() {
        return rateOfCanadianDollar;
    }

    public static double getRateOfSingaporeDollar() {
        return rateOfSingaporeDollar;
    }

    public static double getRateOfSwissFranc() {
        return rateOfSwissFranc;
    }

    public static double getRateOfMalaysianRinggit() {
        return rateOfMalaysianRinggit;
    }

    public static double getRateOfJapaneseYen() {
        return rateOfJapaneseYen;
    }

    public static double getRateOfChineseYuanRenminbi() {
        return rateOfChineseYuanRenminbi;
    }

    @Override
    public String toString() {
        return "CurrencyRates{" +
                "rateOfUSD=" + rateOfUSD +
                ", rateOfEuro=" + rateOfEuro +
                ", rateOfBritishPound=" + rateOfBritishPound +
                ", rateOfIndianRupee=" + rateOfIndianRupee +
                ", rateOfAustralianDollar=" + rateOfAustralianDollar +
                ", rateOfCanadianDollar=" + rateOfCanadianDollar +
                ", rateOfSingaporeDollar=" + rateOfSingaporeDollar +
                ", rateOfSwissFranc=" + rateOfSwissFranc +
                ", rateOfMalaysianRinggit=" + rateOfMalaysianRinggit +
                ", rateOfJapaneseYen=" + rateOfJapaneseYen +
                ", rateOfChineseYuanRenminbi=" + rateOfChineseYuanRenminbi +
                '}';
    }
}
