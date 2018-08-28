import java.util.*;

public class Encoding
{
   
   public static Set<String> morseCodes(int dots, int dashes) {
   
      Set<String> result = new TreeSet<>();
      String morseCode = stringBuilder(dots, dashes);
      recursion(result, morseCode, "");
      result.add(morseCode);
      return result;
   }
   
   public static void recursion(Set<String> result, String swap, String start) {
    int l = swap.length();
    if (l == 0) {
       
       result.add(start);
    }
    
    else {
       
        for (int i = 0; i < l; i++) {
           
           recursion(result, swap.substring(0, i) + swap.substring(i + 1, l), start + swap.charAt(i));
        }
    }
   }
   
    public static String stringBuilder(int dots, int dashes) {
       String morse = "";
       for(; dots > 0; dots--) {
          morse = morse + ".";
       }
       for(; dashes > 0; dashes--) {
          morse = morse + "-";
       }
       return morse;
    }
}
