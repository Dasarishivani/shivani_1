public class main {
    static void recursiveMethod() {
        recursiveMethod(); // This will cause a StackOverflowError
    }
    public static void main(String[] args) {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) { 
            System.out.println("Stack overflow error occurred");
        }
        System.out.println("This block will execute after handling the error");
    }
}