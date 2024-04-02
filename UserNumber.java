import java.util.Scanner;

public class UserNumber{

public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter a number or -10 to exit");

int number = input.nextInt();

int counter = 1;

int largestNumber = 0;

int smallestNumber = number;

for(counter = 1; number != -10; counter++){

System.out.println("Enter a number or -10 to exit");

number = input.nextInt();

if(number > largestNumber){

largestNumber = number;

}else if(number < smallestNumber && number != -10){

smallestNumber = number;

}

}

System.out.println("The largest number entered is: " + largestNumber);

System.out.println("The smallest number entered is: " + smallestNumber);



}




}