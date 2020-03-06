package test;

import main.StringCalculator;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class UnitTest {
    private static final StringCalculator stringcalculator = new StringCalculator();
    public String number = "3.2,2.4";

    @Test
    public void should_return_zero_if_string_is_empty()
    {
        assertThat(stringcalculator.add(number), equalTo("0"));
    }

    @Test
    public void should_return_sum_of_the_string_with_one_parameter()
    {
        assertThat(stringcalculator.add(number), equalTo(number));
    }

    @Test
    public void should_return_sum_of_the_string_with_two_parameters_and_without_dot()
    {
        assertThat(stringcalculator.add(number), equalTo("5"));
    }

    @Test
    public void should_return_sum_of_the_string_with_two_parameters_and_with_dot()
    {
        assertThat(stringcalculator.add(number), equalTo("5.6"));
    }
}
