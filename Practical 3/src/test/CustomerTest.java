package test;

import domain.Customer;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customer1 = new Customer();
        Customer customer2 = new Customer(2, 2000, false);

        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();

        customer1.setID(-3);
        customer1.setTotal(-3000);
        customer1.setIsNew(false);

        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();

    }

}
