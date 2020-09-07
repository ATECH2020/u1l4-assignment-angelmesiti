import java.util.Scanner;
class StudentDesks {
  public static void main(String[] args) {
      //Creates a new scanner for user input
      Scanner scanner = new Scanner(System.in);
      //reads int from user
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();
    
      int classA;
      int classB;
      int classC;
            /*
          *  your code goes here
          */
          if (a % 2 == 1){
            a = a + 1;
          }
          if (b % 2 == 1){
            b = b + 1;
          }
          if (c % 2 == 1){
            c = c + 1;
          }
          classA = a/2;
          classB = b/2;
          classC = c/2;
 
          System.out.print(classA + classB + classC);
        // closing the scanner object
      scanner.close();
  }
}
