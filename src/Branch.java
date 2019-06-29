import java.util.ArrayList;

public class Branch {

    //a. make fields: string name, array list for customer list for each branch
    //b. make constructor 2 param: string name, initialize array list
    //c. make getter for name (want to show name on screen)
    //d. add customer but check if it is there 0 make boolean to return false if the customer is already on file
    //e. if find customer - if no - it's not on file so you need to add it
    //f. check if a transaction is added on file, if not, return false - can't add a transaction to unexistant customer
    //g. make findCustomer met.: private met because it is used internally, no need to be seen by others
    //  findCustomer = constructor that calls Customer class, go through arrayList of customers with for


    private String branch;
    private ArrayList<Customer> customers;

    public Branch(String branch) {
        this.branch = branch;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return branch;
    }


    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true; //successfully added the new customer
        }
        return false; //customer here, cannot add
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) { //something has been returned, it exists on file
            //get existing cutomer record and update it by adding amount to transaction
            existingCustomer.addTransaction(amount); //update the amount in existing customer, call addTransaction met from Customer class
            return true; //if transaction added
        }
        return false; //if it is not on file
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer; //found customer on file
            }
        }
        return null; //customer not on file

    }







}
