import java.util.Scanner;
class ci{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter principle:");
double principle = sc.nextDouble();

System.out.println("Enter rate: ");
double rate = sc.nextDouble();

System.out.println("Enter Time in years");
double time = sc.nextDouble();

System.out.println("Enter the number of times the intrest is coumpoundes:");
double number = sc.nextDouble();


double amount = principle * (Math.pow((1+rate/100),(time * number))) - principle;
System.out.println("principle:"+principle);
System.out.println("Intrest Rate:"+rate);
System.out.println("Amount of time:"+time);
 System.out.println("Number of Time interest Compounded: " + number);
System.out.println("compound Intrest:"+amount);
}
}