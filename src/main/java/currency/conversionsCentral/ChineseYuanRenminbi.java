package currency.conversionsCentral;

public class ChineseYuanRenminbi extends CurrencyRates {

    /**
     * Converts Chinese Yuan Renminbi into every other currency
     */

    public ChineseYuanRenminbi() {
    }

    public static double chineseYuanRenminbiToUSD(double CNY) {
        return getRateOfUSD() * (getRateOfChineseYuanRenminbi() * CNY);
    }

    public static double chineseYuanRenminbiToEuro(double CNY) {
        return getRateOfEuro() * (getRateOfChineseYuanRenminbi() * CNY);
    }

    public static double chineseYuanRenminbiToBritishPound(double CNY) {
        return getRateOfBritishPound() * (getRateOfChineseYuanRenminbi() * CNY);
    }

    public static double chineseYuanRenminbiToIndianRupee(double CNY) {
        return getRateOfIndianRupee() * (getRateOfChineseYuanRenminbi() * CNY);
    }

    public static double chineseYuanRenminbiToAustralianDollar(double CNY) {
        return getRateOfAustralianDollar() * (getRateOfChineseYuanRenminbi() * CNY);
    }

    public static double chineseYuanRenminbiToCanadianDollar(double CNY) {
        return getRateOfCanadianDollar() * (getRateOfChineseYuanRenminbi() * CNY);
    }

    public static double chineseYuanRenminbiToSingaporeDollar(double CNY) {
        return getRateOfSingaporeDollar() * (getRateOfChineseYuanRenminbi() * CNY);
    }

    public static double chineseYuanRenminbiToSwissFranc(double CNY) {
        return getRateOfSwissFranc() * (getRateOfChineseYuanRenminbi() * CNY);
    }

    public static double chineseYuanRenminbiToMalaysianRinggit(double CNY) {
        return getRateOfMalaysianRinggit() * (getRateOfChineseYuanRenminbi() * CNY);
    }

    public static double chineseYuanRenminbiToJapaneseYen(double CNY) {
        return getRateOfJapaneseYen() * (getRateOfChineseYuanRenminbi() * CNY);
    }

}
