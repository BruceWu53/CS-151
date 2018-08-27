public class Strings
{
   public static String uniqueLetters(String str)
   {
      String uniqueString = "";
      int repeatLetter = 0;
      for(int i = 0; i < str.length(); i++) {
         for(int counter = 0; counter < str.length(); counter++) {
            if (counter != i) {
            if (str.charAt(i) == str.charAt(counter)) {
               repeatLetter++;
            }
            }
         }
         if(repeatLetter == 0) {
            uniqueString += str.charAt(i);
         }
         repeatLetter = 0;
      }
      return uniqueString;
}
}
