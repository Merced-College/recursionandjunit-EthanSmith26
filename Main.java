// Ethan Smith
// 11/06/24
// Recursion and JUnit Tests

public class Main{
    public static void main(String[] args){

    }
    
    public static int count8(int n){
        // Base Case
        if(n == 0){
            return n; 
        }

        // Check the rightmost digit
        int rightmost = n % 10; 

        // Check next digit to the left
        int nextDigit = (n / 10) % 10; 

        // If rightmost digit is 8
        if(rightmost == 8){
            if(nextDigit == 8){
                // Double count if both digits are 8
                return 2 + count8(n / 10);
            }
            else{
                // Single count if it is just one 8
                return 1 + count8(n / 10);
            }
        }

        // If no 8's continue recursion with remaining numbers
        return count8(n / 10); 

    }

    public static int countHi(String str){
        // Base Case
        if(str.length() < 2){
            return 0; 
        }

        // If str starts with "hi"
        if(str.startsWith("hi")){
            // Increment by 1 and call method skipping first 2 indicies
            return 1 + countHi(str.substring(2)); 
        } 
        else{
            // Move to next character
            return countHi(str.substring(1));
        }
    }

    public static int countHi2(String str){
        // Base Case
        if (str.length() < 2){
            return 0;
        }
    
        // If the string starts with "hi" and it's not preceded by 'x'
        if (str.startsWith("hi") && (str.length() < 3 || str.charAt(0) != 'x')){
            return 1 + countHi2(str.substring(2)); // Skip over the "hi" after counting
        } 
    
        // If the string starts with 'x', skip the 'x' and continue
        if (str.startsWith("x") && str.length() >= 3 && str.charAt(1) == 'h' && str.charAt(2) == 'i'){
            return countHi2(str.substring(3)); // Skip over "xhi"
        }
    
        // Continue to the next character if "hi" is not found
        return countHi2(str.substring(1));
    }    

    public static int strCount(String str, String sub){
        // Base Case
        if(str.length() < sub.length()){
            return 0;
        }

        // If str starts with sub
        if(str.startsWith(sub)){
            return 1 + strCount(str.substring(sub.length()), sub);
        }

        // Else continue searching
        return strCount(str.substring(1), sub);
    }
    
}