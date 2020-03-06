package main;

public class StringCalculator {
    public String add(String number)
    {
        int i = 0;

        //condition who check the length of the input string
        if (number.length() == 0)
        {
            return "0";
        }
        //condition who check the sum with one parameter (return it)
        else if (number.length() == 1)
        {
            return (number);
        }
        //condition who check the sum with two parameters and without dot
        else
        {
           while (i < number.length())
           {
               if (number.charAt(i) == '.')
               {
                   String[] tab = number.split(",");
                   return Double.toString(Double.parseDouble(tab[0]) + Double.parseDouble(tab[1]));
               }
               i++;
           }
           String[] tab = number.split(",");
           return Integer.toString(Integer.parseInt(tab[0]) + Integer.parseInt(tab[1]));
        }
    }
}
