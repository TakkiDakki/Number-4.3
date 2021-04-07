public class CreditPaymentService {
    public long calculate(long creditsum, int paymentyear, double creditpercent) {

        int creditperiod = paymentyear * 12;
        double monthpercent = creditpercent / 100 / 12;

        long monthpayment = (long) ((long) creditsum * (monthpercent * ((1 + monthpercent) * creditperiod) / (((1 + monthpercent) * creditperiod) - 1)));
        return monthpayment;

    }

      }
