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
        else
        {
           while (i < number.length())
           {
               if (number.charAt(i) == '.')
               {
                   return ("Warning dot");
               }
               i++;
           }
           String[] tab = number.split(",");
           return Integer.toString(Integer.parseInt(tab[0]) + Integer.parseInt(tab[1]));
        }
    }
}
