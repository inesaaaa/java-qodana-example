public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Qodana!");
    }

    // Example method with poor code practices to test Qodana warnings
    public void sampleMethod() {
        int x = 5; // Unused variable
        System.out.println("This is a sample method)");
    }
}