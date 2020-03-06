package test;

import main.StringCalculator;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class UnitTest {
    private static final StringCalculator stringcalculator = new StringCalculator();
    public String number = "3";
    public String number_to_add = "1";
    public String addition = number + "," + number_to_add;

    @Test
    public void should_return_zero_if_string_is_empty()
    {
        assertThat(stringcalculator.add(number), equalTo("0"));
    }

    @Test
    public void should_return_sum_of_the_string_with_one_paramater()
    {
        assertThat(stringcalculator.add(number), equalTo(number));
    }

    @Test
    public void should_return_sum_of_the_string_with_two_paramaters_and_without_dot()
    {
        assertThat(stringcalculator.add(addition), equalTo(Integer.toString(Integer.parseInt(number) + Integer.parseInt(number_to_add))));
    }
}
