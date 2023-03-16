package assignment1;


public class Account {
	 private int number;
	    public static int next_account=1000;
	    private Client client;
	    private int value_max_autorised;
	    private int overdraft;
	    private int balance;
	    private int nb_transaction;

	    public Account(Client client, int max, int overdraft) {
	        next_account++;
	        this.balance=0;
	        this.nb_transaction=0;
	        this.number = next_account;
	        this.client = client;
	        this.value_max_autorised=max;
	        this.overdraft=overdraft;
	    }

	    public int getNumber() {
	        return this.number;
	    }

	    public Client getClient() {
	        return this.client;
	    }

	    public boolean depositing_possible(int amount)
	    {
	        return amount<=this.value_max_autorised;
	    }

	    public boolean withdrawal_possible(int amount)
	    {
	        return this.balance-amount>=-1*this.overdraft;
	    }

	    public void depositing(int amount)
	    {
	        if(depositing_possible(amount)) {
	            this.balance+=amount;
	            this.nb_transaction++;
	        }
	        else {
	            System.out.println("impossible");
	        }

	    }

	    public void withdrawal(int amount)
	    {
	        if(withdrawal_possible(amount)) {
	            this.balance-=amount;
	            this.nb_transaction++;
	        }
	        else {
	            System.out.println("The transaction is impossible");
	        }
	    }

	    
	    public void Transaction(Account d, int amount )
	    {
	        if(this.withdrawal_possible(amount) && d.depositing_possible(amount))
	        {
	            this.withdrawal(amount);
	            d.depositing(amount);
	        }
	    }

	    public String toString()
	    {
	        String str= "Account of "+this.client.getName()+" "+this.client.getage();
	        str+="\r\n";
	        str+="Balance : "+this.balance;
	        str+="\r\n";
	        str+="numbre of transactions in this account : "+this.nb_transaction;
	        str+="\r\n";
	        return str;

	    }



}
