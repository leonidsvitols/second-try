import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeWorkAgain {

    public double principal = 1000;

    @Test
    public void loanSum() {
        // Principal + Interest = Sum to pay
        // Interest = 6%;
        double interest = 6;
        double amount = sumToPay(principal, interest);
        System.out.println("Amount is sum of Principal and Interest");
        System.out.println("Amount is equal: " + amount + ", Principal is equal: " + principal + ", " +
                "Interest is equal: " + interest);
        System.out.println("Special thanks to Hacker for doubles");

    }

    private double sumToPay(double principal, double interest) {
        return (interest / 100 * principal) + principal;

    }

    @Test
    public void symbolCount() {
        String anyString = "underestimated";
        long count = anyString.chars().filter(ch -> ch == 'e').count();
        assertEquals(3, count);

        long count2 = anyString.codePoints().filter(ch -> ch == 'e').count();
        assertEquals(3, count2);

        System.out.println("The count of chars 'e' in a word 'underestimated' is equal: " + count);

    }


}





