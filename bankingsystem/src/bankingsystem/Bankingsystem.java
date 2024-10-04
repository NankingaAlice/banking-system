package bankingsystem;

public class Bankingsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method 
class BankAccount{String holder;double balance;
BankAccount(String h,double b){holder = h; balance = b;}
void display()
{System.out.println(holder + ":"+ balance);}}
	{BankAccount[] accounts = {new
			BankAccount("Alice",500),new
			BankAccount("Bob",300)};for
			(BankAccount acc : accounts)
			{acc.balance +=100;
			acc.balance -=50;
			acc.display();
			}
	}

}
	}

