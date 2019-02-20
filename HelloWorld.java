public class HelloWorld {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello World");
        }
        else {
            for (String s: args) {
                System.out.println("Hello " + s);
            }
        }
    }
}
