import java.util.Scanner;

public class PrimeNumber {

    static void checkPrimeNumber(int num){
        int fact=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                fact++;
            }
        }
        if(fact==2){
            System.out.print(num+" is a Prime Number.");
        }
        else{
            System.out.print(num+ " is not a Prime Number.");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the number you want to check: ");
        int num = sc.nextInt();
        
        checkPrimeNumber(num);
    }
}
