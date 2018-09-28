package currency.conversionsCentral;

public class JapaneseYen extends CurrencyRates{

    /**
     * Converts Japanese Yen into every other currency
     */

    public JapaneseYen() {
    }

    public static double japaneseYenToUSD(double JPY) {
        return getRateOfUSD() * (getRateOfJapaneseYen() * JPY);
    }

    public static double japaneseYenToEuro(double JPY) {
        return getRateOfEuro() * (getRateOfJapaneseYen() * JPY);
    }

    public static double japaneseYenToBritishPound(double JPY) {
        return getRateOfBritishPound() * (getRateOfJapaneseYen() * JPY);
    }

    public static double japaneseYenToIndianRupee(double JPY) {
        return getRateOfIndianRupee() * (getRateOfJapaneseYen() * JPY);
    }

    public static double japaneseYenToAustralianDollar(double JPY) {
        return getRateOfAustralianDollar() * (getRateOfJapaneseYen() * JPY);
    }

    public static double japaneseYenToCanadianDollar(double JPY) {
        return getRateOfCanadianDollar() * (getRateOfJapaneseYen() * JPY);
    }

    public static double japaneseYenToSingaporeDollar(double JPY) {
        return getRateOfSingaporeDollar() * (getRateOfJapaneseYen() * JPY);
    }

    public static double japaneseYenToSwissFranc(double JPY) {
        return getRateOfSwissFranc() * (getRateOfJapaneseYen() * JPY);
    }

    public static double japaneseYenToMalaysianRinggit(double JPY) {
        return getRateOfMalaysianRinggit() * (getRateOfJapaneseYen() * JPY);
    }

    public static double japaneseYenToChineseYuanRenminbi(double JPY) {
        return getRateOfChineseYuanRenminbi() * (getRateOfJapaneseYen() * JPY);
    }

}
