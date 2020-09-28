import java.util.Scanner;
public class main {
public static void main(String[] args) {
Account ob1 = new Account("Mahtab", "1001");
ob1.ShowMenu();
}
}
class Account
{
int Balance;
int pre_transaction;
String cust_name;
String cust_id;
 Account(String c_name ,String C_id) //create constructor
{
 int card_number;
 String pin;
Scanner s2 = new Scanner(System.in);
// System.out.println("Enter your card number ");
// card_number = s2.nextInt();
System.out.println("Enter your pin number ");
pin = s2.next();
if(pin.equals("1234"))
{
ShowMenu();
}
else
{
System.out.println("please enter valid number");
}
 this.cust_name= c_name;
 this.cust_id =C_id;
}
void deposit(int amt)
{
if(amt!=0)
{
Balance = Balance+amt;
pre_transaction=amt;
}
}
void withdrawl(int amt)
{
if(amt!=0)
{
Balance= Balance-amt;
pre_transaction= -amt;
}
}
void getpre_transactio()
{
if(pre_transaction>0)
{
System.out.println("Deposited"+pre_transaction);
}
else if(pre_transaction<0) {
System.out.println("Withdrwal"+Math.abs(pre_transaction));
}
else
{
System.out.println("no transaction ");
}
}
void ShowMenu()
{
int ch;
Scanner s = new Scanner(System.in);
System.out.println("WELCOME TO KMN ATM");
System.out.println("Welcome "+this.cust_name);
System.out.println("\n\n\n\n");
System.out.println("1 Check Balance");
System.out.println("2 Deposit");
System.out.println("3 Withdrawl");
System.out.println("4 Previous Transaction");
System.out.println("5 Exit");
do
{
System.out.println("---------------------------------------");
System.out.println("select your option");
System.out.println("---------------------------------------");
ch = s.nextInt();
System.out.println("\n\n\n");
switch(ch)
{
case 1:
System.out.println("------------------------------------");
System.out.println(" Your account balance is ="+Balance);
System.out.println("------------------------------------");
System.out.println("\n");
break;
case 2:
System.out.println("------------------------------------");
System.out.println("Enter Amount to Deposit");
System.out.println("------------------------------------");
int amt= s.nextInt();
deposit(amt);
break;
case 3:
System.out.println("------------------------------------");
System.out.println("Enter Amount to Withrawl");
System.out.println("------------------------------------");
int amt1 = s.nextInt();
withdrawl(+amt1);
System.out.println("\n\n");
break;
case 4 :
System.out.println("------------------------------------");
getpre_transactio();
System.out.println("------------------------------------");
System.out.println("\n\n");
break;
case 5:
System.out.println("------------------------------------");
break;
default:
System.out.println("invalid option!! Enter again ");
break;
}
System.out.println("Do you want to transaction again");
}
while(ch!=5);
System.out.println("------------------------------------");
System.out.println("THANK YOU FOR USING OUR ATM---------");
}
}