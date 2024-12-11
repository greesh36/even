public class Str2 {
    public static void main(String[] args) {
        String s = "nitin";
        String reversed = ""; // Variable to store the reversed string

        // Reverse the string
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }

        // Check if the original string is equal to the reversed string
        if (s.equals(reversed)) { // Use .equals() to compare strings
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
    }
    

