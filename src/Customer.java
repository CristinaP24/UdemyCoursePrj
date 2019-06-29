import java.util.ArrayList;

public class Customer {
    //a. make fileds name, array transaction
    //b. constructor 2 param: name, initial transaction
    //c. mechanism to add and store transactions in ArrayList = method with add prop and autoboxing
    //d. initialize  array transaction in constructor
    //e. make getters for fields


    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);//autoboxing
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
