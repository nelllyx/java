import java.util.Scanner;

public class DoWhile{

public static void main(String [] args){

Scanner input = new Scanner(System.in);

String answer = "yes";

int counter = 1;


do{

System.out.println("Enter a number");

int number = input.nextInt();

System.out.println("Enter another number");

int secondNumber = input.nextInt();

int sum = number + secondNumber;

System.out.println("The sum of numbers is " + sum);

if(answer.equals("yes")){

System.out.println("Do you want to go again?");

answer = input.next();

counter++;

}else{

System.out.println("Thank you");

}


}



while(answer.equals("yes"));


}



}