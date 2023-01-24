package homework;


import java.util.*;

public class CustomerReverseOrder {

    //todo: 2. надо реализовать методы этого класса
    //надо подобрать подходящую структуру данных, тогда решение будет в "две строчки"
    ArrayDeque<Customer> customerList = new ArrayDeque<>();

    public void add(Customer customer) {
        customerList.offerFirst(customer);
    }

    public Customer take() {
        return customerList.poll();
    }
}