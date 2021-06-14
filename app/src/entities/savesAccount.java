package entities;

public final class savesAccount extends Account {
	private Double interesRate;

	public savesAccount() {
		super();
	}

	public savesAccount(Integer number, String holder, Double balance, Double interesRate) {
		super(number, holder, balance);
		this.interesRate = interesRate;
	}

	public Double getInteresRate() {
		return interesRate;
	}

	public void setInteresRate(Double interesRate) {
		this.interesRate = interesRate;
	}
	
	public void updateBalance() {
		balance += balance * interesRate;
		
	}
	
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
		
	}
	
	
}
