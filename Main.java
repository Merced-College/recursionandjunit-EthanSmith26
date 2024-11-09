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
    
}