public class Main {
    public static void main(String[] args) {
        String str1 = "Gautham";
        String str2 = "Reddy";
        
        System.out.println("Before swap:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        
        str1 = str1 + str2;   // Concatenate both strings
        str2 = str1.substring(0, str1.length() - str2.length());  // Extract the first string
        str1 = str1.substring(str2.length());  // Extract the second string
        
        System.out.println("After swap:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}