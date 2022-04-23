/* Nathan Lesny
*  Caesar Cypher
*/

public class cypher
{

//Instance Data
   private int shiftAmt;
   private String message;
   private String shiftedAlph;
      
   public cypher(int amt, String msg)
   {
      shiftAmt = amt;
      message = msg.toLowerCase();
      String tempAlph = "abcdefghijklmnopqrstuvwxyz";  
      shiftedAlph = new String("");
      
      for(int i = 0; i < tempAlph.length(); i++)
      {
         char temp = tempAlph.charAt(i);
         char newChar = (char)(temp + amt);
         if((newChar - 97) > 25)
            newChar -= 26;
         if((newChar - 97) < 0)
            newChar += 26;
         shiftedAlph += newChar;
      }
   }
   
   public int getShift()
   {
      return shiftAmt;
   }
   
   public String getShiftedAlph()
   {
      return shiftedAlph;
   }
   
   public String getOrgMessage()
   {
      return message;
   }
   
   public String codeMessage()
   {
      String alphabet = "abcdefghijklmnopqrstuvwxyz";
      String codedMsg = new String();
      
      for(int i = 0; i < message.length(); i++)
      {
         char tempChar = message.charAt(i);
         int index;
         if((int)tempChar <= 122 && (int)tempChar >= 97)
         {
            index = alphabet.indexOf(tempChar);
            tempChar = shiftedAlph.charAt(index);
         }
         codedMsg += tempChar;
      }
      return codedMsg;
   }
}