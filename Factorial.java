import java.util.Scanner;

public class Factorial{

public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter a number");

int number = input.nextInt();

int fac = 1;

for(int counter = 1; counter <= number; counter++ ){

 fac *= counter;


}

System.out.println("The factorial of " + number + " is " + fac);


}




}