//write a program in java to find even and odd between two numbers.

import java.util.Scanner;
class number{
public static void main(String[]args){
int num1;

Scanner sc = new Scanner(System.in);

System.out.println("Enter first no:");
num1 = sc.nextInt();


if(num1%2==0){
  System.out.println("Even");
  }
else{
  System.out.println("ODD");
  }
 }
}
