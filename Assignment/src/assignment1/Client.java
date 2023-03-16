package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public String name;
    public String age;
    public int number_client;
    public static int next_client=0;
    private ArrayList<Account> account;
    



    public Client(String name, String age) {
        this.name=name;
        this.age=age;
        next_client++;
        this.number_client=next_client;
        this.account=new ArrayList<>();
        Scanner vl = new Scanner(System.in);
    	System.out.println("Enter your name");
    	String lname = vl.nextLine();
    	System.out.println("the name is :" + lname);
    	vl.close();
    	
    	Scanner ob = new Scanner(System.in);
    	System.out.println("Enter your age");
    	String theage = ob.nextLine();
    	System.out.println("The age is :" + theage);
    	ob.close();
    	
    	Scanner v2 = new Scanner(System.in);
    	System.out.println("Enter your amount of deposit");
    	String amount = v2.nextLine();
    	System.out.println("the amount is :" + amount);
    	vl.close();
    	
    }


    public String getName() {
        return this.name;
    }


    public String getage() {
        return this.age;
    }
    

    public int getNum_client() {
        return this.number_client;
    }

    public void add_account(Account d)
    {
        this.account.add(d);
    }



}

