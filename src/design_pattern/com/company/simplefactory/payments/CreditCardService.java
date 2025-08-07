package design_pattern.com.company.simplefactory.payments;

public class CreditCardService implements IPaymentsService {
    @Override
    public void makPayment(Double amount) {
        System.out.println("Payment Done through Credit Card of "+amount);
    }
}
