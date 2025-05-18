public class Swap {
    public static void main(String[] args) {
        //Swap Without Temp Variable
        int a = 5, b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);
    }
}
