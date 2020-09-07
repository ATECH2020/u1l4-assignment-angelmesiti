import java.util.Scanner;
 
class SecondsPastMidnight {
   public static void main(String[] args) {
 
       //Creates a new scanner for user input
       Scanner scanner = new Scanner(System.in);
 
       //Reads int from user
       int number = scanner.nextInt();
       int hours = number / 3600;
       int minutes = number / 60;
       System.out.print(hours + " " + minutes);
 
       //Your code goes here
 
 
       // closing the scanner object
       scanner.close();
   }
}