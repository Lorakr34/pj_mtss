////////////////////////////////////////////////////////////////////
// Carol Gardin 2147962
// Monika Ullah 2116413
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number){
        if (number < 1 || number > 10) {
            return null; 
        }
        
        StringBuilder roman = new StringBuilder();

        if (number == 10) {
            roman.append("X");
            number = number - 10;
        }
        
        if (number == 9) {
            roman.append("IX");
            number = number - 9;
        }
        
        if (number >= 5){
            roman.append("V");
            number = number - 5;
        }
        
        if(number == 4){
            return "IV";
        }

        while (number >= 1) {
            roman.append("I");
            number = number - 1;
        }
        return roman.toString();
    }
}
