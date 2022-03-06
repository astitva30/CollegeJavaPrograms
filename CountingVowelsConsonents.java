import java.util.*;

public class CountingVowelsConsonents {

    static int countVowels(String str){
        char[] a = new char[str.length()];
        //copying string a into character array str character by character
        for(int i=0;i<a.length;i++){
            a[i]=str.charAt(i);
        }
        int vowel=0,i=0;
        while(i!=str.length())
        {
            if((a[i]>=65 && a[i]<=90) || (a[i]>=97 && a[i]<=122))
            {
                if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' || 
                a[i]=='A' || a[i]=='E' || a[i]=='I' || a[i]=='O' || a[i]=='U')
                vowel++;
            }
            i++;
        }
        return vowel;
    }
    static int countConsonents(String str){
        char[] a = new char[str.length()];
        //copying string a into character array str character by character
        for(int i=0;i<a.length;i++){
            a[i]=str.charAt(i);
        }
        int consonent=0,i=0;
        while (i!=str.length())
        {
            if((a[i]>=65 && a[i]<=90) || (a[i]>=97 && a[i]<=122))
            {
                if(a[i]!='a' && a[i]!='e' && a[i]!='i' && a[i]!='o' && a[i]!='u' && 
                a[i]!='A' && a[i]!='E' && a[i]!='I' && a[i]!='O' && a[i]!='U')
                consonent++;
            }
            i++;
        }
        return consonent;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String string = sc.nextLine();

        System.out.print("There are "+countVowels(string)+ " vowels and "+countConsonents(string)+" consonents in "+string+ " .");
    }
}
