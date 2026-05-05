////////////////////////////////////////////////////////////////////
// Carol Gardin 2147962
// Monika Ullah 2116413
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number){
        if (number < 1 || number > 11) {
            return null; 
        }
        
        StringBuilder roman = new StringBuilder();

        //Monika - numeri dispari
        if (number == 9){
            return "IX";
        }

        if (number == 11){
            return "XI";
        }

        if (number >= 5){
            roman.append("V");
            number = number - 5;
        }

        while (number >= 1) {
            roman.append("I");
            number = number - 1;
        }
        return roman.toString();
    }
}
