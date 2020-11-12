import org.junit.jupiter.api.Test;



public class MyFirstTest {
    private int goalVar = 10;
    // variable for all the methods in the class
    /*
    this way I can write a poem
    making several lines
    and it will be comments still

    Ctrl + Slash on he line makes comment or disable comment

     */

    @Test // annotation
    public void firsTest() {
        System.out.println("Hello, corona, f*ck off!");
      int sum = sumTwoDigits(15, 20);
      // var only in this method
        System.out.println("End the sum is: " + sum + " v nature");
        System.out.println(sumTwoDigits(3, 8));
    }
    private int sumTwoDigits (int a, int b) {
        int c = a + b;
        return c;

    }

}
