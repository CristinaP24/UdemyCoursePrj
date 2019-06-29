import java.util.ArrayList;

//validate specific things in specific areas, don't validate everything in one place/class
public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName); //check to see if branch exists
        if (branch != null) { //check to see if branch exists and then if customer added to Branch class
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;//didn't store customer
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) { //the branch was found, call the code to do next: add transaction
            return branch.addCustomerTransaction(customerName, amount);//we call code in Branch to separate
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranche = this.branches.get(i);
            if (checkedBranche.getName().equals(branchName)) {
                return checkedBranche; //found customer on file
            }
        }
        return null; //customer not on file
    }
    public boolean listCustomers (String branchName, boolean showTransaction){
        Branch branch = findBranch(branchName);
        if(branch !=null){
            System.out.println("Customers for branch "+branch.getName());
        }
        return false;

        ArrayList <Customer> branchCustomers = branch.getCustomers();


    }




}
