package models;

public class CaesarCipher {
    private static final String LOWER_CASE_TEXT = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER_CASE_TEXT = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMERIC_TEXT    = "0123456789";

    private static char encodeChar(char ch, String text, int shift)
    {
        int index = text.indexOf(ch);
        char retVal = ch;

        if (index > -1)
        {
            index += shift;
            while (index >= text.length())
                index -= text.length();

            while (index < 0)
                index += text.length();

            retVal = text.charAt(index);
        }

        return retVal;
    }

    private static char encodeLowerCase(char ch, int shift)
    {
        return encodeChar(ch, LOWER_CASE_TEXT, shift);
    }

    private static char encodeUpperCase(char ch, int shift)
    {
        return encodeChar(ch, UPPER_CASE_TEXT, shift);
    }

    private static char encodeNumeric(char ch, int shift)
    {
        return encodeChar(ch, NUMERIC_TEXT, shift);
    }

    public static String encodeString(String input, int shift)
    {
        StringBuilder output = new StringBuilder();
        char ch;

        for(int i = 0; i < input.length(); i++)
        {
            ch = input.charAt(i);

            if (Character.isLowerCase(ch))
                ch = encodeLowerCase(ch, shift);
            else if (Character.isUpperCase(ch))
                ch = encodeUpperCase(ch, shift);
            else if (Character.isDigit(ch))
                ch = encodeNumeric(ch, shift);

            output.append(ch);
        }

        return output.toString();
    }


}