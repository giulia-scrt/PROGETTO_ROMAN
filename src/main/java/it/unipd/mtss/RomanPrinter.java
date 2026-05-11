////////////////////////////////////////////////////////////////////
// SCARTON GIULIA 2116432
// TONINATO ALESSANDRO 2076446
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        if (romanNumber == null || romanNumber.isEmpty()) {
            return "";
        }

        
        String letters = "IVXLCDM";
        
        String[][] art = {
            {" _____  ", "|_   _| ", "  | |   ", "  | |   ", " _| |_  ", "|_____| "},
            {"__      __ ", "\\ \\    / / ", " \\ \\  / /  ", "  \\ \\/ /   ", "   \\  /    ", "    \\/     "},
            {"__   __ ", "\\ \\ / / ", " \\ V /  ", "  > <   ", " / . \\  ", "/_/ \\_\\ "},
            {" _       ", "| |      ", "| |      ", "| |      ", "| |____  ", "|______| "},
            {"  _____  ", " / ____| ", "| |      ", "| |      ", "| |____  ", " \\_____| "},
            {" _____   ", "|  __ \\  ", "| |  | | ", "| |  | | ", "| |__| | ", "|_____/  "},
            {" __  __  ", "|  \\/  | ", "| \\  / | ", "| |\\/| | ", "| |  | | ", "|_|  |_| "}
        };

        StringBuilder result = new StringBuilder();

        
        for (int riga = 0; riga < 6; riga++) {
            
            
            for (int i = 0; i < romanNumber.length(); i++) {
                
                
                int index = letters.indexOf(romanNumber.charAt(i));
                
                
                if (index != -1) {
                    result.append(art[index][riga]);
                }
            }
            
            
            if (riga < 5) {
                result.append("\n");
            }
        }

        return result.toString();
    }
}