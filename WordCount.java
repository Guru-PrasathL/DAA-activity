public class WordCount {
    public static void main(String[] args) {
        String str = "Java is fun to learn";
        String[] words = str.trim().split("\\s+");
        System.out.println("Word Count: " + words.length);
    }
}
