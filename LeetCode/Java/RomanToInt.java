// author.  Alan Figueroa
// 13. Roman to Integer

class RomanToInt {
    public static int countRom(String rom, char symb) {
        int count = 0;
        int index = rom.indexOf(symb);

        while (index != -1) {   // counts symbols to multiply to numbers
            count++;
            index = rom.indexOf(symb, index + 1);
        }

        return count;
    }

    public int romanToInt(String s) {
        int rom = 0;
        char[] symbols = {'I','V','X','L','C','D','M'};
       
        // I    V   X
        if (s.contains("I") ){         
            if (s.contains("IV") ){
                rom += (5-1);
                s = s.replace("IV", "");
            }
            else if (s.contains("IX") ){
                rom += (10-1);
                s = s.replace("IX", "");
            }
            else 
                rom += countRom(s,symbols[0] );
        }   
        
        // X    L   C
        if (s.contains("X") ){ 
            if (s.contains("XL") ){
                rom += (50-10);
                s = s.replace("XL","");
            }
            else if (s.contains("XC") ){
                rom += (100-10);
                s = s.replace("XC","");
            }
            else
                rom += (10*countRom(s,symbols[2]) );
        }   
        
        //  C   D   M
        if (s.contains("C") ){          
            if (s.contains("CD") ){
                rom += (500-100);
                s = s.replace("CD","");
            }    
            else if (s.contains("CM") ){
                rom += (1000-100);
                s = s.replace("CM","");
            }
            else
                rom += (100 * countRom(s,symbols[4]) ); 
        }

        //  M   
        if (s.contains("M") )          
            rom += (1000 * countRom(s,symbols[6]) );

        // V    L   D   
        if (s.contains("V") )
            rom += 5;
        if (s.contains("L") )
            rom += 50;
        if (s.contains("D") )
            rom += 500;
        

        return rom;
    }
}