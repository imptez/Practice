package design_pattern.com.company.simplefactory.payments;

public class PayPalService implements IPaymentsService {

    @Override
    public void makPayment(Double amount) {
        System.out.println("Payment Done through Paypal of "+amount);
    }
}
