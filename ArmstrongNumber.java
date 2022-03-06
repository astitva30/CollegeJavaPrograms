import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {

    static int Digits(int num){
        int digits=0;
        while(num>0){
            num=num/10;
            digits++;
        }
        return digits;
    }
    static void checkArmstrong(int num){
        int temp=num;
        double sum=0;
        while(temp>0){
            int digit=temp%10;
            temp=temp/10;
            sum=sum+Math.pow(digit,Digits(num));
        }
        if(sum==num){
            System.out.println(num+ " is a Armstrong number.");
        }
        else{
            System.out.println(num +" is not a Armstrong number.");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number you want to check: ");
        int num = sc.nextInt();
        if(num>0){
            checkArmstrong(num);
        }
        else{
            System.out.print("Enter a positive number.");
        }
    }
}