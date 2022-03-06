import java.util.*;

public class PalindromeNumber {

    static void checkPalindrome(int num){
        int reverse=0;
        int i=num;
        while(i>0)
        {
            reverse=(reverse*10)+(i%10);
            i=i/10;
        }
        if(reverse==num){
            System.out.print(num+" is a Palindrome Number.");
        }
        else{
            System.out.print(num+ " is not a Palindrome Number.");
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
    
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
    
        checkPalindrome(num);
    }
}
