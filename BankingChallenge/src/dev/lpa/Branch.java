package dev.lpa;
//
//import java.util.ArrayList;
//public class Branch {
//    private String name;
//    private ArrayList<Customer> customers;
//
//    public Branch(String name){
//        this.name = name;
//        this.customers = new ArrayList<Customer>();
//    }
//
//    public String getName(){
//        return this.name;
//    }
//
//    public ArrayList<Customer> getCustomers(){
//        return this.customers;
//    }
//
//    public boolean newCustomer(String name, double initialTransaction){
//        if (findCustomer(name) == null){
//            customers.add(new Customer(name));
//            return true;
//        } else{
//            return false;
//        }
//    }
//
//    public boolean addCustomerTransaction(String name, double transaction){
//        for (Customer customer : getCustomers()){
//            if (customer.getName() == name){
//                customer.addTransactions(transaction);
//                return true;
//            }
//        }
//        return  false;
//    }
//
//    private Customer findCustomer(String name){
//        for (Customer customer : customers ) {
//            if (customer.getName() == name){
//                return customer;
//            }
//        }
//        return null;
//    }
//
//
//
//
//
//
//
//
//
//
//
//}
import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount) {

        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {

        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {

        for (int i = 0; i < customers.size(); i++) {
            Customer checkedCustomer = customers.get(i);
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}



