import java.util.Scanner;

public class NumberCount{

public static void main(String [] args){

Scanner input = new Scanner(System.in);

int counter = 0;

int positive = 0;

int negative = 0;

int userNumber = 0;

while(userNumber != -1){

System.out.println("Enter a number or enter -1 to stop");

userNumber = input.nextInt();

if(userNumber > 0){

positive++;

}else if(userNumber < 0 && userNumber != -1){

negative++;

}else if (userNumber == 0){

counter++;

}


}

System.out.println("The total count of positive numbers is " + positive);

System.out.println("The total count of negative numbers is " + negative);

System.out.println("The total count of zero numbers is " + counter);


}



}