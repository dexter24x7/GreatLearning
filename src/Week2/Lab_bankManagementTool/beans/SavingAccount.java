package Week2.Lab_bankManagementTool.beans;

public class SavingAccount extends Account{
    private final double interest = 0.07;
    @Override
    public double getInterest() {
        return interest;
    }
}
