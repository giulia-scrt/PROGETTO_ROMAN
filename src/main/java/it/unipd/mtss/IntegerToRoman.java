////////////////////////////////////////////////////////////////////
// SCARTON GIULIA 2116432
// TONINATO ALESSANDRO 2076446
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number <= 0 || number > 6) {
            throw new IllegalArgumentException("Number must be between 1 and 6");
        }
        if(number>=1 && number<=3){
            String ris="";
            for (int i=0; i<number; i++){
                ris=ris+"I";
            }
            return ris;
        }
		if (number==4) return "IV";
		if (number==5) return "V";
		if (number==6) return "VI";
        return "";
    }
}
