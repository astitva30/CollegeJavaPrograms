import java.util.Scanner;
public class FibonacciSeries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many terms you want to print: ");
        int num = sc.nextInt();
        int first=0;
        int second=1;
        int sum=0;
        for(int i=0;i<num;i++){
            System.out.print(sum+"\t");
            first=second;
            second=sum;
            sum=first + second;
        }
    }
}