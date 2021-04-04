public class CreditPaymentService {
    public float calculate(int credit, int paymentyear, double creditpercent) {
        int year;
        paymentyear = year * 12;



        long monthpayment = (long) ((long) credit * (creditpercent / (1 + creditpercent) - paymentyear - 1));
        return monthpayment;
    }

      }
