package test;

import main.StringCalculator;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class UnitTest {
    private static final StringCalculator stringcalculator = new StringCalculator();

    @Test
    public void should_return_zero_if_string_is_empty()
    {
        assertThat(stringcalculator.add(), equalTo("0"));
    }
}
