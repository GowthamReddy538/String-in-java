public class Main {
    public static void main(String[] args) {
        String str = "Java is platform independent programming language";
        
        // Convert string to array using split method
        String[] strArray = str.split(" ");  // Split by space
        
        // Print each element of the string array
        for (String word : strArray) {
            System.out.println(word);
        }
    }
}