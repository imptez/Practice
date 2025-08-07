package design_pattern.com.company.simplefactory.payments;

public class UpiService implements IPaymentsService {
    @Override
    public void makPayment(Double amount) {
        System.out.println("Payment Done through UPI of "+amount);
    }
}
