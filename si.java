//Simple Intrest code
//By taking user input

import java.util.Scanner;
class simpleIntrest{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter principle amount:");
double principle = sc.nextDouble();

System.out.println("Enter rate on the amount:");
double rate = sc.nextDouble();

System.out.println("Enter the amount of time: ");
double time = sc.nextDouble();

double amount = principle*rate*time/100;
System.out.println("Total calculated Simple Intrest is: "+amount);
}
}

/*Another way

class si{
public static void main(String[]args){
double p,r,t,sintrest;
p=1000;
r=10;
t=2;

sintrest=p*r*t/100;

System.out.println("ANSWER IS "+ss);
}
}
*/