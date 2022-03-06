import java.util.Scanner;

public class SmallestOfThree {

    static int returnSmallest(int a, int b, int c){
        int Smallest =(a>b?b:a)>c?c:(a>b?b:a);
        return Smallest;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Three Numbers: ");
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        System.out.print("The Smallest Number is "+ returnSmallest(first, second, third)+".");
    }
}
