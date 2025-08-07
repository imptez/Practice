package design_pattern.com.company.adapter;

import org.jetbrains.annotations.NotNull;

public class BusinessCardDesigner {

    public String designCard(@NotNull Customer customer) {
        return customer.getName() + "\n" + customer.getDesignation() + "\n" + customer.getAddress();
    }
}
