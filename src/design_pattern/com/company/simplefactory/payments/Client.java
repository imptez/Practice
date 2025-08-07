package design_pattern.com.company.simplefactory.payments;

import java.util.Objects;

public class Client {
    public static void main(String[] args) {
        String userPaymentChoice="PayPal";
        IPaymentsService paymentsService= new PaymentFactory().getPaymentService(userPaymentChoice);
        if(Objects.nonNull(paymentsService)){
            paymentsService.makPayment(100.0);
        }else{
            System.out.println("Invalid payment mode selected");
        }
    }
}
