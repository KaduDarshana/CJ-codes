import java.util.Scanner;
class arithmetic{
public static void main(String[]args){
int x,y,add,sub,mul,div;
Scanner sc =new Scanner(System.in);
System.out.println("Enter first number ");
    x= sc.nextInt();

System.out.println("Enter another number:");
    y = sc.nextInt(); // Read user input

int sum= x + y;  // Calculate the sum of x + y
System.out.println("Addition  is: " + sum); 

int minus= x - y;  // Calculate the sum of x + y
System.out.println("substraction is: " + minus);

int product= x * y;  // Calculate the sum of x + y
System.out.println("Multiplication is: " + product); 

int divide= x % y;  // Calculate the sum of x + y
System.out.println("Division is: " + divide); 

  }
} 
