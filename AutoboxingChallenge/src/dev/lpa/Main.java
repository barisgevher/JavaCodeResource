//package dev.lpa;
//
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//
//    }
//}
//class Customer{
//    private String name;
//    private ArrayList<Double> transactions;
//
//    public Customer(String name) {
//        this.name = name;
//        this.transactions = new ArrayList<Double>();
//    }
//
//    public  void addTransaction(Double amount){
//        this.transactions.add(amount);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public ArrayList<Double> getTransactions() {
//        return transactions;
//    }
//}
//
//
//class Bank{
//    private String name;
//    private ArrayList<Customer> customers;
//
//    public Bank(String name) {
//    this.name = name;
//    this.customers = new ArrayList<Customer>();
//
//
//    }
//
//    private boolean addCustomers(Customer customer){
//        if (!customers.contains(customer)){
//            customers.add(customer);
//            return true;
//        }else{
//            return false;
//        }
//    }
//
//    private boolean addTransaction(Customer customer, Double amount) {
//        if (customers.contains(customer)){
//            customer.addTransaction(amount);
//            return true;
//        }
//        return false;
//    }
//
//
//    public void RecordsToString() {
//        for (Customer c : customers){
//            System.out.println(c.getName() +  " " + c.getTransactions());
//        }
//    }
//}
