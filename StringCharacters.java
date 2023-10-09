import java.util.*;
public class StringCharacters {
public static void main(String[] args)
    {
        String text = "To be or not to be, that is the question;"
        +"Whether `tis nobler in the mind to suffer"
        +" the slings and arrows of outrageous fortune,"
        +" or to take arms against a sea of troubles,"
        +" and by opposing end them?";
        String a=text.toLowerCase();
        ArrayList<String> count= new ArrayList<>();
        String[] s=a.split("");
        int vowels=0;
        int letters=0;
        int spaces=0;
        for(String i:s)
        {
            count.add(i);
        }
        String[] vowel_letters="aeiou".split("");
        for(String i: count)
        {
            for(String j:vowel_letters)
                {
                if(i.equals(j))
                {
                    vowels=vowels+1;
                    break;
                }
                }
            if(i.equals(" "))
                spaces=spaces+1;
            else
                letters=letters+1;
                }
             System.out.println("The text contained vowels: " + vowels + "\n"+ "consonants:" + letters + "\n"+ "spaces:"+spaces);  
    }
         
}