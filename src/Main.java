public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int creditsum = 1_000_000;
        double creditpercent = 9.99;


        long monthpaymentoneyear = (long) service.calculate(1_000_000, 1,  9.99);
        System.out.println(monthpaymentoneyear);
        long monthpaymenttwoyear = (long) service.calculate(1_000_000, 2, 9.99);
        System.out.println(monthpaymenttwoyear);
        long monthpaymentthreeyear = (long) service.calculate(1_000_000, 3, 9.99);
        System.out.println(monthpaymentthreeyear);


    }
}
