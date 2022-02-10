package catalog;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static catalog.Validators.isEmpty;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.platform.commons.util.StringUtils.isBlank;
//import static sun.util.locale.LocaleUtils.isEmpty;

class ValidatorsTest {

    @Test
    public void testIsBlank() {
        assertTrue(isBlank(null));
        assertTrue(isBlank(""));
        assertTrue(isBlank("    "));
        assertFalse(isBlank("a"));
        assertFalse(isBlank("     a       "));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(isEmpty(null));
        assertTrue(isEmpty(Arrays.asList()));
        assertFalse(isEmpty(Arrays.asList("aaa")));
        assertFalse(isEmpty(Arrays.asList("aaa", "bbb")));
    }

}