import java.util.Scanner;
 
class Timestamps {
   public static void main(String[] args) {
 
       //Creates a new scanner for user input
       Scanner scanner = new Scanner(System.in);
 
       //Reads ints from user
       int hours1 = scanner.nextInt();
       int minutes1 = scanner.nextInt();
       int seconds1 = scanner.nextInt();
       int hours2 = scanner.nextInt();
       int minutes2 = scanner.nextInt();
       int seconds2 = scanner.nextInt();
      
       int hrToSec1 = hours1 * 3600;
       int minToSec1 = minutes1 * 60;
       int TS1 = hrToSec1 + minToSec1 + seconds1;// TS means time stamp.
       int hrToSec2 = hours2 * 3600;
       int minToSec2 = minutes2 * 60;
       int TS2 = hrToSec2 + minToSec2 + seconds2;// TS means time stamp.
 
       int Final = TS2 - TS1;
 
       System.out.print("The amount of seconds passed: " + Final);
 
       // closing the scanner object
       scanner.close();
   }
}