package task;

import model.Auction;
import model.Customer;

import java.util.*;

public class CreateTaskSubjectService {

    private List<Customer> customers = new ArrayList();
    public CreateTaskSubjectService(){

    }
    public void registerCustomer(Customer customer){
        customers.add(customer);
    }
    public void unregisterCustomer(Customer customer){
        customers.remove(customer);
    }
    public void notifyCustomers(Task task, Auction item){
        customers.forEach(o -> o.update(task));
    }
}
