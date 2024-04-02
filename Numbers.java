import java.util.Scanner;

public class Numbers{

public static void main(String [] args){

Scanner input = new Scanner(System.in);

int counter = 1;

int sum = 0;

while(counter <= 10){

System.out.println("Enter a number");

int numb = input.nextInt();

if(numb > 0){

sum += numb;

counter++;

}



}

System.out.println("The sum of the first ten natural numbers is " + sum);

}


}