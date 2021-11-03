/**
 * Corey Klevan
 * Professor Ford
 * Morse Code
 * 11/02/21
 */
import java.util.*;
public class morsecode 
{
    

    public static String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
    "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
    "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
    "9", "0"};

    // String of all the letters and numbers in the english alphabet

    public static String[] morseCodes = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
    "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
    "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
    "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
    "-....", "--...", "---..", "----.", "-----"};

    // String of all the letters and numbers in morse code

    
    public static ArrayList<String> result = new ArrayList<>();

    public static void converter(HashMap<String, String> morsecode, String code, String decoded) 
    {
        
        if (code.length() == 0)
        {
            result.add(decoded);
        } // End of if
    // Everything is getting put into an array list
            

       
        for (int i = 1; i <= code.length() && i <= 10; i++) 
        {
            String tmp = code.substring(0, i);

            if (morsecode.containsKey(tmp))
            {
                converter(morsecode, code.substring(i), decoded + morsecode.get(tmp));
            } // End of if 
                
        } // End of for

    } // end of converter 

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // This makes it so the user can use any String of morse code
        String code = sc.nextLine();

        HashMap<String, String> translate = new HashMap<>();

        for (int i = 0; i < morseCodes.length; i++) 
        {
            translate.put(morseCodes[i], alphabet[i]);
        } // end of for

        // This is where the morse code will get translated
        converter(translate, code, "");

        for (String message : result)
        {
            System.out.println(message);
        } // End of for 

    } // End of main

} // End of morsecode


