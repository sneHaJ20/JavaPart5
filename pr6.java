public class Practical6 {
    public static void main(String[] args) {

        // create primitive types
        int a = 6;
        double b = 2.69;

        // converts into wrapper objects
        Integer aObj = Integer.valueOf(a);
        Double bObj = Double.valueOf(b);

        if (aObj instanceof Integer) {
            System.out.println(" Integer  object is created.");
        }

        if (bObj instanceof Double) {
            System.out.println(" Double object is created.");
        }
    }
}
