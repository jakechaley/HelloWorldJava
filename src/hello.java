public class hello {
    public static int doubly(int x) {
        return x * x;
    }
    public static void main(String[] args) {
        // f(x) = x * x;
        // f(5) = 5 * 5;

        int doubled = doubly(5);
        int otherDoubled = doubly(10);
        System.out.println(otherDoubled);
        System.out.println(doubled);

        String name = "Jake";
        char firstInitial = name.charAt(0);
        String lowered = name.toLowerCase();
        System.out.println(firstInitial);
        System.out.println(lowered);
    }
}
