package homework;

import java.util.AbstractMap;
import java.util.Map;
import java.util.TreeMap;

public class CustomerService {

    //todo: 3. надо реализовать методы этого класса
    //важно подобрать подходящую Map-у, посмотрите на редко используемые методы, они тут полезны
    TreeMap<Customer, String> customersToData = new TreeMap<>();

    public Map.Entry<Customer, String> getSmallest() {
        Map.Entry<Customer, String> entry = customersToData.firstEntry();
        if (entry != null) {
            Customer clonedCustomer = entry.getKey() != null ? entry.getKey().clone() : null;
            return new AbstractMap.SimpleImmutableEntry<>(clonedCustomer, entry.getValue());
        }
        return null;
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        Map.Entry<Customer, String> entry = customersToData.higherEntry(customer);
        if (entry != null) {
            Customer clonedCustomer = entry.getKey() != null ? entry.getKey().clone() : null;
            return new AbstractMap.SimpleImmutableEntry<>(clonedCustomer, entry.getValue());
        }
        return null;
    }

    public void add(Customer customer, String data) {
        customersToData.put(customer, data);
    }
}