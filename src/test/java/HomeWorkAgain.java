import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeWorkAgain {

    public double principal = 10000;

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

    @Test
    public void loanByMonths() {

        // 10% for first 1 years, 8% for next 10 years, 6% for last 10 years.
        double interest1 = 10;
        double interest2 = 8;
        double interest3 = 6;
        double i = (interest1 / 100 * principal) + (interest2 / 100 * principal)
                + (interest3 / 100 * principal);
        double allsum = sumYear(principal, interest1, interest2, interest3);

        System.out.println("The amount to pay for all period is: " + allsum + ", Principal is equal: " + principal +
                ", Interest is equal: " + i);
    }

    private double sumYear(double principal, double interest1, double interest2, double interest3) {
        return (interest1 / 100 * principal) + (interest2 / 100 * principal)
                + (interest3 / 100 * principal) + principal;

    }
}





