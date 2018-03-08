package collections.overridingwithvariable;
 import java.util.*;
class BankAccount{
static final String Bank_Name;
static final String Branch;
static final String IFSC;

static{
Scanner scn=new Scanner(System.in);
System.out.println("Bank_Name");
Bank_Name=scn.nextLine();
System.out.println("Branch");
Branch=scn.nextLine();
System.out.println("IFSC");
IFSC=scn.nextLine();
}

static void display(){

System.out.println("Bank_Name :"+Bank_Name);
System.out.println("Branch :"+Branch);
System.out.println("IFSC :"+IFSC);
}

}
class CustomerDetails{

String CustomerName;
String AccountNumber;
}

class Bank{

public static void main(String[] args){

System.out.println("Developed by Sweta");
Scanner scn=new Scanner(System.in);
BankAccount a1=new BankAccount();
CustomerDetails c1=new CustomerDetails();
System.out.println("Customer name :");
c1.CustomerName=scn.nextLine();
System.out.println("Account number");
c1.AccountNumber=scn.nextLine();
a1.display();
System.out.println("Customer name :" +c1.CustomerName);
System.out.println("Account number :" +c1.AccountNumber);

}
}