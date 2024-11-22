public class Main {
    public static void main(String[] args) {
        String originalString = "Gautham Reddy";
        
        StringBuilder reversedString = new StringBuilder(originalString);
        reversedString.reverse();
        
        System.out.println("Reversed String: " + reversedString.toString());
    }
}