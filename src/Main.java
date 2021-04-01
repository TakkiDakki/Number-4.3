public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum = 1_000_000;

        Object procent;
        int payment = (int) service.calculate(1_000_000, 12,procent 9.99);
        System.out.println(payment);
    }
}
