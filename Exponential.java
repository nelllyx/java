import java.util.Scanner;
	
public class Exponential{

public static void main(String [] args){

Scanner input = new Scanner(System.in);

int counter = 1;

System.out.println("Enter a number: ");

int firstNumb = input.nextInt();

System.out.println("Enter another number: ");

int secondNumb = input.nextInt();

int expo = firstNumb;

while(counter < secondNumb){

expo *= firstNumb;

counter++;

}

System.out.println("The exponential value between the first number and second number is " + expo);








}






}
