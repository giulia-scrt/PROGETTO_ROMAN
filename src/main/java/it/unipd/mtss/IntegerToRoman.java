////////////////////////////////////////////////////////////////////
// SCARTON GIULIA 2116432
// TONINATO ALESSANDRO 2076446
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number <= 0 || number > 20) {
            throw new IllegalArgumentException("Number must be between 1 and 20");
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
    if (number>=6 && number <= 8) return "V"+IntegerToRoman.convert(number-5);
    if (number==9) return "IX";
    if (number>=10 && number<=19) return "X"+IntegerToRoman.convert(number-10);
    if (number==20) return "XX";
    return "";
  }
}
