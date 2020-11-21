package sr.unasat.atm.util;

import java.text.DecimalFormat;

public class MoneyFormatter {

    private static final String PATTERN = "###,###.###";
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat(PATTERN);

    public static String process( double amount){
     return DECIMAL_FORMAT.format(amount);
    }
}
