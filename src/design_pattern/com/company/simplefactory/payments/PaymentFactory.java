package design_pattern.com.company.simplefactory.payments;

import java.util.Objects;

public class PaymentFactory {

    public IPaymentsService getPaymentService(String userPaymentChoice) {
    if(Objects.isNull(userPaymentChoice)){
        return null;
    }
    if(userPaymentChoice.equalsIgnoreCase("upi")){
        return new UpiService();
    }else if(userPaymentChoice.equalsIgnoreCase("paypal")){
        return new PayPalService();
    }else if(userPaymentChoice.equalsIgnoreCase("credit card")){
        return new CreditCardService();
    }
    return null;
    }
}
