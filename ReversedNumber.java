import java.util.Scanner;

public class ReversedNumber{

    static int Reverse(int num){
        int reverse=0;
        while(num>0)
        {
            reverse=(reverse*10)+(num%10);
            num=num/10;
        }
        return reverse;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number you want to Reverse: ");
        int num = sc.nextInt();

        System.out.print("The reverse of "+ num+ " is "+ Reverse(num)+".");
    }
}