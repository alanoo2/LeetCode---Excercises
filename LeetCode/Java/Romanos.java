// Numero enteros  romanos
// Author: Alan Figueroa

class Romanos {
    public String intToRoman(int num) {
        char[] symbol = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        String numStr = Integer.toString(num);  
        int tam = numStr.length();
        String romanNum = "";

        // vamos recorriendo cada dígito
        int pos = 0;  // índice del dígito actual

        while (tam-- > 0) {   
            char posNum = (String.valueOf(num) ).charAt(pos);   // posNum igual a el numero en posicion pos
            int posNumInt = Character.getNumericValue(posNum);     // castea a int    
            switch (tam) {
                case 0: // unidades
                    if (posNumInt <= 3)
                        romanNum += String.valueOf(symbol[0]).repeat(posNumInt); 
                    else if (posNumInt == 4)
                        romanNum += String.valueOf(symbol[0]) + String.valueOf(symbol[1]); 
                    else if (posNumInt == 5)
                        romanNum += String.valueOf(symbol[1]);
                    else if (posNumInt > 5 && posNumInt < 9)
                        romanNum += String.valueOf(symbol[1]) + String.valueOf(symbol[0]).repeat(posNumInt - 5); 
                    else if (posNumInt == 9)
                        romanNum += String.valueOf(symbol[0]) + String.valueOf(symbol[2]);
                    break;
                case 1: // decenas (usaremos X, L, C)
                    if (posNumInt <= 3)
                        romanNum += String.valueOf(symbol[2]).repeat(posNumInt); 
                    else if (posNumInt == 4)
                        romanNum += String.valueOf(symbol[2]) + String.valueOf(symbol[3]); 
                    else if (posNumInt == 5)
                        romanNum += String.valueOf(symbol[3]);
                    else if (posNumInt > 5 && posNumInt < 9)
                        romanNum += String.valueOf(symbol[3]) + String.valueOf(symbol[2]).repeat(posNumInt - 5); 
                    else if (posNumInt == 9)
                        romanNum += String.valueOf(symbol[2]) + String.valueOf(symbol[4]);
                    break;
                case 2: // centenas (C, D, M)
                    if (posNumInt <= 3)
                        romanNum += String.valueOf(symbol[4]).repeat(posNumInt); 
                    else if (posNumInt == 4)
                        romanNum += String.valueOf(symbol[4]) + String.valueOf(symbol[5]); 
                    else if (posNumInt == 5)
                        romanNum += String.valueOf(symbol[5]);
                    else if (posNumInt > 5 && posNumInt < 9)
                        romanNum += String.valueOf(symbol[5]) + String.valueOf(symbol[4]).repeat(posNumInt - 5); 
                    else if (posNumInt == 9)
                        romanNum += String.valueOf(symbol[4]) + String.valueOf(symbol[6]);
                    break;
                case 3: // millares (M)
                    if (posNumInt <= 3)
                        romanNum += String.valueOf(symbol[6]).repeat(posNumInt); 
                    else if (posNumInt == 4)
                        romanNum += String.valueOf(symbol[6]) + String.valueOf(symbol[5]); 
                    else if (posNumInt == 5)
                        romanNum += String.valueOf(symbol[5]);
                    else if (posNumInt > 5 && posNumInt < 9)
                        romanNum += String.valueOf(symbol[5]) + String.valueOf(symbol[6]).repeat(posNumInt - 5); 
                    else if (posNumInt == 9)
                        romanNum += String.valueOf(symbol[6]) + String.valueOf(symbol[6]);
                    break;
            }
            pos++; // avanzar al siguiente dígito
        }
        return romanNum;
    }
}