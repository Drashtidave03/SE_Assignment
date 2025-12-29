interface PaymentGateway {
    boolean processPayment(double amount);
}

class StripeProvider implements PaymentGateway {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing with Stripe: $" + amount);
        return true;
    }
}

class PayPalProvider implements PaymentGateway {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing with PayPal: $" + amount);
        return true;
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        PaymentGateway stripe = new StripeProvider();
        PaymentGateway paypal = new PayPalProvider();

        stripe.processPayment(10.50);
        paypal.processPayment(20.00);
    }
}
