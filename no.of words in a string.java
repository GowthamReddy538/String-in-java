public class Main {
    public static void main(String[] args) {
        String inputString = "Java is platform independent programming language";

        int wordCount = countWords(inputString);

        System.out.println("Number of words: " + wordCount);
    }

    public static int countWords(String str) {
        String[] words = str.trim().split("\\s+");

        if (words.length == 0 || (words.length == 1 && words[0].isEmpty())) {
            return 0;
        }

        return words.length;
    }
}