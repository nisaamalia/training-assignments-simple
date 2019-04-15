package eu.sig.training.ch04;

// tag Savings Account
public class SavingsAccount extends Account {
    private CheckingAccount registeredCounterAccount;

    public Transfer makeTransfer(String counterAccount, Money amount) 
        throws BusinessException {
        Transfer result = super.makeTransfer(counterAccount, amount);
        if (result.getCounterAccount().equals(this.registeredCounterAccount)) {
        	return result;
        } else {
        	throw new BusinessException("Counter-account not registered");
        }
   	}
}
// end Savings Account
