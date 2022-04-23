/* Nathan Lesny
*  CaesarCypherDriver
*/

import java.util.Scanner;
public class CaesarCypherDriver
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("What would you like your message to be? -> ");
      String message = scan.nextLine();
      System.out.print("By how much, and what direction would you like to shift your message? (- for left, + for right)-> ");
      int amt = scan.nextInt();
      cypher caesar = new cypher(amt, message);
      System.out.println("Your coded message:");
      System.out.println(caesar.codeMessage());
   }
}

/* TEST DATA

    ----   Hit any key to start.
What would you like your message to be? -> Dealer.com is very cool!
By how much, and what direction would you like to shift your message? (- for left, + for right)-> 7
Your coded message:
klhsly.jvt pz clyf jvvs!

 ----   Hit any key to continue.

 ----   Hit any key to start.
What would you like your message to be? -> I love dealer.com so much!
By how much, and what direction would you like to shift your message? (- for left, + for right)-> -10
Your coded message:
y belu tuqbuh.sec ie cksx!

 ----   Hit any key to continue.


*/