public class Main {
    public static void main(String[] args) {
        String originalString = "madam"; 
        boolean isPalindrome = isPalindrome(originalString);

        if (isPalindrome) {
            System.out.println(originalString + " is a palindrome.");
        } else {
            System.out.println(originalString + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        String reversedString = new StringBuilder(str).reverse().toString();

        return str.equals(reversedString);
    }
}