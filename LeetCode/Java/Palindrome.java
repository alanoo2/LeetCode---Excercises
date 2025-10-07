// Alan FIgueroa
// 9. Palindrome Number

class Palindrome {
    public boolean isPalindrome(int x) {
        String xInt = String.valueOf(x);    // castea entero a String

        for (int i = 0 ; i < (xInt.length() / 2) ; i++){    // divide entre 2 para en cuanto llegue a mitad no seguir
            if(xInt.charAt(i) != xInt.charAt( xInt.length() - i - 1 ) ){    // compara el numero con inicio o final
                return false;       // si un numero es diferente, termina y regresa false
            }
        }

        return true;    // si no, significa que es palindromo
    }
}