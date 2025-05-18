public class VowelCheck {
    public static void main(String[] args) {
        char ch = 'e';
        ch = Character.toLowerCase(ch);
        if ("aeiou".indexOf(ch) != -1)
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}
