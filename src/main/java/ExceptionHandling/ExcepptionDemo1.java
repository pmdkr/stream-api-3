package ExceptionHandling;

public class ExcepptionDemo1 {

    static void main() {
        System.out.println("Exception handling in java");

        //two ways
        //try catch
        //throws keyword

        try {

            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            e.getMessage();
        } finally {
            System.out.println("Finally blocked code executed....");
        }


        System.out.println("Program completed successfully");


    }
}
