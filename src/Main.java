public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int credit = 1_000_000;
        double creditpercent = 9.99;

        long monthpayment = (long) service.calculate(1_000_000, 12,  9.99);
        System.out.println(monthpayment);
        long monthpayment = (long) service.calculate(1_000_000, 24, 9.99);
        System.out.println(monthpayment);
        long monthpayment = (long) service.calculate(1_000_000, 36, 9.99);
        System.out.println(monthpayment);


    }
}
