public class Strategy {

    public static void main(String[] args) {
        String s = "Strategy dp is behavior design pattern in which you define a family of algorithms each in a class and make their objects interchangeable."
        System.out.printf("%s%n", s);
    }
}

// Start Strategy DP =============================================================

interface PayStrategy {
    boolean pay(int amount);
    void collectPay();
}

class PaypalPayment inmplents PayStrategy {

    public boolean pay(int amount) {
         System.out.println("Pay via Paypal");
        return true;
    }
    public void collectPay() {
        System.out.println("Collect Paypal payment");
    }
}

class CreditCardPayment inmplents PayStrategy {

    public boolean pay(int amount) {
         System.out.println("Pay via CreditCard Payment");
        return true;
    }
    public void collectPay() {
        System.out.println("Collect CreditCard payment");
    }
}

class PaymentContext {
    private PayStrategy payStrategy;

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void processPay(int amount) {
        if (payStrategy == null) throw new Exception("Null payStrategy");
        payStrategy.pay(amount);
        payStrategy.collectPay();
    }
}

// End Strategy DP =============================================================