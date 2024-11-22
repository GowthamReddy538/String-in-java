public class Main {
    public static void main(String[] args) {
        String originalString = "Hello Babu";
        String stringToInsert = " Vishnu ";
        int position = 6;  

        StringBuilder sb = new StringBuilder(originalString);
        sb.insert(position, stringToInsert);

        System.out.println("Updated String: " + sb.toString());
    }
}