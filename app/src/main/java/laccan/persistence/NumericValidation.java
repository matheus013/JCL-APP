package laccan.persistence;

import org.apache.commons.lang3.StringUtils;

public class NumericValidation extends ValidSample {
    @Override
    public boolean test(String[] record) {
        for (String s : record) {
            if (!StringUtils.isNumeric(s)) return false;
        }
        return true;
    }

    public boolean testWithSize(String[] record, int length) {
        return test(record) && record.length == length;
    }
}