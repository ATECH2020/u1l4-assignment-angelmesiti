import java.util.Scanner;
 
class AnalogClock {
   public static void main(String[] args) {
 
       //Creates a new scanner for user input
       Scanner scanner = new Scanner(System.in);
 
       //Reads ints from user
       int hourHand = scanner.nextInt();
 
       int hours = hourHand / 30;
       int degreesPast = hours * 30;
       int minPast = hourHand - degreesPast;//gets leftover  min.
       int degreeMinHand = minPast * 2; 
       degreeMinHand = degreeMinHand * 6;//moves 6 degrees a min
       System.out.print(degreeMinHand);
       // closing the scanner object
       scanner.close();
   }
}

