package catalog;

import java.util.Arrays;
import java.util.List;

public class Validators {

    private List<String> list;

    public static boolean isBlank(String word) {
        if (word == null || word.trim() == "") {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(List<String> list) {
        if ( list == null || list.size() == 0) {
            return true;
        }
        return false;
    }
}
