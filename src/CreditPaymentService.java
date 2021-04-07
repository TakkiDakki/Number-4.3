public class CreditPaymentService {
    public float calculate(long creditsum, int paymentyear, double creditpercent) {

        int creditPeriod = paymentyear * 12;
        long monthpayment = (long) ((long) creditsum * (creditpercent + (creditpercent / (1 + creditpercent) * paymentyear - 1)));
        return monthpayment;

    }

      }
