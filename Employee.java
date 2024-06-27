//develop a java code to build employee code ,taking input from user(name,basicsalary,withdraw amount,and then 
//print remaining amount)after that add tax to the program where if the salary is less than 25000 then dont add tax
// but if the amount is greater than 25000 then add 10% tax cutting

import java.util.Scanner;

class Employee{
public static void main(String[]args){
String ename;
double basicsalary;
double withdraw;
double remaining;


Scanner sc = new Scanner(System.in);

System.out.print("Enter name: ");
ename = sc.next();

System.out.print("Enter salary:");
basicsalary = sc.nextDouble();

System.out.print("Withdraw amount:");
withdraw = sc.nextDouble();

remaining = basicsalary - withdraw;
System.out.println("REMAINING SAL IS:"+remaining);

if(basicsalary>25000){
double tax=0.1*basicsalary;
System.out.print("tax amount:+tax");
remaining= basicsalary - withdraw - tax;
System.out.println("REMAINING SAL IS:"+remaining);
}
else{
remaining = basicsalary - withdraw;
System.out.println("REMAINING SAL IS:"+remaining);
}

}
}



