package dev.lpa;//package dev.lpa;
//
//import java.util.ArrayList;
//public class Bank {
//    private String name;
//    private ArrayList<Branch> branches;
//
//    public Bank(String name){
//        this.name = name;
//        this.branches = new ArrayList<Branch>();
//    }
//
//    public boolean addBranch(String branchName){
//        if(findBranch(branchName) == null){
//            branches.add(new Branch(branchName));
//            return true;
//        }else{
//            return false;
//        }
//    }
//
//    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
//        return false;
//    }
//
//
//
//    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
//        return false;
//    }
//
//    private Branch findBranch(String branchName){
//        for(Branch branch : branches){
//            if (branch.getName() == branchName){
//                return branch;
//            }
//        }
//        return null;
//    }
//
//    public boolean listCustomers(String branchName, boolean printTransactions){
//        Branch returnedBranch = new Branch("zero");
//        for (Branch branch : branches){
//            if (branch.getName() == branchName){
//                returnedBranch = branch;
//            }
//        }
//        System.out.println("-".repeat(30));
//        System.out.println("Customer Name: " + );
//        System.out.println("Transactions:");
//        for (double d : ){ // unboxing
//            System.out.printf("$%10.2f (%s)%n",d, d < 0 ? "debit" : "credit");
//        }
//    }
//
//}

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {

        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {

        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {

        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {

        for (int i = 0; i < branches.size(); i++) {
            Branch checkedBranch = branches.get(i);
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {

        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}