// Alan Figueroa
// LeetCode Problem 14: Longest Common Prefix

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";

        for (int j = 0; j < strs[0].length(); j++) {
            char c = strs[0].charAt(j); // caracter que compara mas adelante
            for (int i = 1; i < strs.length; i++) {
                if (j >= strs[i].length() || strs[i].charAt(j) != c) {  // si caracter de la siguiente string es != a el del caracter guardado  (c) 
                return prefix; // si si, rompe cuando no hay coincidencia
                }
            }   
        prefix += c;    // concatena con el prefijo
        }

        return prefix;
    }
}