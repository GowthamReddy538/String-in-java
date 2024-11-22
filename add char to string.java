public class Main {
    public static void main(String[] args) {
        String originalString = "Hello";
        
        StringBuilder sb = new StringBuilder(originalString);
        sb.append(' ');  
        sb.append('R');  
        sb.append('e');  
        sb.append('d');  
        sb.append('d');  
        sb.append('y');  
        
        String updatedString = sb.toString();
        System.out.println("Updated String: " + updatedString);
    }
}