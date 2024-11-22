public class Main {
    public static void main(String[] args) {
        String inputString = "Are you fine now ";
        
        String[] words = inputString.split("\\s+");
        
        System.out.println("Even length words:");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}