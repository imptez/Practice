package walmart;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SolutionCards {
    public static void main(String[] args) {

        List<CustomerDTO> customers = new ArrayList<>();

        // Assuming you have a list of customer DTOs
        // Example data population
        CustomerDTO customer1 = new CustomerDTO();
        customer1.setCustomerId(1);
        List<CustomerDTO.CardDetails> cardDetailsList1 = new ArrayList<>();
        cardDetailsList1.add(new CustomerDTO.CardDetails("1234", "success"));
        cardDetailsList1.add(new CustomerDTO.CardDetails("5678", "failure"));
        cardDetailsList1.add(new CustomerDTO.CardDetails("1111", "failure"));
        cardDetailsList1.add(new CustomerDTO.CardDetails("2222", "failure"));
        customer1.setCardDetailsList(cardDetailsList1); CustomerDTO customer2 = new CustomerDTO();
        customer2.setCustomerId(2); List<CustomerDTO.CardDetails> cardDetailsList2 = new ArrayList<>();
        cardDetailsList2.add(new CustomerDTO.CardDetails("9876", "failure"));
        cardDetailsList2.add(new CustomerDTO.CardDetails("3333", "failure"));
        cardDetailsList2.add(new CustomerDTO.CardDetails("8888", "failure"));

        customer2.setCardDetailsList(cardDetailsList2); customers.add(customer1);
        customers.add(customer2);
        // Fetch customers with card status as failure
        List<CustomerDTO> collect = customers.stream()
                .map(customerDTO -> {
                    customerDTO.filterFailedCards();
                    return customerDTO;
                })
                .collect(Collectors.toList());

        // Print the result
        collect.forEach(System.out::println);

    }
}

