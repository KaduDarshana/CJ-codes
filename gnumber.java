//find greatest number from the three input numbers
import java. util.Scanner;
class gnumber{

public static void main(String[]args){
int a,b,c,larg,temp;
Scanner sc =new Scanner(System.in);

System.out.println("Enter first no:");
a=sc.nextInt();


System.out.println("Enter second no:");
b=sc.nextInt();


System.out.println("Enter third no:");
c=sc.nextInt();

if(a>=b && a>=c){
System.out.println("a is the greatest number");
}
else if(b>=a && b>=c){
System.out.println("b is the greatest number");
}
else{
System.out.println("c is the greatest number ");
}
}
}

