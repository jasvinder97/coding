package Practice;

public class ExceptionHandling {
    public static void main(String[] args) {
        String a = "good";
        String b = "good";
        System.out.println(a.equals(b));
        String c = new String(a);
        System.out.println(a.equals(c));
        System.out.println(a == c);
    }

    private static void exceptionHandlingEg() {
        System.out.println("Main");
        try {
            System.out.println("Try");
//            throw new RuntimeException("Exception");
        } catch (Exception e) {
            System.out.println("Catch");
        } finally {
            System.out.println("Finally");
        }
        System.out.println("End");
    }
}
